<%@ page import="java.util.LinkedList" %><%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
    <style>
      #particles-js{
        width: 100%;
        height: 100%;
        background-color: #543E6A;
        background-image: url('galaxy.jpg');
        background-size: cover;
        background-position: 50% 50%;
        background-repeat: no-repeat; }
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

    <center>

    <form action="Validate.jsp" id="back">
      <%
        LinkedList <String> error = new LinkedList<String>();
        error = (LinkedList) request.getAttribute("error");
        if (!(error == null )) {
          out.print(error);
        }
      %> <br>
      Firstname : <input type="text" name="firstname"> <br>
      Lastname : <input type="text" name="lastname"> <br>
      Password : <input type="password" name="pass"> <br>
      Confirm Password : <input type="password" name="cpass"> <br>
      Date of Birth : <input type="date" name="dob"> <br>
      Phone Number : <input type="number" name="phone"> <br>
      Email : <input type="email" name="email"> <br>
        <input type="submit" value="Sign Up">
    </form>
    </center>
  </div>
  <script src="particles.js"></script>
  <script src="js/app.js"></script>
  </body>
</html>