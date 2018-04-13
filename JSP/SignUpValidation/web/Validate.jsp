<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.LinkedList" %><%--
  Created by IntelliJ IDEA.
  User: chhun
  Date: 2/9/2018
  Time: 10:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        char[] firstname = request.getParameter("firstname").toCharArray();
        char[] lastname = request.getParameter("lastname").toCharArray();
        char[] pass = request.getParameter("pass").toCharArray();
        char[] cpass = request.getParameter("cpass").toCharArray();
        String dob = request.getParameter("dob");
        char[] phone = request.getParameter("phone").toCharArray();
        char[] email = request.getParameter("email").toCharArray();

        LinkedList <String> error = new LinkedList<String>();


        if (firstname.length != 0) {
            for (int i =0; i < firstname.length; i++) {
                if (!(Character.isAlphabetic(firstname[i]) || firstname[i] == ' ')) {
                    error.add("Invalid Firstname");
                    // RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                    // rd.forward(request, response);
                }
            }
        }
        else {
            error.add("Invalid Firstname");
//            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//            rd.forward(request, response);
        }

        if (lastname.length != 0) {
            for (int i =0; i < lastname.length; i++) {
                if (!(Character.isAlphabetic(lastname[i]) || lastname[i] == ' ')) {
                    error.add("Invalid Lastname");
//                    RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//                    rd.forward(request, response);
                }
            }
        }
        else {
            error.add("Invalid Lastname");
            //RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//            rd.forward(request, response);
        }

        if (pass.length != 0) {
            int upp = 0, low =0, sym =0, num = 0, ch =0;
            for (int i =0; i < pass.length; i++) {
                if (Character.isUpperCase(pass[i])) {
                    upp++;
                }
                else if (Character.isLowerCase(pass[i])) {
                    low++;
                }
                else if (Character.isDigit(pass[i])) {
                    num++;
                }
                else {
                    sym++;
                }
            }
            if (!( upp > 0 && low > 0 && sym > 0 && num > 0 )) {
                error.add("Invalid Password");
//                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//                rd.forward(request, response);
            }
        }
        else {
            error.add("Invalid Password");
//            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//            rd.forward(request, response);
        }

        if (cpass.length != 0) {
            boolean confirm = Arrays.equals(pass, cpass);
            if (!(confirm)) {
                error.add("Confirm Password does not match");
//                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//                rd.forward(request, response);
            }
        }
        else {
            error.add("Confirm Password does not match");
//            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//            rd.forward(request, response);
        }

        if (dob.isEmpty()) {
            error.add("Invalid Date of Birth");
//            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//            rd.forward(request, response);
        }

        if (phone.length > 14 || phone.length < 8) {
            error.add("Invalid Phnoe Number");
//            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//            rd.forward(request, response);
        }
        else {
            for (int i =0; i < phone.length; i++) {
                if (!(Character.isDigit(phone[i]))) {
                    error.add("Invalid Phnoe Number");
//                    RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//                    rd.forward(request, response);
                }
            }
        }

        if (email.length != 0) {
            int ad = 0;
            for (int i =0; i < email.length; i++) {
                if ( email[i] == '@') {
                    ad++;
                }
            }
            if (ad != 1) {
                error.add("Invalid Email");
//                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//                rd.forward(request, response);
            }
        }
        else {
            error.add("Invalid Email");
//            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//            rd.forward(request, response);
        }

        System.out.println(error);

        if (error.isEmpty()) {
            RequestDispatcher rd = request.getRequestDispatcher("SuccessPage.jsp");
            rd.forward(request, response);
        }
        else {
            request.setAttribute("error", error);
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }
    %>

</body>
</html>
