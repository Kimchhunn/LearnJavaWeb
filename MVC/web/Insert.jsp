<%--
  Created by IntelliJ IDEA.
  User: chhun
  Date: 2/23/2018
  Time: 4:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        #particles-js{
            width: 100%;
            height: 100%;
            background-color: #543E6A;
            background-image: url('galaxy.jpg');
            background-size: cover;
            /*background-position: 50% 50%;*/
            background-repeat: repeat; }
        #back {
            background-color: transparent;
            color: white;
        }
        input {
            background-color: transparent;
            color: white;
        }

    </style>
</head>
<body>
    <div id="particles-js" style="width: 100%; height: 100%;" >
    <%
        String exist = (String) request.getAttribute("exist");
        if (exist != null) {
            out.println(exist);
        }
    %>
    <form action="Next" id="back">
        Username : <input type="text" name="name"> <br>
        Password : <input type="password" name="password"> <br>
        Age : <input type="number" name="age"> <br>
        Phone : <input type="text" name="phone"> <br>
        Email : <input type="email" name="email"> <br>
        <input type="submit" value="Sign Up"> <br>
    </form>

    <script src="particles.js"></script>
    <script src="js/app.js"></script>
</body>
</html>
