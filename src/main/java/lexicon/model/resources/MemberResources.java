package lexicon.model.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import lexicon.model.Book;
import lexicon.model.Loan;
import lexicon.model.Member;
import lexicon.model.services.MemberServices;

@Path("/member")
public class MemberResources {

	@Inject
	MemberServices mr;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addMember(Member member) throws URISyntaxException {

		 mr.addMember(member);
		 return Response.created(new URI("http://localhost:8080/LibraryWebServices/rest/member")).build();
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Member> getAllMember(){
		return mr.getAllMember();
	}
	
	
	@POST
	@Path("/{memberID}")
	public Response loanBook(@PathParam("memberID") long memberID, Book book) throws URISyntaxException {
		
		mr.loanBook(memberID, book);
	
		return Response.created(new URI("http://localhost:8080/LibraryWebServices/rest/member")).build();
		}
	
	

}
