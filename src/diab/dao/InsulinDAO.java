package diab.dao;

import java.util.List;
import diab.model.Insulin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Projections;

public class InsulinDAO{

	@Autowired
	private SessionFactory sessionFactory;

	public void save (Insulin insulin){
		Session session = this.sessionFactory.openSession();
		Transaction tx = null;

		tx = session.beginTransaction();
		session.save(insulin);
		tx.commit();

		session.close();
	}
}