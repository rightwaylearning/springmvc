<%@page import="spring.mvc.crud.opt.crud.opt.model.User"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
 <head></head>
 <body>
    <form:form name="updateform" action="/update" method="post">
       <%
         User user = (User) request.getAttribute("user");
       %>
    
      <table>
        
        <tr>
         <td>Enter User Id:</td>
         <td><input type="text" name="userId" readonly="readonly" value="<%=user.getUserId()%>"></td>
        </tr>
        
        <tr>
         <td>Enter User First Name:</td>
         <td><input type="text" name="firstName" value="<%=user.getFirstName()%>"></td>
        </tr>
        
        <tr>
         <td>Enter User Last Name:</td>
         <td><input type="text" name="lastName" value="<%=user.getLastName()%>"></td>
        </tr>
        
        <tr>
         <td>Enter User Age:</td>
         <td><input type="text" name="age" value="<%=user.getAge()%>"></td>
        </tr>
        
        <tr>
         <td>Enter User Gender:</td>
         <td><input type="text" name="gender" value="<%=user.getGender()%>"></td>
        </tr>
       
               
         <tr>
         <td><input type="submit" value="Update"></td>
        </tr>
      
      </table>
    
    </form:form>
 </body>
</html>