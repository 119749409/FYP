<%@page import="java.util.ArrayList"%>
<%@page import="Model.Patient"%>
<%@page import="Model.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
       <%ArrayList<Patient> patients = new ArrayList<Patient>();
        patients = (ArrayList<Patient>)request.getAttribute("patients");%>
    <body>
        <h1>List Of Patients</h1>
        
        <table>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Surname</th>
                <th>Age</th>
                <th>Address</th>
                <th>Pass</th>
            </tr>
            <%for(int i = 0; i < patients.size(); i++){%>
            <tr>
                <td><%=patients.get(i).getPatientID()%></td>
                <td><%=patients.get(i).getfName()%></td>
                <td><%=patients.get(i).getSurname()%></td>
                <td><%=patients.get(i).getAge()%></td>
                <td><%=patients.get(i).getAddress()%></td>
                <td><%=patients.get(i).getPass()%></td>
            </tr>
            <%};%>
        </table>
    </body>
</html>
