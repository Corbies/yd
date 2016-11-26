/**
 * Created by cxj on 2016/11/25.
 */
$(function () {
    $(window).on('resize', function () {
    });
    $(window).resizeEnd({
        delay: 500
    }, function () {
        var $body = $('body');
        var $ww = $(window).width();
        if ($ww > 1500) {
            $body.removeClass();
        } else if ($ww < 1500 && $ww > 1000) {
            $body.attr('class', 'window-width-1000-to-1500');
        } else if ($ww < 1000) {
            $body.attr('class', 'window-width-lt1000');
        }
    });
    $(window).resizeEnd();
});