<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="../css's/registration.css">
    <title>Document</title>
</head>

<body>
<div class="regist">
    <form:form action="registration" method="post" modelAttribute="user" align="center">
        <h2>Регистрация</h2>
        <hr width="25%">
        <div class="content">
            <div>
                <form:input path="name" id="name" name="name" placeholder="name"/><br>
                <form:errors path="name"/>
            </div>
            <div>
                <form:input path="lname" id="lname" name="lname" placeholder="lname"/><br>
                <form:errors path="lname"/>
            </div>

            <div>
                <form:input path="login" id="login" name="login" placeholder="login"/><br>
                <form:errors path="login"/>
            </div>
            <div>
                <form:input path="password" id="password" name="password" placeholder="password"/><br>
                <form:errors path="password"/>
            </div>
            <div>
                <form:input path="confirmPassword" id="confirmPassword" name="confirmPassword" type="text" placeholder="Confirm Password"/><br>
                <form:errors path="confirmPassword"/>
            </div>

            <p><a href="#">Сообщить об ошибке</a></p>
            <div>
                <form:button id="register" name="register">Register</form:button>
            </div>
        </div>
        <p><a href="autorization">Авторизация</a></p>
    </form:form>
</div>
</body>

</html>
