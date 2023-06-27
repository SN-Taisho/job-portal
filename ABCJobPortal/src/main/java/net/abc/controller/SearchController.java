package net.abc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.abc.model.UserDetails;
import net.abc.service.UserDetailsService;
import net.abc.service.UserService;

@Controller
public class SearchController {
	
	@Autowired
	UserDetailsService uds;
	
	@Autowired
	UserService us;
	
//	Search page GET
	@RequestMapping(value = "/search")
	public ModelAndView search(HttpSession session, HttpServletRequest request, Model model) throws Exception {
		
		session.setAttribute("pageTitle", "ABC | Search");
		String search = request.getParameter("search");
		
		if(search != null && !search.equals("")) {
			search = search.split(" ")[0];
			List<UserDetails> selectedUser = uds.searchByKey(search);
			model.addAttribute("selected", selectedUser);
			
			if (selectedUser.size() == 0) {
				model.addAttribute("notFound", true);
			}
		}
		
		return new ModelAndView("/search");
	}
	
//	view users profile from search
	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public ModelAndView searchProfile(@RequestParam("uId") String uId, 
			Model model, HttpSession session) throws Exception {
		this.setModel(model, session, uId);
		session.setAttribute("pageTitle", "ABC | Search Result");
		return new ModelAndView("results");
	}
	
//	SET MODEL
private void setModel(Model model, HttpSession session, String uId) {
		
		// TODO Auto-generated method stub
		String userId = String.valueOf(uId);
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
