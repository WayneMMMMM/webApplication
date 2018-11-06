document.addEventListener('copy', function(e) {
  e.clipboardData.setData('text/plain', 'Protected Content');
  alert('You are not allowed to copy our secured content!');
  e.preventDefault();
});

document.addEventListener('contextmenu', function (e) {
  e.preventDefault();
});