import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetSessionObject {

	public static Session getSession() {
		SessionFactory sessFact = new Configuration().configure().buildSessionFactory();
		Session sess = sessFact.openSession();
		return sess;
	}
}
