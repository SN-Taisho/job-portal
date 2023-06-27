package net.abc.repository;

import org.springframework.data.repository.query.Param;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.abc.model.*;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query(value = "SELECT * FROM user ORDER BY User_Id DESC LIMIT 1", nativeQuery = true)
	String getLastUser();
	
	@Query(value = "SELECT * FROM user WHERE :UserEmail = User_Email AND :UserPassword = User_Password", nativeQuery = true)
	User login(@Param("UserEmail") String UserEmail, @Param("UserPassword") String UserPassword);
	
	@Query(value = "SELECT * FROM user WHERE User_Email = :email", nativeQuery = true)
	String checkEmail(@Param("email") String email);
	
	@Query(value = "SELECT User_Email FROM user"
			+ " JOIN user_details ON user.User_Id = user_details.User_Id"
			+ " WHERE user_details.User_Id = :userId", nativeQuery = true)
	public String getEmailById(@Param("userId") String userId);
}
