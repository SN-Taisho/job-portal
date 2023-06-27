package net.abc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.abc.model.UserDetails;
import net.abc.model.User;
import net.abc.service.UserDetailsService;
import net.abc.service.UserService;

@Controller
public class AuthController {
	
	@Autowired
	private UserService us;
	
	@Autowired
	private UserDetailsService ud;
	
//	Sign up GET
	@RequestMapping(value = "/sign-up")
	public ModelAndView registration(HttpSession session) throws Exception {
		session.setAttribute("pageTitle", "ABC | Sign Up");
		return new ModelAndView("signup");
		
	}
	
//	Sign up POST
	@RequestMapping(value = "/sign-up", method = RequestMethod.POST)
	public String registration(@RequestParam("email") String email,
			@RequestParam("password") String password,@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			User user, UserDetails userDetails, Model model) throws Exception {
		
		try {
			user.setUserEmail(email);
			user.setUserPassword(password);
			user.setRoleId("2");
			user.setUserVerification(1);
			us.register(user);
			
			userDetails.setUserId(us.getLastUser().split(",")[0]);
			userDetails.setUserFirstName(firstName);
			userDetails.setUserLastName(lastName);
			ud.register(userDetails);
			
			model.addAttribute("userEmail", user.getUserEmail());
			return "redirect:/account-confirmation";
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		model.addAttribute("error", "Email is already in use");
		return "signup";
	}
	
//	Login GET
	@RequestMapping(value = "/log-in", method = RequestMethod.GET)
	public ModelAndView login(HttpSession session) throws Exception {
		session.setAttribute("pageTitle", "ABC | Log In");
		return new ModelAndView("login");
	}
	
//	Login POST
	@RequestMapping(value = "/log-in", method = RequestMethod.POST)
	public ModelAndView login(
			@RequestParam("email") String email, @RequestParam("password") String password,
			@ModelAttribute("login") User user, Model model, 
			HttpServletRequest request, HttpServletResponse response) {
		
		String rememberMe = request.getParameter("rememberMe");
		HttpSession session = request.getSession();
		User isLogin = us.login(email, password);
			
		System.out.println("if statement comes after");
		
//		Login validation
		if (isLogin != null) {
			if (rememberMe != null) {
				Cookie eCookie = new Cookie("email", isLogin.getUserEmail());
				eCookie.setMaxAge(10 * 60);
				response.addCookie(eCookie);	
				
				Cookie iCookie = new Cookie("userId", String.valueOf(isLogin.getUserId()));
				iCookie.setMaxAge(10 * 60);
				response.addCookie(iCookie);	
			}
			
			session.setAttribute("email", isLogin.getUserEmail());
			session.setAttribute("userId", isLogin.getUserId());
			session.setAttribute("roleId", isLogin.getRoleId());
			session.setAttribute("isLogin", true);
			session.setAttribute("pageTitle", "ABC | User Homepage");
			return new ModelAndView("redirect:/user-homepage");
		}
		String errMsg= "Credentials are incorrect";
		System.out.println("Error something is wrong");
		model.addAttribute("error", errMsg);
		return new ModelAndView("login");
		
	}
	
//	Logout GET
	@RequestMapping(value="/log-out", method = RequestMethod.GET)
	public String logout(HttpServletResponse response, HttpSession session) throws Exception {
		session.invalidate();

		Cookie eCookie = new Cookie("email", "");
		eCookie.setMaxAge(0); // 10 minute
		response.addCookie(eCookie);
		
		Cookie iCookie = new Cookie("userId", "");
		iCookie.setMaxAge(0);
		response.addCookie(iCookie);
		
		return "redirect:/log-in"; 
	}
	
//	Forgot password GET
	@RequestMapping(value = "/forgot-password")
	public ModelAndView forgotPassword(HttpSession session,
			HttpServletResponse reponse) throws Exception {
		
		session.setAttribute("pageTitle", "ABC | Forgot Password");
		return new ModelAndView("forgot-password");
	}
	
//	Forgot password POST
	@RequestMapping(value = "/forgot-password", method = RequestMethod.POST)
	public String forgotPassword(@RequestParam("email") String email, Model model,
			HttpServletRequest request) throws Exception {
		
		HttpSession session = request.getSession();
		String checkEmail = us.checkEmail(email);
		
		if (checkEmail != null) {
			session.setAttribute("isReset", true);
			session.setAttribute("email", email);
			
			session.setAttribute("pageTitle", "ABC | Reset Password");
			return "reset-password";
		}
		
		model.addAttribute("error", "That email does not exist");
		return "forgot-password";
	}
	
//	Reset password GET
	@RequestMapping(value = "/reset-password")
	public ModelAndView resetPassword(Model model, HttpSession session) throws Exception {
		
		if ((boolean) session.getAttribute("isReset")) {
			session.setAttribute("pageTitle", "ABC | Reset Password");
			return new ModelAndView("reset-password");
		}
		
		model.addAttribute("Email is required");
		return new ModelAndView("forgot-password"); 
		
	}
	
//	RESET PASSWORD POST
	@RequestMapping(value = "/reset-password", method = RequestMethod.POST)
	public String resetPassword(@RequestParam("password") String password, 
			Model model, HttpSession session) throws Exception {
		
		try {
			us.updatePassword(password, (String) session.getAttribute("email"));
			
			model.addAttribute("error", "Password has been changed");
			session.invalidate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return "reset-password";
		}
		return "login";
	}
	
	
	
	
	
	
	
	
}
