<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
 <head></head>
 <body>
    <form:form name="form123" action="/save" method="post">
      <table>
        
        <tr>
         <td>Enter User Id:</td>
         <td><input type="text" name="userId"></td>
        </tr>
        
        <tr>
         <td>Enter User First Name:</td>
         <td><input type="text" name="firstName"></td>
        </tr>
        
        <tr>
         <td>Enter User Last Name:</td>
         <td><input type="text" name="lastName"></td>
        </tr>
        
        <tr>
         <td>Enter User Age:</td>
         <td><input type="text" name="age"></td>
        </tr>
        
        <tr>
         <td>Enter User Gender:</td>
         <td><input type="text" name="gender"></td>
        </tr>
        
        <tr>
         <td>Enter User Password:</td>
         <td><input type="password" name="password"></td>
        </tr>
        
         <tr>
         <td><input type="submit" value="save"></td>
         <td><input type="reset" value="clear"></td>
        </tr>
      
      </table>
    
    </form:form>
 </body>
</html>