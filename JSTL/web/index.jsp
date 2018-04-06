<%-- Created by IntelliJ IDEA. --%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
    <%--For Each--%>
    <c:forEach var="i" begin="1" end="10">
      <c:out value="${i}"/>
    </c:forEach>

    <%--Token--%>
    <c:forTokens items = "Car,Bike,Bus" delims = "," var = "name">
      <c:out value = "${name}"/><p>
    </c:forTokens>

      <%--Import Another Website--%>
    <c:import url="http://www.google.com/" ></c:import>

    <%--Establish The Connection To Database--%>
    <s:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/kit" user="root" password=""/>

    <%--Query--%>
    <s:query dataSource="${db}" var="rs">
      select * from balance;
    </s:query>

    <%--&lt;%&ndash;For Each To Display Result Set&ndash;%&gt;--%>
    <c:forEach var="tbl" items="${rs.rows}" >
      <c:out value="${tbl.id}" />
      <c:out value="${tbl.balance}" />
    <%--</c:forEach>--%>


  </body>
</html>