package de.linma.breakout.data.user.dao.impl.hibernate;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * 
 * @author MBausch
 *
 */
@NoArgsConstructor(access=AccessLevel.PRIVATE)
public class HibernateUtil {
	
	private static final SessionFactory sessionFactory;
	
	static {
			final AnnotationConfiguration cfg = new	AnnotationConfiguration();
			cfg.configure();
			sessionFactory = cfg.buildSessionFactory();
	}
		
	public static SessionFactory getInstance() {
		return sessionFactory;
	}
}
