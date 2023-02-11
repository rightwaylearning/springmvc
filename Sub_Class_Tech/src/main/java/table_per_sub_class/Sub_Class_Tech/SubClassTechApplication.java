package table_per_sub_class.Sub_Class_Tech;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import table_per_sub_class.Sub_Class_Tech.factory.SessionFactroyInstance;
import table_per_sub_class.Sub_Class_Techentity.entity.Cheque;

@SpringBootApplication
public class SubClassTechApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubClassTechApplication.class, args);
	

//		Card card= new Card();
//		card.setTransectioId(1234);
//		card.setAmount(2345.78);
//		card.setDate(new Date().toString());
//		card.setCardNumber(435645);
//		card.setCardType("Master Card");
//		
		Cheque ch = new Cheque();
		ch.setTransectioId(65775);
		ch.setAmount(34500.0);
		ch.setDate(new Date().toString());
		ch.setChequeNumber(786900);
		ch.setChequeType("account pay");
		
	    Session session = SessionFactroyInstance.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(ch);
		tx.commit();
		session.close();
	
	
	}

}
