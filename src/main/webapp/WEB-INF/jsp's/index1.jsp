<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <title>test title</title>
  <link rel="stylesheet" href="../css's/main.css">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

</head>

<body>
  <div id="myHeader">
    <div class="menu">
      <ul class="nav">
        <li class="left"><a href="#">Name: ${user.name}</a></li>
        <li class="left"><a href="#">Logout</a></li>
        <li class="right"><i class="fas fa-shopping-cart" aria-hidden="true"><span id="itemCount">2</span></i></li>
        <li class="right"><a href="#0" class="myBtn">Bag</a></li>
        <li class="right"><a href="#0" class="searchBtn">Search</a></li>
      </ul>
    </div>
  </div>

  <section>
      <h1 class="sticky">Категория товаров 1</h1>
      <hr width="75%">
    <div class="site">
      <div class="title">
          <c:forEach items="${list}" var="product">
            <div class="item">
            <img src= ${product.img} />
            <a href="#quick-view-pop-up${product.id}" class="btn-view">${product.name}</a>
            <div id="quick-view-pop-up${product.id}" class="overlay">
                <div class="modal-content-prod">
                  <a class="close" href="#">&times;</a>
                  <div class="image"><img src="../img/product.png" alt="Product"></div>
                  <div class="texta">${product.description}</div>
                  <div class="textb">${product.price} руб.</div>
                  <div class="textc"><a href="#add-to-bag">Add to cart</a></div>
                </div>
            </div>
           </div>
          </c:forEach>
      <h1 class="sticky">Категория товаров 2</h1>
        <hr width="75%">
      <div class="title">
          <c:forEach items="${listt}" var="product">
              <div class="item">
                  <img src= ${product.img} />
                  <a href="#quick-view-pop-up${product.id}" class="btn-view">${product.name}</a>
                  <div id="quick-view-pop-up${product.id}" class="overlay">
                      <div class="modal-content-prod">
                          <a class="close" href="#">&times;</a>
                          <div class="image"><img src="../img/product.png" alt="Product"></div>
                          <div class="texta">${product.description}</div>
                          <div class="textb">${product.price} руб.</div>
                          <div class="textc"><a href="#add-to-bag">Add to cart</a></div>
                      </div>
                  </div>
              </div>
          </c:forEach>
      </div>
    </div>
  </section>
  <hr>
  <ul class="endstr">
    <li class="endcen">
      <p>Some information</p>
    </li>
    <li class="endright">
      <p>Info</p>
    </li>
  </ul>



  <div id="myBag">
    <div class="modal-content">
      <div class="modal-header">
        <span class="close">&times;</span>
        <h2>Корзина</h2>
        <hr width="50%">
      </div>
      <div class="modal-body">
        <div class="cart-content">
          <div class="cart-sections">
            <ul class="cart-list">
              <li class="cart-list-item">
                <div class="cart-body">
                  <div class="cart-item-img"><img src="../img/product.png" /></div>
                  <div class="cart-item-description">
                    <span>
												<p class="cart-item-label">Metropolitan Clock</p>
												<p class="cart-item-price">$200.00</p>
											</span>
                  </div>
                  <div class="cart-item-trash">
                    <span class="item-trash-ic">&#10799;</span>
                  </div>
                </div>
              </li>
              <li class="cart-list-item">
                <div class="cart-body">
                  <div class="cart-item-img"><img src="../img/product.png" /></div>
                  <div class="cart-item">
                    <div class="cart-item-description">
                      <span>
												<p class="cart-item-label">Mondaine Helvetica</p>
												<p class="cart-item-price">$950.00</p>
											</span>
                    </div>
                  </div>
                  <div class="cart-item-trash">
                    <span class="item-trash-ic">&#10799;</span>
                  </div>
                </div>
              </li>
            </ul>
          </div>
        </div>
      </div>
      <div class="modal-footer">
        <div class="footerSum">
          <p class="a">Сумма товаров</p>
          <p class="b">Скидка</p>
          <p class="b">Итог</p>
        </div>
        <div class="footerSum1">
          <p class="a">10000</p>
          <p class="b">10%</p>
          <p class="b">9000</p>
        </div>
        <div class="textbag">Оформить</div>
      </div>
    </div>
  </div>



  <div id="quickSearch">
    <div class="modal-content-search">
      <span class="close">&times;</span>
      <h2>Поиск</h2>
      <hr width="55%">
      <div class="center-test">
      <p>
        <label for="Search" class="floatLabel" title="Search"></label>
        <input id="Search" name="Search" type="text" placeholder="Search" align="center">
      </p>
      <p>
        <input type="submit" value="Search" id="submit" align="center">
      </p>
      <ul class="products">
        <li>
          <div class="itemSearch">
            <img src="../img/product.png" />
            <a href="#0" class="btn-view">product</a>
          </div>
        </li>
        <li>
          <div class="itemSearch">
            <img src="../img/product.png" />
            <a href="#0" class="btn-view">product</a>
          </div>
        </li>
        <li>
          <div class="itemSearch">
            <img src="../img/product.png" />
            <a href="#0" class="btn-view">product</a>
          </div>
        </li>
    </ul>
    </div>
    </div>
  </div>

</body>

<%--<script>--%>
  <%--$(window).ready(function() {--%>

    <%--var init = function() {--%>
      <%--popup();--%>
    <%--};--%>

    <%--var isDone = true;--%>

    <%--var popup = function() {--%>

      <%--$('.btn-view').on('click', function() {--%>
        <%--$('#quick-view-pop-up').fadeToggle();--%>

      <%--});--%>
      <%--$('.close').on('click', function() {--%>
        <%--$('#quick-view-pop-up').fadeOut();--%>
      <%--});--%>
    <%--};--%>
    <%--init();--%>
  <%--});--%>
<%--</script>--%>

<%--<script>--%>
  <%--$(window).ready(function() {--%>

    <%--var init = function() {--%>
      <%--popup1();--%>
    <%--};--%>

    <%--var isDone = true;--%>

    <%--var popup1 = function() {--%>

      <%--$('.myBtn').on('click', function() {--%>
        <%--$('#myBag').fadeToggle();--%>

      <%--});--%>
      <%--$('.close').on('click', function() {--%>
        <%--$('#myBag').fadeOut();--%>
      <%--});--%>
    <%--};--%>
    <%--init();--%>
  <%--});--%>
<%--</script>--%>

<%--<script>--%>
<%--$(window).ready(function() {--%>

  <%--var init = function() {--%>
    <%--popup();--%>
  <%--};--%>

  <%--var isDone = true;--%>

  <%--var popup = function() {--%>

    <%--$('.searchBtn').on('click', function() {--%>
      <%--$('#quickSearch').fadeToggle();--%>

    <%--});--%>
    <%--$('.close').on('click', function() {--%>
      <%--$('#quickSearch').fadeOut();--%>
    <%--});--%>
  <%--};--%>
  <%--init();--%>
<%--});--%>
<%--</script>--%>
<!-- <script>
  var itemCount = 0;

  $('.textc').click(function() {
    itemCount++;
    $('#itemCount').html(itemCount).css('display', 'block');
  });
</script> -->
<script src="../js/test.js"></script>

</html>
