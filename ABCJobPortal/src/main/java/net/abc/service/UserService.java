package net.abc.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.abc.model.User;
import net.abc.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	UserRepository repository;
	
	public User register(User user) {
		return repository.save(user);
		
	}
	
	public User login(String email, String password) {
		try {
			User login = repository.login(email, password);
			return login;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Credential is null" + e);
		}
		return null;
		
	}
	
	public String getLastUser() {
		return repository.getLastUser();
		
	}
	
	public boolean doesUserExist(Long id) {
		try {
			repository.findById(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return false;
		
	}
	
	public String checkEmail(String email) {
		return repository.checkEmail(email);
		
	}
	
	public User updatePassword(String password, String email) {
		Long userId = Long.parseLong(repository.checkEmail(email).split(",")[0]);
		User user = repository.findById(userId).get();
		
		user.setUserPassword(password);
		
		return repository.save(user);
	}
	
	public boolean deleteUserById(Long id) {
		try {
			repository.deleteById(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return false;
		
	}
	
	public String getEmailById(String UserId) {
		return repository.getEmailById(UserId);
		
	}
	
	
}
