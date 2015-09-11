package diab.dao;

import java.util.List;
import diab.model.DataMaster;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Projections;

public class DataMasterDAO{

	@Autowired
	private SessionFactory sessionFactory;

	public void save (DataMaster dataMaster){
		Session session = this.sessionFactory.openSession();
		Transaction tx = null;

		tx = session.beginTransaction();
		session.save(dataMaster);
		tx.commit();

		session.close();
	}
}