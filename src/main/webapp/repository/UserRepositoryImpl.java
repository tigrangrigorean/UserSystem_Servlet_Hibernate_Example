package repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import configuration.Configurations;
import jakarta.persistence.Query;
import model.User;

public class UserRepositoryImpl implements UserRepository {
	
	Configuration config = Configurations.getConfiguration();
	SessionFactory sessionFactory = config.buildSessionFactory();

	/**
	 * Method get's user by id
	 */
	@Override
	public User getById(long id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		User user = session.get(User.class, id);
		session.getTransaction().commit();
		session.close();
		return user;
	}
	
	/**
	 * Method get's all users
	 */
	@Override
	public List<User> getAll() {
		 Session session = sessionFactory.openSession();
		 Query query = session.createQuery("FROM User");
		 session.beginTransaction();
		 List<User> usersList = ((org.hibernate.query.Query) query).list();
	     session.getTransaction().commit();
	     session.close();
	     return usersList;
	}

	/**
	 * Method save's new user
	 */
	@Override
	public User save(User user) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		return user;
	}

	/**
	 * Method deletes user
	 */
	@Override
	public void delete(long id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		User user = session.get(User.class, id);
		session.delete(user);;
		session.getTransaction().commit();
		session.close();
		
	}

	/**
	 * Method update's user
	 */
	@Override
	public void update(User user) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(user);
		session.getTransaction().commit();
		session.close();
	}

}
