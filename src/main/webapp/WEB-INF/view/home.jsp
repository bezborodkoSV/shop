<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<h1>Hi</h1>
<form:select path="allGroups">
    <form:option value="${null}">Select group</form:option>
    <form:options items="${allGroups}" itemLabel="groupTitle" itemValue="id"></form:options>
</form:select>
<table>
    <thead>
    <th>Product</th>
    <th>Description</th>
    </thead>
<c:forEach items="${listProducts}" var="product">
    <tr>
        <td>${product.productTitle}</td>
        <td>${product.description}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>