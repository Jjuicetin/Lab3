<%-- 
    Document   : arithmeticcalculator
    Created on : 22-Sep-2022, 10:37:39 AM
    Author     : puppi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>A CALC</title>
  
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
          <form method="post" action="arithmetic"> <!-- need different action, use the url.  -->
              First: <input type="text" name="first" value="${first}">
              <br>
              Second: <input type="text" name="second" value="${second}">
              <br><br>
              <input type="submit" value="+" name="button">
              <input type="submit" value="-" name="button">
              <input type="submit" value="*" name="button">
              <input type="submit" value="%" name="button">
              <br>
              <p>${message} ${result}</p>
              <br>
              <a href="age">Age Calculator</a>
              
        
    </form>
    </body>
</html>
