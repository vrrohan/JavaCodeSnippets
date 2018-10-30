import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertPersonObject {

	public static void savePerson(Person person) {
		try (SessionFactory sessFact = new Configuration().configure().buildSessionFactory();
				Session sess = sessFact.openSession()) {
			Transaction tr = sess.beginTransaction();
			sess.save(person);
			tr.commit();
		} catch (HibernateException he) {
			System.out.println(he.getLocalizedMessage());
		}
	}

}
