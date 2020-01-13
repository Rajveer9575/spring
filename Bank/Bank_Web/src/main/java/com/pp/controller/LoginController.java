package com.pp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import com.pp.model.User;
import com.pp.service.LoginService;
@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping("/showLogin")
	public String showLogin(Map<String,Object> map) {
		System.out.println("Inside Controller");
		User user = new User();
		map.put("AdminLogin", user);
		return "login";
	}
	
	@RequestMapping(value="/showLogin", method=RequestMethod.POST)
	public String signInAction(@ModelAttribute("AdminLogin") User user) {
		System.out.println("Inside signInAction: "+user.getEmailId());
	    System.out.println("Inside signInAction: "+user.getPassword());
	    user = loginService.validateEmail_Password(user);
	    List <User> list = loginService.serviceCheckIn(user);
	    Iterator <User> itr = list.iterator();
	    while(itr.hasNext()) {
	    	User u = (User)itr.next();
	    	System.out.println(u.getEmailId()+" "+u.getPassword());
	    }
		return "login";
	}
}
