package hibernate.example.many.to.one.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.example.many.to.one.entity.Docter;
import hibernate.example.many.to.one.entity.Patient;
import hibernate.example.many.to.one.factory.SessionFactroyInstance;

public class ManyToOneCrudOpt {

	public void insertData() {
		
		Session session = SessionFactroyInstance.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Docter dr = new Docter(1, "Ramesh", "MD");
		
		Patient p1= new Patient(101, "A", 34, dr);
		Patient p2= new Patient(102, "B", 44, dr);
		Patient p3= new Patient(103, "C", 41, dr);
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.flush();
		tx.commit();
		session.close();
		
	}
}
