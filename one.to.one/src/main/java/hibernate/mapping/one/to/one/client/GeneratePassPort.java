package hibernate.mapping.one.to.one.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.mapping.one.to.one.entity.PassPort;
import hibernate.mapping.one.to.one.entity.Person;
import hibernate.mapping.one.to.one.factroy.SessionfactroyInstance;

public class GeneratePassPort {

	public void issuePassPort() {
		
		  PassPort p = new PassPort();
		  p.setPassPosrtNumber(87878768);
		      Person pesron = new Person();pesron.setPersinId(102);pesron.setPersonName("manohar joshi");
		  p.setPerson(pesron);
		
		
		 
		   Session session = SessionfactroyInstance.getSessionfactrFactory().openSession();
		   Transaction tx = session.beginTransaction();
		   session.save(p);
		   tx.commit();
		   session.close();
		
		
	}
}
