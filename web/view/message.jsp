<%-- 
    Document   : login
    Created on : Jul 19, 2023, 1:47:14 AM
    Author     : giang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%String message = (String) request.getAttribute("message");%>
        <h1><%out.print(message);%></h1>
    </body>
</html>
