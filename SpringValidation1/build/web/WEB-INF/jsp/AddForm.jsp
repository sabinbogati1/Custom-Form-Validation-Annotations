<%-- 
    Document   : AddForm
    Created on : Jun 12, 2017, 5:26:06 PM
    Author     : Sabin Bogati
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="SITE_URL" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add Form</h1>
        
        <form:errors path="sabin1.*" />
        
         <form action="${SITE_URL}/submitForm" method="POST">
            <label> Name: </label>
            <input type="text" name="studentName"  />
            <br/> <br/>
            
             <label> Hobby: </label>
            <input type="text" name="studentHobby"  />
            <br/> <br/>
            
             <label> Mobile: </label>
            <input type="text" name="studentMobile"  />
            <br/> <br/>
            
           <label> Date of birth: </label>
            <input type="text" name="studentDOB"  />
            <br/> <br/>
            
            <label> Student's skill </label>
            <select name="studentSkills" multiple >
                <option value="Java Core"> Java Core</option>
                <option value="Spring Core">Spring Core</option>
                <option value="Spring MVC"> Spring MVC</option>
            </select>
        <br />
        <br/>
            
            <input type="submit" value="submit" />
        </form>
        
        
    </body>
</html>
