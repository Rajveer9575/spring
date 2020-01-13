
package com.pp.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pp.model.User;
import com.pp.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	public User validateEmail_Password(User user){
		System.out.println("Inside validateEmail_Password: "+user.getEmailId());
		System.out.println("Inside validateEmail_Password: "+user.getPassword());
		System.out.println("...................................................");
		user = loginRepository.userSignIn(user);
		return user;
	}
	
	public List  <User> serviceCheckIn(User user) {
		List<User> list = loginRepository.repoCheckin(user.getEmailId(), user.getPassword());
		System.out.println("Inside Service checkin method");
		return list;
	}
}
