<%--
  Created by IntelliJ IDEA.
  User: rldnd
  Date: 2020-03-12(012)
  Time: 오후 4:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>event list</h1>
<h2>${message}</h2>
<table>
    <tr>
        <th>이름</th>
        <th>시작</th>
    </tr>
    <c:forEach items="${events}" var="event">
        <tr>
            <td>${event.name}</td>
            <td>${event.startTime}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
