package hibernate.mapping.manytomany.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.mapping.manytomany.enity.Author;
import hibernate.mapping.manytomany.enity.Book;
import hibernate.mapping.manytomany.factroy.SessionfactroyInstance;

public class SaveBookObject {

	public void saveBooks() {
		
		Book book = new Book();
		book.setBookId(101);book.setBookName("Java Head First");
		
			     List<Author> list = new ArrayList<>();
			     Author a1=new Author();a1.setAuthorId(1);a1.setAuthorName("Ravi");
			     Author a2=new Author();a2.setAuthorId(2);a2.setAuthorName("Suresh");
			     list.add(a1);list.add(a2);
	   
	     book.setAuthors(list);
	     
	   
	   Session session = SessionfactroyInstance.getSessionfactrFactory().openSession();
	   Transaction tx = session.beginTransaction();
	   session.save(book);
	   tx.commit();
	   session.close();
		
	}
}
