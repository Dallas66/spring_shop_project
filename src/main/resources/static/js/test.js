$(window).ready(function() {

  var init = function() {
    popup();
  };

  var isDone = true;

  var popup = function() {

    $('.searchBtn').on('click', function() {
      $('#quickSearch').fadeToggle();

    });
    $('.close').on('click', function() {
      $('#quickSearch').fadeOut();
    });
  };
  init();
});
$(window).ready(function() {

  var init = function() {
    popup1();
  };

  var isDone = true;

  var popup1 = function() {

    $('.myBtn').on('click', function() {
      $('#myBag').fadeToggle();

    });
    $('.close').on('click', function() {
      $('#myBag').fadeOut();
    });
  };
  init();
});

