<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
     <form:form method="POST" action="register.do" modelAttribute="regUser">
     <table width="50%" border="0" align="center">
      <tr>
         <td align="center"><p align="center">Enter FirstName</p></td>
         <td><form:input path="firstName" id="firstName"/></td>  
      </tr>
      
      <tr>
         <td align="center"><p align="center">Enter LastName</p></td>
         <td><form:input path="lastName" id="lastName"/></td>
      </tr>
     
      <tr>
          <td ><p align="center">Enter Email-Id</p></td>
          <td><form:input path="emailId" id="emailId"/></td>
      </tr>
      
       <tr>
          <td align="center"><p align="center">Enter Password</p></td>
          <td><form:password path="password" id="password"/></td>
      </tr>
      
      <tr>
          <td align="center"><p align="center">Enter Contact No</p></td>
          <td><form:input path="contactNo" id="contactNo"/></td>
      </tr>
      
      <tr align="center"><td><input type="submit" value="SUBMIT"></td></tr>
     </table>
     </form:form>
</body>
</html>