package net.abc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "User_Id")
	private Long UserId;
	
	@Column(name = "User_Role")
	private String roleId;
	
	@Column(name = "User_Email")
	private String UserEmail;
	
	@Column(name = "User_Password")
	private String UserPassword;
	
//	User Verification
	@Column(name = "User_Verification")
	private int UserVerification;
	
	
	public User() {}
//	Constructor
	public User(String userEmail, String userPassword, int userVerification) {
		this.UserEmail = userEmail;
		this.UserPassword = userPassword;
		this.UserVerification = userVerification;
	}
	
	
	
	
	public Long getUserId() {
		return UserId;
	}
	public void setUserId(Long userId) {
		this.UserId = userId;
	}
	
	
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
	
	
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		this.UserEmail = userEmail;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		this.UserPassword = userPassword;
	}
	public int getUserVerification() {
		return UserVerification;
	}
	public void setUserVerification(int userVerification) {
		this.UserVerification = userVerification;
	}

	
	

	
	
}
