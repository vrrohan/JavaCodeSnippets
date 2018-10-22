import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class CriteriaHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (SessionFactory sessFact = new Configuration().configure().buildSessionFactory();
				Session sess = sessFact.openSession()) {
			Criteria cr = sess.createCriteria(Company.class);
			cr.add(Restrictions.eq("numberOfCompanyEmployees", 9000));
			List<Company> l = cr.list();
			l.forEach(x -> {
				System.out.println(x.getCompanyId() + " " + x.getCompanyName() + " " + x.getCompanyLocation());
			});
			
			Criteria cr2 = sess.createCriteria(Company.class);
			cr2.add(Restrictions.gt("numberOfCompanyEmployees", 6000));
			List<Company> l2 = cr2.list();
			l2.forEach(x -> {
				System.out.println(x.getCompanyId() + " " + x.getCompanyName() + " " + x.getCompanyLocation());
			});
		} catch (HibernateException he) {
			he.printStackTrace();
		}

	}

}
