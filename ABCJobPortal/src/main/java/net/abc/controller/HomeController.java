package net.abc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
//	Servet launch mapping
	@RequestMapping(value="/") 
	public ModelAndView landing(HttpSession session) {
		
		return new ModelAndView("redirect:/home");
	}
	
//	Landing page
	@RequestMapping(value="/home")
	public ModelAndView home(HttpServletResponse response, HttpServletRequest req, 
			@CookieValue(value = "email", defaultValue = "") String email,
			@CookieValue(value = "userId", defaultValue = "") String userId,
			HttpSession session) {
		
		session.setAttribute("pageTitle", "ABC Job Portal");
		
		if(!email.equals("")) {
			// add session
			session.setAttribute("email", email);
			session.setAttribute("userId", userId);
			session.setAttribute("isLogin", true);
		}		
		return new ModelAndView("index");
	}

	
//	6 digit code verification GET
	@RequestMapping(value="/account-confirmation")
	public ModelAndView verifyCode(HttpServletResponse response) throws Exception {
		return new ModelAndView("account-verification"); 
	}
	
//  6 digit code verification POST
	@RequestMapping(value="/account-confirmation", method = RequestMethod.POST)
	public String verifyCode() throws Exception {
		return "redirect:/thank-you"; 
	}
//	Thank You Page
	@RequestMapping(value="/thank-you")
	public ModelAndView thankyou(HttpServletResponse response, HttpSession session) throws Exception {
		
		session.setAttribute("pageTitle", "ABC Job Portal");
		return new ModelAndView("thank-you"); 
	}
	
}
