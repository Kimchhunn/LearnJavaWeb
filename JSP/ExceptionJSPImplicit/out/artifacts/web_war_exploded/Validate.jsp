<%--
  Created by IntelliJ IDEA.
  User: chhun
  Date: 2/9/2018
  Time: 8:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@page errorPage="Error.jsp" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%

        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        String num3 = request.getParameter("num3");
        String num4 = request.getParameter("num4");
        String num5 = request.getParameter("num5");
        String num6 = request.getParameter("num6");

        System.out.println(num1 + num2 + num3 + num4 + num5 + num6);

        if (num1 != null && num2 != null){
            int b = Integer.parseInt(num2);
            int a = Integer.parseInt(num1);
            out.print(b + a);
        }
        else if (num3 != null && num4 != null) {
            String n = null;
            out.print(n);
        }
        else if (num5 != null && num6 != null) {
            char[] text = num5.toCharArray();
            for ( int i =0; i < text.length+4; i++) {
                out.print(text[i]);
            }
        }


    %>

</body>
</html>
