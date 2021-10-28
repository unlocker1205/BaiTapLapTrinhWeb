$(function () {
    var $div = $(document.getElementById('img'));
    rotate(0);

    function rotate(degree) {
        $div.css({WebkitTransform: 'rotate(' + degree + 'deg)'});
        setTimeout(function () {
            rotate(degree += 15);
        }, 2000);
    }
});