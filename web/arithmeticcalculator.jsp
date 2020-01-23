<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 22, 2020, 4:28:04 PM
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
              <h1>Arithmetic Calculator</h1>
              First: <input type="text" name="first" value="${first}"/><br>
              Second: <input type="text" name="second" value="${second}" /><br><br>
              <input type="submit" name="operation" value="+" />
              <input type="submit" name="operation" value="-" />
              <input type="submit" name="operation" value="*" />
              <input type="submit"  name="operation" value="%" />
              <p>Result: ${result}</p>
              <p><a href="/Week02Lab_Calculators/age">Age Calculator</a></p>
        </form>
    </body>
</html>
