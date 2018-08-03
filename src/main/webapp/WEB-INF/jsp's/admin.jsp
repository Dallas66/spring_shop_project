<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="../css's/admin.css">
    <title>Document</title>
</head>

<body>
<a href="index1">Back to menu</a>

<br/>
<br/>

<c:url var="addAction" value="/admin/add"/>

<h1>Add product</h1>
<form:form action="${addAction}" modelAttribute="product">
    <table>
            <tr>
                <td>
                    <form:label path="id">
                        <spring:message text="ID"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="id" size="8"/>
                </td>
            </tr>
        <tr>
            <td>
                <form:label path="name">
                    <spring:message text="name"/>
                </form:label>
            </td>
            <td>
                <form:input path="name"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="img">
                    <spring:message text="img"/>
                </form:label>
            </td>
            <td>
                <form:input path="img"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="description">
                    <spring:message text="description"/>
                </form:label>
            </td>
            <td>
                <form:input path="description"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="price">
                    <spring:message text="price"/>
                </form:label>
            </td>
            <td>
                <form:input path="price"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="catName">
                    <spring:message text="catName"/>
                </form:label>
            </td>
            <td>
                <form:input path="catName"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <c:if test="${!empty product.name}">
                    <input type="submit"  value="<spring:message text="Редактировать товар"/>"/>
                </c:if>
                <c:if test="${empty product.name}">
                    <input type="submit" value="<spring:message text="Добавить товар"/>"/>
                </c:if>
            </td>
        </tr>
    </table>
</form:form>


<br/>
<br/>
<br/>
<h1>Product List</h1>
<c:if test="${!empty listProducts}">
    <table class="tg">
        <tr>
            <th width="120">Id</th>
            <th width="120">Name</th>
            <th width="120">Img</th>
            <th width="120">Description</th>
            <th width="120">Price</th>
            <th width="120">Category</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${listProducts}" var="product">
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.img}</td>
                <td>${product.description}</td>
                <td>${product.price}</td>
                <td>${product.catName}</td>
                <td><a href="<c:url value='/admin/edit/${product.id}'/>">Edit</a></td>
                <td><a href="<c:url value='/admin/remove/${product.id}'/> ">Remove</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>