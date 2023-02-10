package hibenate_inheritance_types.inheritance_object_save;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hibenate_inheritance_types.inheritance_object_save.entity.Card;
import hibenate_inheritance_types.inheritance_object_save.entity.Cheque;
import hibenate_inheritance_types.inheritance_object_save.factory.SessionFactroyInstance;

@SpringBootApplication
public class InheritanceObjectSaveApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(InheritanceObjectSaveApplication.class, args);
	
	  
//		Card card= new Card();
//		card.setTransectioId(1234);
//		card.setAmount(2345.78);
//		card.setDate(new Date().toString());
//		card.setCardNumber(435645);
//		card.setCardType("Master Card");
		
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
