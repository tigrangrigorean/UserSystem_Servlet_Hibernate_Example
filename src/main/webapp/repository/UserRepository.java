package repository;

import java.util.List;

import model.User;

public interface UserRepository {
	
	public User getById(long id);
	public List<User> getAll();
	public User save(User user);
	public void delete(long id);
	public void update(User user);

}
