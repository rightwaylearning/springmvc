package hibernate_mapping.one_to_many.factroy;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactroyInstance {

	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory() {
		
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		sessionFactory = conf.buildSessionFactory();
		
		return sessionFactory;
	}
}
