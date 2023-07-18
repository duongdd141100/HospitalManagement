<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="css/medicine.css" rel="stylesheet" type="text/css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="app">
            <table class="data-table">
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Information</th>
                    <th>Amount</th>
                </tr>
                <c:forEach items="${medicines}" var="medicines">
                    <tr class="row-data">
                        <td class="id">${medicines.id}</td>
                        <td class="name">${medicines.name}</td>
                        <td class="price">${medicines.price}</td>
                        <td class="information">${medicines.information}</td>
                        <td class="amount">${medicines.amount}</td>
                    </tr>
                </c:forEach>
            </table>
          </div>

          <div id="myModal" class="modal">
            <!-- Modal content -->
            <div class="modal-content">
              <span class="close">&times;</span>
              <form action="medicine" method="POST">
                <label for="id">ID:</label><br />
                <input type="text" readonly name="id" id="id" />
                <label for="name">Name:</label><br />
                <input
                  class="input"
                  type="text"
                  id="name"
                  name="name"
                  value=""
                /><br />
                <label for="price">Price:</label><br />
                <input
                  class="input"
                  type="number"
                  id="price"
                  name="price"
                  value=""
                /><br /><br />
                <label for="information">Information:</label><br />
                <input
                  class="input"
                  type="text"
                  id="price"
                  name="information"
                  value=""
                /><br /><br />
                <label for="amount">Amount:</label><br />
                <input
                  class="input"
                  type="number"
                  id="amount"
                  name="amount"
                  value=""
                /><br /><br />
                <input class="input" submit="submit" type="submit" value="Submit" />
              </form>
            </div>
          </div>

          <script src="js/medicine.js"></script>
    </body>
</html>
