package lexicon.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Loan.class)
public abstract class Loan_ {

	public static volatile SingularAttribute<Loan, Date> returnDate;
	public static volatile SingularAttribute<Loan, String> book;
	public static volatile SingularAttribute<Loan, Date> dueDate;
	public static volatile SingularAttribute<Loan, String> member;
	public static volatile SingularAttribute<Loan, Long> loanID;
	public static volatile SingularAttribute<Loan, Date> startDate;

}

