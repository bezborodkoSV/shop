<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pushk
  Date: 04.04.2022
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<a href="/administration/addGroup">Create group</a>
<h1>Groups management</h1>
<table>
    <thead>
    <th>Group</th>
    <th>Description</th>
    <th>Amount products</th>
    </thead>
    <c:forEach items="${allGroups}" var="group">
        <tr>
            <td>${group.groupTitle}</td>
            <td>${group.groupDescription}</td>
            <td>${group.products.size()}</td>
            <td>
                <form method="post" action="/administration/deleteGroup">
                    <input type="hidden" value="${group.groupTitle}" name="groupTittle">
                    <button type="submit">Delete</button>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
