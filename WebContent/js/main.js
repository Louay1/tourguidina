$('.right')
  .on('click', function() {
    console.log('right');
    $('.slide')
      .siblings('.active:not(:last-of-type)') 
      .removeClass('active')
      .next()
      .addClass('active');
});

$('.left')
  .on('click', function() {
    $('.slide')
      .siblings('.active:not(:first-of-type)')
      .removeClass('active')
      .prev()
      .addClass('active');
});
 
