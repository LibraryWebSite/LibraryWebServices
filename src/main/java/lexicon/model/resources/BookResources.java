package lexicon.model.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import lexicon.model.Book;
import lexicon.model.services.BookServices;




@Path("/book")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookResources {

	BookServices bs = new BookServices();
	
	@POST
	public List<Book> addBooks(){
	return bs.getAllBooks();
	}

}
