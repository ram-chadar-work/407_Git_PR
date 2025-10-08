import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tka.config.HibernateConfig;
import com.tka.entity.Employee;

public class RitikaGupta {

	public static void main(String[] args) {
		SessionFactory sf = HibernateConfig.getSessionFactory();

		Session session = sf.openSession();

		Employee employee = new Employee("AA", 25);

		Transaction tr = session.beginTransaction();
		session.save(employee);
		tr.commit();

	}

}
