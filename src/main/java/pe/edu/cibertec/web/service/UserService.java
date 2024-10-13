package pe.edu.cibertec.web.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import pe.edu.cibertec.web.model.User;
import pe.edu.cibertec.web.repository.IUserRepository;

@Service
public class UserService {
	
	@Autowired
	private IUserRepository userRepository;
	
	public User validateUserByEmailAndPassword(String email, String password) {
		User u = userRepository.findByEmailAndPassword(email, password);
		return u;
	}
	
	public User updateUserLogin(User user) {
//		User u = userRepository.getReferenceById(user.getIduser());
//		u.setLastlogin(new Date());
//		return userRepository.save(u);
		return userRepository.save(user);
	}
	
	public User createUser(User user)  {
//		User u = userRepository.getReferenceById(user.getIduser());
//		u.setLastlogin(new Date());
//		return userRepository.save(u);
		return userRepository.save(user);
	}
	

	public User validateUserByNameAndPassword(String name, String password) {
		User u = userRepository.findByNameAndPassword(name, password);
		return u;
	}
	
	public User createName(User name)  {
User u = userRepository.getReferenceByName(name.getName());
u.setLastlogin(new Date());
//		return userRepository.save(u);
		return userRepository.save(name);
	}
	public List<User> getUser() {
        User u = new User();
        List<User> employees = ((EntityManager) u).createQuery("FROM Name", User.class).getResultList();
        ((EntityManager) u).close();
        return getUser();
    }
}

