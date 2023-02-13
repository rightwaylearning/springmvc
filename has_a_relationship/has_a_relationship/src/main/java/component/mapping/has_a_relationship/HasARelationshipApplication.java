package component.mapping.has_a_relationship;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import component.mapping.has_a_relationship.entity.Address;
import component.mapping.has_a_relationship.entity.Employee;
import hibenate_inheritance_types.inheritance_object_save.factory.SessionFactroyInstance;

@SpringBootApplication
public class HasARelationshipApplication {

	public static void main(String[] args) {
		SpringApplication.run(HasARelationshipApplication.class, args);
		
		Session session = SessionFactroyInstance.getSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
		
		Address adr = new Address("C 505, B A vermont", "Baif road wagholi pune", 412277);
		
		Employee e = new Employee(11, "Sachin", adr);
		
		session.save(e);
		
		tx.commit();
		session.close();
	}

}
