package hibenate_inheritance_types.inheritance_object_save.factory;

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
