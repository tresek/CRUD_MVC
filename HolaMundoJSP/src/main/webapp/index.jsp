<%-- 
    Document   : index
    Created on : 21-05-2020, 21:49:25
    Author     : APIUXNB1024
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Hola mundo JSP</title>
    </head>
    <body>
        <h1>Hola Mundo JSPs </h1>
        <ul>
            <li> <% out.print("Hola Mundo con Scriplets"); %> </li>
            <li> ${"Hola Mundo con Expression Lenguaje (EL)"} </li>
            <li> <%= "Hola Mundo con expresiones" %> </li>
            <li> <c:out value="Hola Mundo con jstl"/> </li>
            
        </ul>
    </body>
</html>
