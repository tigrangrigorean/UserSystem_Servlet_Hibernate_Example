package service;

import java.util.List;

import model.User;
import repository.UserRepositoryImpl;

public class UserService {
	
	UserRepositoryImpl userRepositoryImpl;
	
	public UserService() {
		userRepositoryImpl = new UserRepositoryImpl();
	}
	
	/**
	 * Method calls getById method
	 * @param id
	 * @return
	 */
	public User getById(long id) {
		return userRepositoryImpl.getById(id);
	}
	
	/**
	 * Method calls getAll method
	 * @return
	 */
	public List<User> getAll() {
		return userRepositoryImpl.getAll();
	}
	
	/**
	 * Method calls save method
	 * @param user
	 * @return
	 */
	public User save(User user) {
		return userRepositoryImpl.save(user);
	}
	
	/**
	 * Method calls delete method
	 * @param id
	 */
	public void delete(long id) {
		userRepositoryImpl.delete(id);
	}
	/**
	 * Method calls update method
	 * @param user
	 */
	public void update(User user) {
		userRepositoryImpl.update(user);
	}


}
