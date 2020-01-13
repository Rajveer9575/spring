package com.pp.controller;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.pp.model.User;
import com.pp.service.RegistrationService;

@Controller
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;
	
	@RequestMapping(value="/registration")
	public String showRegistration(Map <String, Object> map) {
		System.out.println("Inside Registration Controller ");
		User usr = new User();
		map.put("regUser",usr);
		return "registration";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String controllerRegistration(@ModelAttribute("regUser") User user) {
		System.out.println("Inside controllerRegistration: "+user.getFirstName());
		System.out.println("Inside controllerRegistration: "+user.getLastName());
		System.out.println("Inside controllerRegistration: "+user.getEmailId());
	    System.out.println("Inside controllerRegistration: "+user.getPassword());
	    System.out.println("Inside controllerRegistration: "+user.getContactNo());
	    System.out.println("....................................................");
	    user=registrationService.serviceRegistration(user);
		return "showLogin.do";
	}}
