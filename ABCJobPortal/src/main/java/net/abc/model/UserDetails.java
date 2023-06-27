package net.abc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "User_Detail_Id")
	private Long userDetailId;
	
	@Column(name = "User_Id")
	private String UserId;
	
	@OneToOne(optional = false)
	@JoinColumn(name = "User_Id", referencedColumnName = "User_Id", insertable = false, updatable = false)
	private User user;
	
	@Column(name = "User_FirstName")
	private String userFirstName;
	
	@Column(name = "User_LastName")
	private String userLastName;
	
	@Column(name = "User_City")
	private String userCity;
	
	@Column(name = "User_Country")
	private String userCountry;
	
	@Column(name = "User_Bio")
	private String userBio;
	
	@Column(name = "User_Occupation")
	private String userOccupation;
	
	@Column(name = "User_Company")
	private String userCompany;

	public UserDetails() {}
	public UserDetails(Long userDetailId, String userId, User user, 
			String userFirstName, String userLastName, String userCity, 
			String userCountry, String userBio, String userOccupation,
			String userCompany) {
		super();
		this.userDetailId = userDetailId;
		this.UserId = userId;
		this.user = user;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userCity = userCity;
		this.userCountry = userCountry;
		this.userBio = userBio;
		this.userOccupation = userOccupation;
		this.userCompany = userCompany;
	}


	public Long getUserDetailId() {
		return userDetailId;
	}


	public void setUserDetailId(Long userDetailId) {
		this.userDetailId = userDetailId;
	}


	public String getUserId() {
		return UserId;
	}


	public void setUserId(String userId) {
		UserId = userId;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getUserFirstName() {
		return userFirstName;
	}


	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}


	public String getUserLastName() {
		return userLastName;
	}


	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}


	public String getUserCity() {
		return userCity;
	}


	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}


	public String getUserCountry() {
		return userCountry;
	}


	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}


	public String getUserBio() {
		return userBio;
	}


	public void setUserBio(String userBio) {
		this.userBio = userBio;
	}


	public String getUserOccupation() {
		return userOccupation;
	}


	public void setUserOccupation(String userOccupation) {
		this.userOccupation = userOccupation;
	}


	public String getUserCompany() {
		return userCompany;
	}


	public void setUserCompany(String userCompany) {
		this.userCompany = userCompany;
	}

	

	
	
}
