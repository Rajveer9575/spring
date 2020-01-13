<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head></head>
<body text-align="center">
 
<form:form method="POST" action="showLogin.do" modelAttribute="AdminLogin">
   <table width = "40%" border="0" align="center">
      <tr>
          <td align="center"><p>Email</p></td>
          <td><form:input path="emailId" id="emailId"/></td>
      </tr>
      
      <tr>
         <td align="center"><p>Password</p></td>
         <td><form:password path="password" id="password"/></td>   
      </tr>
      
      <tr align="center">
         <td><a href="registration.do"><p>SIGNUP</p></a></td>
         <td align="left"><input type="submit" value="SUBMIT"></td>
      </tr>          
   </table>
</form:form> 
</body>
<br>
<br>
<br>
<br>

</html>