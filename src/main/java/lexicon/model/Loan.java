package lexicon.model;



import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Loan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long loanID;
	
	@NotNull
	private String book;
	
	@NotNull
	private String member;
	
	private Date startDate;
	
	private Date dueDate;
	
	private Date returnDate;
	
	public Loan() {}
	
	public Loan(String book, String member) {
		super();
		this.book = book;
		this.member = member;	
		this.startDate = new Date();
		
	
		
		GregorianCalendar gc = new GregorianCalendar();
		gc.add(GregorianCalendar.DAY_OF_MONTH, 15);
				
		this.dueDate =gc.getTime();
	}
	
	public Date getStartDate() {
		return startDate;
	}

	public String getBook() {
		return book;
	}


	public String getMember() {
		return member;
	}


	public Date getDueDate() {
		return dueDate;
	}

	
	public void returnBook() {
		returnDate = new Date();
	}

}
