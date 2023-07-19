<%@page import="model.Medicine"%>
<%@page import="model.HealthcareService"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Medical Record</title>
    <style>
       html, body {
            height: 100%;
            margin: 0;
            display: flex;
            align-items: center;
            justify-content: center;
        }
        /* CSS ?? c?n ch?nh div "container" */
        .container {
            text-align: center;
            border: 2px solid black; /* T?o vi?n k? ?en 2px cho div "container" */
            padding: 20px; /* T?o kho?ng cách gi?a n?i dung và vi?n */
            display: flex;
            flex-direction: column;
            align-items: center;
        }
        /* CSS ?? c?n ch?nh các ph?n t? bên trong "container" */
        label, input, select, textarea, input[type="submit"] {
            margin: 5px; /* T?o kho?ng cách gi?a các ph?n t? */
        }
        /* CSS ?? c?n ch?nh text area theo chi?u r?ng */
        textarea {
            width: 100%;
            box-sizing: border-box;
        }
    </style>
</head>
<body>
     <form action="AddMedicalRecordController" method="post">
    <div class="container">
       
            <%
            List<HealthcareService> healthcareServices = (List<HealthcareService>) request.getAttribute("healthcareServices");
            List<Medicine> medicines = (List<Medicine>) request.getAttribute("medicines");
        %>
        <label>Username of patient:</label>
        <input type="text" id="username" name="username"><br>
        
        <label for="cars">Choose a healthcare service:</label>
        <select name="healthcareservice" id="healthcareservice">
            <%
                for (int i = 0; i < healthcareServices.size(); i++) {
            %>
                <option value="<%=healthcareServices.get(i).getId()%>"><%=healthcareServices.get(i).getName()%></option>
            <%
                }
            %>
        </select><br>

        <label>Choose a medicine:</label>
        <select name="medicine" id="medicine">
            <%
                for (int i = 0; i < medicines.size(); i++) {
            %>
                <option value="<%=medicines.get(i).getId()%>"><%=medicines.get(i).getName()%></option>
            <%
                }
            %>
        </select><br>

        <label>Enter diagnosis:</label>
        <textarea id="diagnosis" name="diagnosis" style="width: 400px; height: 200px"></textarea><br>

        <input type="submit" value="Add Medical Record">
        
        
    </div>
        </form>
</body>
</html>
