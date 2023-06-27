package net.abc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.abc.model.UserDetails;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
	
	@Query(value = "SELECT User_Detail_Id, User_FirstName, User_LastName, User_City, User_Country,"
			+ " User_Bio, User_Occupation, User_Company FROM user_details"
			+ " JOIN user ON user_details.User_Id = user.User_Id"
			+ " WHERE user.User_Id = :userId", nativeQuery = true)
	public String getDetailsById(@Param("userId") String userId);
	
	@Query(value = "SELECT * FROM user_details"
			+ " WHERE User_FirstName LIKE %:key%"
			+ " OR User_LastName LIKE %:key%"
			+ " OR User_Occupation LIKE %:key%"
			+ " OR User_City LIKE %:key%"
			+ " OR User_Country LIKE %:key%"
			+ " OR User_Occupation LIKE %:key%"
			+ " OR User_Company LIKE %:key%", nativeQuery = true)
	public List<UserDetails> searchByKey(@Param("key") String key);
	
}
