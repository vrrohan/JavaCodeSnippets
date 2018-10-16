import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertCompanyObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (SessionFactory sf = new Configuration().configure().buildSessionFactory();
				Session sess = sf.openSession();
				Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter company name : ");
			String cname = sc.next();
			System.out.print("\nEnter company location : ");
			String cloc = sc.next();
			System.out.print("\nEnter total company employees : ");
			int numEmp = sc.nextInt();

			Company c = new Company(cname, cloc, numEmp);
			Transaction tr = sess.beginTransaction();
			int id = (int) sess.save(c);

			System.out.println("\nUnique id for company " + c.getCompanyName() + " is : " + id);
			tr.commit();

		} catch (HibernateException he) {
			he.printStackTrace();
		}
		
		//get all company by their id's
		try(SessionFactory sf = new Configuration().configure().buildSessionFactory();
				Session sess = sf.openSession()) {
			@SuppressWarnings({ "unchecked", "deprecation" })
			Query<Company> q = sess.createQuery("from Company");
			@SuppressWarnings("deprecation")
			List<Company> compIds = q.list();
			compIds.forEach(x -> {
				System.out.println("Company id : " + x.getCompanyId() + " ,Company name : " + x.getCompanyName());
			});
		}
		catch(HibernateException he) {
			he.printStackTrace();
		}
		
		

	}

}
