<%-- 
    Document   : CreateAcc
    Created on : 9 Nov 2022, 19:43:22
    Author     : LukeF
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Create New User</h1>
        
        <form action="NewUserServlet" method="post">
            <input id="id" type="text" name="id" placeholder="id" required/><br/>
            <input id="fname" type="text" name="fname" placeholder="fname" required/><br/>
            <input id="surname" type="text" name="surname" placeholder="surname" required/><br/>
            <input id="age" type="text" name="age" placeholder="age" required/><br/>
            <input id="add" type="text" name="add" placeholder="add" required/><br/>
            <input id="pass" type="text" name="pass" placeholder="pass" required/><br/>
            <button type ="submit" value="Submit">submit</button>
        </form>
    </body>
</html>
