package lexicon.model.services;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import lexicon.model.Book;

public class BookServices {

	@Inject
	private EntityManager em;
	
	public List<Book> getAllBooks(){
		Query q = em.createQuery("SELECT b FROM Book b");
		
		return q.getResultList();
	}
}
