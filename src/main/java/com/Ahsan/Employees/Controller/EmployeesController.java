package com.Ahsan.Employees.Controller;

import java.security.Principal;
import java.util.Optional;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.Ahsan.Employees.Model.Employees;
import com.Ahsan.Employees.Repo.EmployeeDao;




@Controller
public class EmployeesController {
	
	

	@Autowired
	EmployeeDao repo;	
	
	
	@RequestMapping("/")
	public ModelAndView viewHome(Model model) {
		//List<Employees> list=repo.findAll();
		
		
		ModelAndView view= new ModelAndView("Home.jsp");
		model.addAttribute("users", repo.findAll());
		return view;
	}
		
		
		@RequestMapping("/login")
		public String loginPage() {
			return "login.jsp";
		}

		
		
		
//		@RequestMapping("/logout-success") // this is for custom login page
//		public String logoutDo(HttpServletRequest request){
//		    HttpSession session= request.getSession(false);
//		    SecurityContextHolder.clearContext();
//		    session= request.getSession(false);
//		    if(session != null) {
//		        session.invalidate();
//		    }
//		    for(Cookie cookie : request.getCookies()) {
//		        cookie.setMaxAge(0);
//		    }
//		    return "login.jsp";
//		}
//		
//		
		
		@RequestMapping("/logout-success") // for oauth2 login
		public RedirectView logoutDo(HttpServletRequest request){
		    HttpSession session= request.getSession(false);
		    SecurityContextHolder.clearContext();
		    session= request.getSession(false);
		    if(session != null) {
		        session.invalidate();
		    }
		    for(Cookie cookie : request.getCookies()) {
		        cookie.setMaxAge(0);
		    }
		
		    
			return new RedirectView("/");
			
		}
		
		
//		
		
		
		
		
		
		
		
		
		
		
		@RequestMapping("/NewEmployee")
		public ModelAndView viewHomes(Model model) {
			//List<Employees> list=repo.findAll();
			
			
			ModelAndView view= new ModelAndView("NewEmployee.jsp");
			//model.addAttribute("users", repo.findAll());
			return view;
		}
		
		@RequestMapping("/DeleteEmployees/{id}")
		public RedirectView viewHomes1( @PathVariable("id") Integer id) {
			
			//Employees employee= repo.getOne(id);
			repo.deleteById(id);
		//	ModelAndView view= new ModelAndView("Home.jsp");
			//return view;
			
			//return new ModelAndView("Home.jsp");
			//return "redirect:/Home.jsp";
			return new RedirectView("/");
		}
		
		@RequestMapping("/UpdateEmployee/{id}")
		@ResponseBody
		public ModelAndView viewHomes12( @PathVariable("id") Integer id, Model model) {
			
			//Employees employee= repo.getOne(id);
			//repo.deleteById(id);
			repo.findById(id);
			Optional<Employees> location=repo.findById(id);
			ModelAndView view= new ModelAndView("/UpdateEmployee.jsp");
			//model.addAttribute("users", location);
			//view.addObject("users",repo.findById(id));
		//model.addAttribute("users",repo.findById(id));
		//	model.addAttribute("users", location);
		//System.out.println("yessir" +repo.findById(id));
		if(location.isPresent()) {
				System.out.println("yes it is present"+ location);
				model.addAttribute("users", location.get());
			}
			else {
			System.out.println("sorry");
			}
			return view;
			
		}
		
		
		
		
		
		
		
		
		
		
		@PostMapping("/AddEmployee")
		public ModelAndView AddEmployee(@ModelAttribute Employees employee) {
			 repo.save(employee);
			 
			ModelAndView view= new ModelAndView("Home.jsp");
			view.addObject("users", repo.findAll());
			return view;
			//view.setViewName("Home.jsp");
			//return new ModelAndView("Home.jsp");

			//return "redirect:/Home.jsp";
	}

		@RequestMapping(method = RequestMethod.PUT, value ="/SaveUpdateEmployee/{id}")

		public RedirectView UpdateEmployee(@PathVariable("id") Integer id, @ModelAttribute Employees employeedetails) {
			 // @RequestBody not working so i m using @ModelAttribute
		//repo.save(employee);
			 
			//ModelAndView view= new ModelAndView("/");
		
		//	view.addObject("users", repo.findAll());
		//	return view;
			//view.setViewName("Home.jsp");
			//return new ModelAndView("Home.jsp");

			//return "redirect:/Home.jsp";
			
			Employees employe=repo.findById(id)
		.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
			
		employe.setEmail(employeedetails.Email);
		employe.setFirstName(employeedetails.FirstName);
		employe.setLastName(employeedetails.LastName);

		
		 
		 repo.save(employe);
		 
			return new RedirectView("/");
		
		


	}
		
		
		
		
@RequestMapping("user") // this is for oauth2 login
@ResponseBody

public Principal User(Principal principal) {
	
	return principal;
	
}
		
		
		
		
		
		
		
		
		
		
	
	

}






