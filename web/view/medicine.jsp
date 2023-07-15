<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <th>Name</th>
                <th>Price</th>
                <th>Information</th>
                <th>Amount</th>
            </tr>
            <c:forEach items="${medicines}" var="medicines">
                <tr>
                    <td class="name">${medicines.name}</td>
                    <td class="price">${medicines.price}</td>
                    <td class="information">${medicines.information}</td>
                    <td class="amount">${medicines.amount}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
