package lexicon.model.resources;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import lexicon.model.Loan;


@Path("/")
public class LoanResources {
	@Inject 
	EntityManager em;
	
//	@GET
//	@Consumes(MediaType.TEXT_PLAIN)
//	public String test() {
//		return "loaan resources";
//	}
	
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public void addLoan(Loan loan) {
	  em.persist(loan);
  }
}
