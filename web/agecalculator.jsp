<%-- 
    Document   : agecalculator.jsp
    Created on : Jan 20, 2020, 1:28:19 PM
    Author     : 792807
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
        <h1>Age Calculator</h1>
        Enter your age: <input type="text" name="age" /><br><br>
        <input type="submit" value="Age next birthday" /><br>
        <p>${message}</p>
        <p><a href="/Week02Lab_Calculators/arithmetic">Arithmetic Calculator</a></p>
        </form>
    </body>
</html>
