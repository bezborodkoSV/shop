<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

</head>
<body>
<form:form method="post" modelAttribute="newProduct" action="/addProduct">
    <h2>Add Link</h2>
    <div>
        <form:input path="productTitle" placeholder="Product title"></form:input>
<%--        <form:errors path="productTitle"></form:errors>--%>
<%--            ${errorProductTitle}--%>
    </div>
    <div>
        <form:input path="description" placeholder="Description"></form:input>
    </div>
    <div>
        <form:input path="cost" placeholder="Your notes about Link"></form:input>
    </div>
    <div>
        <form:input path="currency" placeholder="Your notes about Link"></form:input>
    </div>
    <div>
        <form:select path="productGroup">
            <form:option value="${null}">Select group</form:option>
            <form:options items="${allGroups}" itemLabel="groupTitle" itemValue="id"></form:options>
        </form:select>
    </div>
    <button type="submit" value="save">Add product</button>
</form:form>
</body>
</html>