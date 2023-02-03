
<%@page import="bcci.playing.teams.Player"%>
<%@page import="java.util.List"%>
<html>
 <head></head>
 <body>
  <%
  String h = (String)request.getAttribute("heading");
  %>
   <h1><%=h %></h1>
   
    <table border="1">
      <tr>
         <th>No.</th>
         <th>First Name</th>
         <th>Last Name</th>
         <th>Age</th>
         <th>Type</th>
      </tr>
     <%
        List<Player> list = (List<Player>)request.getAttribute("team");
       for(int i =0 ; i <list.size(); i++){
    	   Player p = list.get(i);
     %>
     <tr>
       <td><%=i+1 %></td>
       <td><%=p.getFirstName()%></td>     
       <td><%=p.getLastName() %></td>
       <td><%=p.getAge() %></td>
       <td><%=p.getType() %></td>
      </tr>   
    
     <%	   
       }
     %>
      
    </table>
 </body>
 </html>