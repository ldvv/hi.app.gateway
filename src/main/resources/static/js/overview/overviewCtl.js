angular.module('overview', ['headerMode']).controller('overviewCtl', ['$scope', function($scope){
    $scope.overviewNow = true;

}]);

$().ready(function(e) {
    var unslider04 = $('#b04').unslider({
            dots: true
        }),
        data04 = unslider04.data('unslider');

    $('.unslider-arrow04').click(function() {
        var fn = this.className.split(' ')[1];
        data04[fn]();
    });
});