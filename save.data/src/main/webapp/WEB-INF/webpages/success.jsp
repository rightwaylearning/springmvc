<%@page import="rwl.save.data.controller.beans.User"%>
<%@page import="java.util.List"%>
<html>
  <head></head>
  <body>
     <h4>User login details saved!!</h4><br>
     
       <h1>User details For login</h1>
     
        <table border="1">
         <tr>
            <th>No.</th>
            <th>User Name</th>
            <th>User Password</th>
         </tr>
         <%
            List<User> list = (List<User>)request.getAttribute("userList");
            int cnt = 0;  
            for(User user:list){
            	cnt++;          
         %>
         <tr>
           <td><%=cnt %></td>
           <td><%=user.getUsername() %></td>
           <td><%=user.getPassword() %></td>
         </tr>
          <%
            }
          %>
        </table>
     
     
     
     <a href="/">Back</a>
  </body>
</html>