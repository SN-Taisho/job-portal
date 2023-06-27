package net.abc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.abc.model.UserDetails;
import net.abc.repository.UserDetailsRepository;

@Service
@Transactional
public class UserDetailsService {
	
	@Autowired
	UserDetailsRepository repository;
	
	public UserDetails register(UserDetails userDetails) {
		return repository.save(userDetails);
		
	}
	
	public String getDetailsById(String userId) {
		return repository.getDetailsById(userId);
		
	}
	
	public UserDetails updateProfile(Long userDetailId, UserDetails ud) {
		UserDetails userDetails = repository.findById(userDetailId).get();
		
//		Edit the profile content
		userDetails.setUserFirstName(ud.getUserFirstName());
		userDetails.setUserLastName(ud.getUserLastName());
		userDetails.setUserCity(ud.getUserCity());
		userDetails.setUserCountry(ud.getUserCountry());
		userDetails.setUserBio(ud.getUserBio());
		userDetails.setUserOccupation(ud.getUserOccupation());
		userDetails.setUserCompany(ud.getUserCompany());
		
//		Save
		return repository.save(userDetails);
	}
	
	public List<UserDetails> searchByKey(String key) {
		return repository.searchByKey(key);
		
	}
	
	public List<UserDetails> getALlUserDetails() {
		return repository.findAll();
	}
	
	public UserDetails getDetailsById(Long id) {
		return repository.findById(id).get();
		
	}
}
