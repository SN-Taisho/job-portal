package net.abc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.abc.model.UserDetails;
import net.abc.service.UserDetailsService;
import net.abc.service.UserService;

@Controller
public class AdminController {
	
	@Autowired
	UserService us;
	@Autowired
	UserDetailsService uds;
	
//	Admin Dashboard GET
	@RequestMapping(value = "/admin-dashboard")
	public ModelAndView viewAllUsers(Model model, HttpSession session) {
		List<UserDetails> users = uds.getALlUserDetails();
		model.addAttribute("users", users);
		
		session.setAttribute("pageTitle", "ABC | Admin Dashboard");
		return new ModelAndView("admin-dashboard");
	}
	
//	Delete User
	@RequestMapping(value = "/delete/{id}")
	public String deleteUserById(@PathVariable("id") Long id, Model model) {
		boolean isDeleted = us.deleteUserById(id);
		
		if (isDeleted) {
			model.addAttribute("error", "Cannot delete this user");
		}
		
		model.addAttribute("msg", "User successfully deleted");
		return "redirect:/admin-dashboard";
	}
	
//	View User Profile with Admin privileges
	@RequestMapping(value = "/view", method = RequestMethod.POST)
	public ModelAndView viewUserProfile(@RequestParam("uId") String uId, 
			Model model, HttpSession session) throws Exception {
		this.setModel(model, session, uId);
		return new ModelAndView("view-user");
	}
	
//	Edit user details page
	@RequestMapping(value = "/edit-user-details", method = RequestMethod.POST)
	public ModelAndView editUserDetails(@RequestParam("uId") String uId, Model model, 
			HttpSession session) throws Exception {
		session.setAttribute("pageTitle", "Admin | Edit User Detais");
		
			this.setModel(model, session, uId);
			System.out.println(uId);
			return new ModelAndView("admin-edit-user");
		
	}
	
//	Save user details POST
	@RequestMapping(value = "/save-user-changes", method = RequestMethod.POST)
	public String saveUserChanges(@RequestParam("uId") String uId,
			@ModelAttribute("profile") UserDetails userDetails, 
			Model model, HttpSession session) throws Exception {
		
		Long userDetailId = Long.parseLong(uId);
		
		uds.updateProfile(userDetailId, userDetails);

		return "redirect:/admin-dashboard";
	}
	
//	SET MODEL
private void setModel(Model model, HttpSession session, String uId) {
	
	// TODO Auto-generated method stub
	String userId = String.valueOf(uId);
	String[] userDetails = uds.getDetailsById(userId).replaceAll("null", "-").split(",");
	
	
	
	model.addAttribute("uId", userDetails[0]);
	
	model.addAttribute("firstName", userDetails[1]);
	model.addAttribute("lastName", userDetails[2]);
	
	model.addAttribute("fullName", userDetails[1] + " " + userDetails[2]);
	model.addAttribute("titleAndCompany", userDetails[6] + " at " + userDetails[7]);
	model.addAttribute("cityAndCountry", userDetails[3] + ", " + userDetails[4]);
	
	model.addAttribute("city", userDetails[3]);
	model.addAttribute("country", userDetails[4]);
	model.addAttribute("bio", userDetails[5]);
	model.addAttribute("title", userDetails[6]);
	model.addAttribute("company", userDetails[7]);

	}
}
