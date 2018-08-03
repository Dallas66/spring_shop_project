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
<div class="autoriz">
    <form:form action="autorization" method="post" modelAttribute="loginModel" align="center">
        <h2>Авторизация</h2>
        <hr width="25%">
        <div class="content">
            <div>
                    <%--<label for="login" class="floatLabel" title="Login"></label>--%>
                <form:input path="login" id="login" name="login" type="text" placeholder="login"/><br>
                <form:errors path="login"/>
            </div>
            <div>
                    <%--<label for="password" class="floatLabel"></label>--%>
                <form:input path="password" id="password" name="password" type="text" placeholder="password"/><br>
                <form:errors path="password"/>
            </div>
            <div>
                <form:button name="loginbut" id="loginbut">Login</form:button>
            </div>
            <p><a href="/registration">Регистрация</a></p>
        </div>
    </form:form>
</div>
</body>
</html>
