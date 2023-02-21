package hibernate.mapping.manytomany.factroy;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionfactroyInstance {

	public static SessionFactory getSessionfactrFactory() {
		return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
}
