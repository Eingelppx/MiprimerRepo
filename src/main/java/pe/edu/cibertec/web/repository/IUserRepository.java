package pe.edu.cibertec.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.edu.cibertec.web.model.User;

public interface IUserRepository extends JpaRepository<User, Integer>{

	@Query("SELECT u FROM User u WHERE u.email = ?1 AND u.password = ?2")
	User findByEmailAndPassword(String emailAddress, String password);

	User findByNameAndPassword(String name, String password);

	User getReferenceByName(Integer integer);

	User getReferenceByName(String name);
}
