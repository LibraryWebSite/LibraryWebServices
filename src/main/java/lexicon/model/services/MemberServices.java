package lexicon.model.services;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.ws.rs.NotFoundException;

import lexicon.model.Book;
import lexicon.model.Loan;
import lexicon.model.Member;
import lexicon.model.gender.Gender;

@Stateless
public class MemberServices {
	
	@Inject
	EntityManager em;
	
	@Inject Logger logger;
	
	public List<Member> getAllMember() {
		Query q = em.createQuery("SELECT m FROM Member m");
		return q.getResultList();
		
	}
	

	public void addMember(Member member) {
		em.persist(member);
	}
	
    public Book findById(long bookID) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Book> criteria = cb.createQuery(Book.class);
        Root<Book> book = criteria.from(Book.class);
        // Swap criteria statements if you would like to try out type-safe criteria queries, a new
        // feature in JPA 2.0
        // criteria.select(member).where(cb.equal(member.get(Member_.name), email));
        criteria.select(book).where(cb.equal(book.get("bookID"), bookID));
        return em.createQuery(criteria).getSingleResult();
    }

	public void loanBook(long memberID , Book book){	
		
		Query q = em.createQuery("select b from Book b where b.bookID = :memberID");
		q.setParameter("memberID", memberID);
		List<Book> bk = q.getResultList();
		logger.log(Level.WARNING, bk.toString());
		Member member = em.find(Member.class, memberID);	
		if(bk.isEmpty()) {	
		if(member == null){
			
			logger.log(Level.INFO, "member is not available");
		}
		book.setBorrower(member.getFirstName());
		Loan loan = new Loan(book.getTitle(), member.getFirstName());
		loan.getDueDate();
		loan.getStartDate();					
			member.getBooks().add(book);
			book.setAvailable(false);
			em.persist(member);	
			em.persist(loan);
			
		
		
//		//Query q = em.createQuery("select b from Book b where b.memberID = :memberID");
//		//q.setParameter("memberID", mId);
//		List<Book> bk = q.getResultList();
//		
//		for(Book bb : bk) {
//			logger.log(Level.WARNING, bb.toString());
//			//System.out.println(bb);
//			
//		}
	
					
		
		}else {
			logger.log(Level.INFO, "Book is not available");
		}
		
	}
}
	

