<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <head></head>
  <body>
      <form:form action="/addUser" name="test"  method="post">
          Enter User Name : <input type="text" name="username"><br><br>
          Enter User Password :<input type="password" name="password"><br><br>
          <input type="submit" value="submit">
      </form:form>
  
  
  </body>
</html>