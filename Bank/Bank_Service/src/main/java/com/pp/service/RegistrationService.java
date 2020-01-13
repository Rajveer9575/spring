package com.pp.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.model.User;
import com.pp.repository.RegistrationRepository;

@Service
public class RegistrationService {

	@Autowired
	RegistrationRepository registrationRepository;
	
	public User serviceRegistration(User user){
		System.out.println("Inside service Registration:"+user.getFirstName());
		System.out.println("Inside service Registration:"+user.getLastName());
		System.out.println("Inside service Registration:"+user.getEmailId());
		System.out.println("Inside service Registration:"+user.getPassword());
		System.out.println("Inside service Registration:"+user.getContactNo());
		System.out.println("................................................");
		registrationRepository.registrationRepo(user);
		return user;
	}
	
}
