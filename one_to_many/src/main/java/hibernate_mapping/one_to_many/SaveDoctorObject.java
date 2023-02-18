package hibernate_mapping.one_to_many;

import java.util.ArrayList;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import hibernate_mapping.one_to_many.entity.Docter;
import hibernate_mapping.one_to_many.entity.Patient;
import hibernate_mapping.one_to_many.factroy.SessionFactroyInstance;

@Component
public class SaveDoctorObject {

	public void createRecord() {
	
		Session session = SessionFactroyInstance.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		ArrayList<Patient> list = new ArrayList<>();
		list.add(new Patient(11, "A", 23));
		list.add(new Patient(22, "B", 33));
		list.add(new Patient(33, "C", 56));
		
		Docter d = new Docter(11, "Ramesh", "MD", list);
		
		session.save(d);	
//		
//		HashSet<Patient> set = new HashSet<>();
//		set.add(new Patient(4, "M", 23));
//		set.add(new Patient(5, "N", 33));
//		Docter d = new Docter(2, "Suresh", "MBBS", set);
//		session.save(d);
		
		tx.commit();
		session.close();
		
	}
	
	void readDocterObject() {
		
		Session session = SessionFactroyInstance.getSessionFactory().openSession();
		Docter d = session.get(Docter.class,1);
		System.out.println(d.getDocterName());
//		Set<Patient> set = d.getPatients();
//		System.out.println(set);
	}
	
	void removeParentObject() {
	   
		Session session = SessionFactroyInstance.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Docter d = session.get(Docter.class,11);
		if(d!=null) {
			session.remove(d);
		}
		tx.commit();
		session.close();
	}
}
