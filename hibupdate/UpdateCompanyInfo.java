import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateCompanyInfo {

	static void updateCompanyLocation(String compName, String compLoc) {
		String query = "update Company set cloc= ?1 where cname= ?2";
		try (SessionFactory sessFact = new Configuration().configure().buildSessionFactory();
				Session sess = sessFact.openSession()) {
			Transaction tr = sess.beginTransaction();
			Query q = sess.createQuery(query);
			q.setParameter(1, compLoc);
			q.setParameter(2, compName);
			int qid = q.executeUpdate();
			tr.commit();
			System.out.println("id is : " + qid);
		} catch (HibernateException he) {
			he.printStackTrace();
		}
	}

	static void updateCompanyEmployeeNumber(String compName, int numOfEmployee) {
		try (SessionFactory sessFact = new Configuration().configure().buildSessionFactory();
				Session session = sessFact.openSession()) {
			Transaction tr = session.beginTransaction();
			//Query q = session.createNativeQuery(qq).addEntity(Company.class);
			Query q = session.createNativeQuery("update company set num_of_emp=:pos1 where cname=:pos2", Company.class).setParameter("pos1", numOfEmployee).setParameter("pos2", compName);
			int numOfEmpUpdated = q.executeUpdate();
			System.out.println("number of emp updates are : " + numOfEmpUpdated);
			tr.commit();
		} catch (HibernateException he) {
			he.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (SessionFactory sessFact = new Configuration().configure().buildSessionFactory();
				Session sess = sessFact.openSession();
				Scanner sc = new Scanner(System.in)) {

			// update company location. first search by company name
			System.out.print("Enter company name : ");
			String compName = sc.next();
			System.out.print("Enter new location : ");
			String newLocation = sc.next();
			Query q = sess.createQuery("select companyName from Company");
			List l = q.list();
			if (l.contains(compName)) {
				updateCompanyLocation(compName, newLocation);
			} else {
				System.out.println("company not present");
			}
			
			System.out.print("Enter company name : ");
			String compName2 = sc.next();
			System.out.print("Enter no of employees updated : ");
			int newEmployees = sc.nextInt();
			Query q2 = sess.createQuery("select companyName from Company");
			List l2 = q2.list();
			if (l2.contains(compName2)) {
				updateCompanyEmployeeNumber(compName2, newEmployees);
			} else {
				System.out.println("company not present");
			}


		} catch (HibernateException he) {
			he.printStackTrace();
		}

	}

}
