package lexicon.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Book.class)
public abstract class Book_ {

	public static volatile SingularAttribute<Book, String> physicalPosition;
	public static volatile SingularAttribute<Book, String> author;
	public static volatile SingularAttribute<Book, String> isbn;
	public static volatile SingularAttribute<Book, Boolean> available;
	public static volatile SingularAttribute<Book, String> borrower;
	public static volatile SingularAttribute<Book, String> title;
	public static volatile SingularAttribute<Book, String> typeOfBook;
	public static volatile SingularAttribute<Book, Long> bookID;

}

