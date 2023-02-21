package hibernate.mapping.manytomany.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.mapping.manytomany.enity.Author;
import hibernate.mapping.manytomany.enity.Book;
import hibernate.mapping.manytomany.factroy.SessionfactroyInstance;

public class SaveAuthoObject {

	public void saveAuthor() {
		
		
		    Author author = new Author();
		    author.setAuthorId(3); author.setAuthorName("Shrinath");
		    
		             List<Book> list = new ArrayList<>();
		             Book b1= new Book(); b1.setBookId(102);b1.setBookName("java black Book");
		             Book b2 = new Book(); b2.setBookId(103);b2.setBookName("java complete book");
		             list.add(b1); list.add(b2);
		    
		    author.setBooks(list);
			
		
		
		   Session session = SessionfactroyInstance.getSessionfactrFactory().openSession();
		   Transaction tx = session.beginTransaction();
		   session.save(author);
		   tx.commit();
		   session.close();
	}
}
