import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertStudentObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Build configuration object & configure using hibernate.hbm.xml &
		// get session factory object
		// 2. Build Session objects from SessionFactory object as per client
		// requests
		// 3. Begin or start transaction because all session methods bound to
		// begin & end of transaction

		try (SessionFactory sessFactObject = new Configuration().configure().buildSessionFactory();
				Session sessObject = sessFactObject.openSession()) {

			// 4. start transaction
			Transaction tr = sessObject.beginTransaction();

			// 5. Build student object & save it
			Scanner sc = new Scanner(System.in);
			System.out.print("\nEnter student rollno : ");
			int rollno = sc.nextInt();
			System.out.print("\nEnter student firstname : ");
			String firstname = sc.next();
			System.out.print("\nEnter student lastname : ");
			String lastname = sc.next();
			System.out.print("\nEnter student marks : ");
			int marks = sc.nextInt();
			System.out.print("\nEnter student branch : ");
			String branch = sc.next();
			
			Student studObject = new Student(rollno, firstname, lastname, marks, branch);			
			
			// 6. save student object
			int identifier = (int) sessObject.save(studObject);

			// 7. commit transaction
			tr.commit();
			System.out.println("identifier is : " + identifier);
		}
		catch(HibernateException hbe) {
			hbe.printStackTrace();
		}

	}

}
