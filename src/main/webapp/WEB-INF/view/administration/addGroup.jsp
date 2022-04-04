<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: pushk
  Date: 04.04.2022
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <form:form method="post" modelAttribute="newGroup" action="/administration/addGroup">
        <h2>Add Link</h2>
        <div>
            <form:input path="groupTitle" placeholder="Product title"></form:input>
                <%--        <form:errors path="productTitle"></form:errors>--%>
                <%--            ${errorProductTitle}--%>
        </div>
        <div>
            <form:input path="groupDescription" placeholder="Description"></form:input>
        </div>
        <button type="submit" value="save">Add Group</button>
    </form:form>
</head>
<body>

</body>
</html>
