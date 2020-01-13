package com.pp.repository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.pp.model.User;

@Repository
public class LoginRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public User userSignIn(User user) {
		System.out.println("Inside Login Repository");
		System.out.println("Inside userSignIn :" +user.getEmailId());
		System.out.println("Inside user" + "SignIn: "+user.getPassword());
		System.out.println(".......................................");
		return user;
	}
	
	public List<User> repoCheckin(String emailId, String password) {
			
			List<User> list = hibernateTemplate.find("from User us where  us.emailId = ? and us.password = ?", emailId, password);	
			System.out.println(list);
		  System.out.println("inside repo's checkin method");
			return list;
		
  }
	
}
