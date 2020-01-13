package com.pp.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.pp.model.User;
@Repository
public class RegistrationRepository {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public User registrationRepo(User user) {
		
	 System.out.println("registration repository"+user.getFirstName());
     System.out.println("registration repository"+user.getLastName());
     System.out.println("registration repository"+user.getEmailId());
     System.out.println("registration repository"+user.getPassword());
     System.out.println("registration repository"+user.getContactNo());
     
     hibernateTemplate.save(user); 
     return user;
	}
}
