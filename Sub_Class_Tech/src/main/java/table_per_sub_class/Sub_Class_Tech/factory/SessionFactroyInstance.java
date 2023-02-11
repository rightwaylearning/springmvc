package table_per_sub_class.Sub_Class_Tech.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactroyInstance {

	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory() {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		sessionFactory = config.buildSessionFactory();
		
		return sessionFactory;
	}
}
