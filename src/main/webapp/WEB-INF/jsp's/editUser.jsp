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
<a href="/index1">Back to menu</a>

<br/>
<br/>


<h1>Add product</h1>
<form:form action="/admin/edit" method="post" modelAttribute="product">
    <table>
        <tr>
            <td>
                <form:label path="id" >
                    <spring:message text="ID"/>
                </form:label>
            </td>
            <td>
                <form:input path="id" readonly="true"  size="8"/>
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
                    <input type="submit"  value="<spring:message text="Редактировать товар"/>"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>