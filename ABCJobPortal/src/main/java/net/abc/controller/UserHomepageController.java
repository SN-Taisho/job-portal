package net.abc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.abc.model.UserDetails;

import net.abc.service.UserDetailsService;

@Controller
public class UserHomepageController {
	
	@Autowired
	UserDetailsService uds;

//	User homepage GET
	@RequestMapping(value="/user-homepage")
	public ModelAndView userHomepage(HttpSession session, Model model) throws Exception {
		session.setAttribute("pageTitle", "ABC | User Home");
		try {
			this.setModel(model, session);
			return new ModelAndView("user-homepage");  
		} catch (Exception e) {
			System.out.println(e);
			String msg = "Login required";
			model.addAttribute("error", msg);
			return new ModelAndView("login");
		}
	}
	
//	User Profile GET
	@RequestMapping(value = "/user-profile")
	public ModelAndView userProfile(HttpSession session, Model model) throws Exception {
		session.setAttribute("pageTitle", "ABC | User Profile");
		try {
			this.setModel(model, session);
			return new ModelAndView("profile");  
		} catch (Exception e) {
			System.out.println(e);
			String msg = "Login required";
			model.addAttribute("error", msg);
			return new ModelAndView("login");
		}
	}

//	Edit User Profile GET
	@RequestMapping(value = "/edit-profile")
	public ModelAndView editProfile(Model model, HttpSession session) throws Exception {
		session.setAttribute("pageTitle", "ABC | Edit Profile");
		try {
			this.setModel(model, session);
			return new ModelAndView("edit-profile");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			model.addAttribute("error", "Login Required");
			return new ModelAndView("login");
		}
	}
	
//	Edit User Profile POST
	@RequestMapping(value = "/edit-profile", method = RequestMethod.POST)
	public String editProfile(
			@ModelAttribute("profile") UserDetails userDetails,
			Model model, HttpSession session) {
		
		Long userDetailId = Long.parseLong(String.valueOf(session.getAttribute("userId")));
		
		uds.updateProfile(userDetailId, userDetails);
		
		this.setModel(model, session);

		return "profile";
	}
	
//	SET MODEL
	private void setModel(Model model, HttpSession session) {
		
		// TODO Auto-generated method stub
		String userId = String.valueOf(session.getAttribute("userId"));
		String[] userDetails = uds.getDetailsById(userId).replaceAll("null", "-").split(",");
		
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
