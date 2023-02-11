package table_per_concreate_class.example;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import table_per_concreate_class.example.entity.Card;
import table_per_concreate_class.example.entity.Cheque;
import table_per_concreate_class.example.factory.SessionFactroyInstance;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
		

		Card card= new Card();
		card.setTransectioId(465464);
		card.setAmount(2345.78);
		card.setDate(new Date().toString());
		card.setCardNumber(435645);
		card.setCardType("Master Card");
		
//		Cheque ch = new Cheque();
//		ch.setTransectioId(456456);
//		ch.setAmount(34500.0);
//		ch.setDate(new Date().toString());
//		ch.setChequeNumber(786900);
//		ch.setChequeType("account pay");
		
	    Session session = SessionFactroyInstance.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(card);
		tx.commit();
		session.close();
		
	}

}
