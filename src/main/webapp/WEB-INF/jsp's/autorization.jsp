<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link rel="stylesheet" href="css's/registration.css">
  <title>Document</title>
</head>
<body>
  <div class="autoriz">
    <form action="authProcess" method="post" align="center">
      <h2>Авторизация</h2>
      <hr width="25%">
      <p>
        <label for="login" class="floatLabel" title="Login"></label>
        <input id="login" name="login" type="text" placeholder="login">
      </p>
      <p>
        <label for="password" class="floatLabel"></label>
        <input id="password" name="password" type="text" placeholder="password">
      </p>
      <p>
        <input type="submit" value="Login" id="submit">
      </p>
      <p><a href="/registration">Регистрация</a></p>
    </form>
  </div>
</body>
</html>
