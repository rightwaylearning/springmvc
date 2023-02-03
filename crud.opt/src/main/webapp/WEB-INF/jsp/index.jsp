<%@page import="spring.mvc.crud.opt.crud.opt.model.User"%>
<%@page import="java.util.List"%>
<html>
  <head>
  </head>
  <body>
     <h3> All user information</h3>
     <table border="1">
       <tr>
         <th>No.</th>
         <th>First Name</th>
         <th>Last Name</th>
         <th>Age</th>
         <th>Gender</th>
         <th>Update</th>
         <th>Delete</th>
       </tr>
       
       <% 
         List<User> userList = (List<User>) request.getAttribute("users");
         if(userList != null){
         for(User user:userList){
        %>
       
       <tr>
          <td><%=user.getUserId()%></td>
          <td><%=user.getFirstName() %></td>
          <td><%=user.getLastName() %></td>
          <td><%=user.getGender() %></td>
          <td><%=user.getAge() %></td>
          <td><a href="">update</a></td>
          <td><a href="">delete</a></td>
       </tr>
       
       <% 
          }
        }
       %>
     </table><br><br>
     <a href="/addform">add new user</a>
  </body>
</html>