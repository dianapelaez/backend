package
com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
    /**
     * 
     * @param user
     * @return
     */
	User save(User user);
    
	/**
	 * 
	 * @return
	 */
	List<User> findAll();

	void deleteUser(long id);
}
