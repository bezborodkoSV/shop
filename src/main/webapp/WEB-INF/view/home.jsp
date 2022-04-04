<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<h1>Hi</h1>

<a href="/administration">administration</a>

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
            <td>
<%--                <a href="productPage/${product.productTitle}">${product.productTitle}--%>
                    <form action="/productPage"
<%--                    /${productTittle}" --%>
                          method="post">
                        <input type="hidden" name="idProduct" value="${product.id}">
                        <input type="hidden"  name="productTittle" value="${product.productTitle}">
                        <button type="submit" value="${product.productTitle}">${product.productTitle}</button>
<%--                        <a href="productPage/${product.productTitle}" >${product.productTitle}</a>--%>
                    </form>
<%--                </a>--%>
            </td>

            <td>${product.description}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>