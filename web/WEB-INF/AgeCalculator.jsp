<%-- 
    Document   : AgeCalculator
    Created on : 20-Sep-2022, 4:33:34 PM
    Author     : puppi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AC</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age" value="${age}">
            <br>
             <input type="submit" value="Age Next Birthday">
               <p>${message} ${intAge}</p>
               <a href="ACal">Arithmetic Calculator</a> <!-- goto web xml and change url -->
            
        </form>
    </body>
</html>
