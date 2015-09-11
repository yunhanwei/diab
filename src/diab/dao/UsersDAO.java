package diab.dao;

import java.util.List;
import diab.model.Users;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Projections;


public class UsersDAO {

	@Autowired
	private SessionFactory sessionFactory;

	// public void setSessionFactory(SessionFactory sessionFactory){
	// 	this.sessionFactory = sessionFactory;
	// }

	public void save (Users user){
		Session session = this.sessionFactory.openSession();
		Transaction tx = null;

		tx = session.beginTransaction();
		session.save(user);
		tx.commit();

		session.close();
	}

	public String delete (int id){
		String returnVal = null;
		Session session = this.sessionFactory.openSession();
		Transaction tx = null;

		tx = session.beginTransaction();
		Criteria cr = session.createCriteria(Users.class);
		cr.add(Restrictions.eq("id", id));
		Users result = cr.uniqueResult();
		tx.commit();

		if(result.equals(null)){
			returnVal = "This user does not exist";
			session.close();
			return returnVal;
		}
		else{
			tx = session.beginTransaction();
			session.delete(result);
			tx.commit();
			session.close();
			returnVal = "User " + id + " was deleted sucessfully";
		}

	}




}
