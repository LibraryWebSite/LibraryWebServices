package lexicon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Book implements java.io.Serializable {
	
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long bookID;
   @NotNull
   @NotEmpty
   private String isbn;
   @NotNull
   @NotEmpty
   private String title;
   @NotNull
   @NotEmpty
   private String typeOfBook;
   @NotNull
   @NotEmpty
   private String physicalPosition;
   @NotNull
   @NotEmpty
   private String author;
   private boolean available;
   @NotNull
   @NotEmpty
   private String borrower;
  
   



public Book() {}



public Book(String isbn, String title, String typeOfBook, String physicalPosition, String author, boolean available, String borrower) {
	super();
	
	this.isbn = isbn;
	this.title = title;
	this.typeOfBook = typeOfBook;
	this.physicalPosition = physicalPosition;
	this.author = author;
	this.borrower = borrower;
	this.available = available;
}

public String getBorrower() {
	return borrower;
}



public void setBorrower(String borrower) {
	this.borrower = borrower;
}



public boolean isAvailable() {
	return available;
}


public void setAvailable(boolean available) {
	this.available = available;
}
public long getBookID() {
	return bookID;
}


public void setBookID(Long bookID) {
	this.bookID = bookID;
}


public String getISBN() {
	return isbn;
}


public void setISBN(String iSBN) {
	isbn = iSBN;
}


public String getTitle() {
	return title;
}


public void setTitle(String title) {
	this.title = title;
}


public String getTypeOfBook() {
	return typeOfBook;
}


public void setTypeOfBook(String typeOfBook) {
	this.typeOfBook = typeOfBook;
}


public String getPhysicalPosition() {
	return physicalPosition;
}


public void setPhysicalPosition(String physicalPosition) {
	this.physicalPosition = physicalPosition;
}


public String getAuthor() {
	return author;
}


public void setAuthor(String author) {
	this.author = author;
}


@Override
	public String toString() {
		return title;
	}


}
