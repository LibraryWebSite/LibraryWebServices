package lexicon.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Member.class)
public abstract class Member_ {

	public static volatile SingularAttribute<Member, String> firstName;
	public static volatile SingularAttribute<Member, String> address;
	public static volatile SingularAttribute<Member, String> phoneNumber;
	public static volatile ListAttribute<Member, Book> books;
	public static volatile SingularAttribute<Member, String> surName;
	public static volatile SingularAttribute<Member, String> gender;
	public static volatile SingularAttribute<Member, String> email;
	public static volatile SingularAttribute<Member, Long> memberID;

}

