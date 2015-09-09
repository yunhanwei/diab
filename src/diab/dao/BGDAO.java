package diab.dao;

import java.util.List;
import diab.model.BG;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Projections;

public class BGDAO{

	@Autowired
	private SessionFactory sessionFactory;

	public void save (BG bG){
		Session session = this.sessionFactory.openSession();
		Transaction tx = null;

		tx = session.beginTransaction();
		session.save(bG);
		tx.commit();

		session.close();
	}
}