package com.pp.validator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.pp.model.User;
@SuppressWarnings("unused")
@Component
public class RegistrationValidator {

	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
	}
	
	public void validate(Object target, Errors errors) {
		User user = (User)target;
		if(user.getFirstName() == null || user.getFirstName().trim().length() ==0) {
			errors.rejectValue("firstName","firstName.required","Enter the firstname");
	   if(user.getLastName() ==null || user.getLastName().trim().length()==0) {
		   errors.rejectValue("lastName", "lastName.required", "Enter the lastname");
	   }
			
		}
	}
}
