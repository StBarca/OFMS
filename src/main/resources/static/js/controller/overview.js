app.controller('overview', ['$scope', function ($scope) {
	$scope.filmOverview = null;
}]);
app.directive('overviewDirective', ['request', function (request) {
	return {
		restrict: 'AE',
		link: function (scope, ele, attrs) {
			//分类不显示
			scope.$emit('classify_change', false);
			var tmp_star;
			request.get('/film/' + sessionStorage.getItem('filmID'), function (res) {
				if (res.code == 0) {
					scope.filmOverview = res.body;
					tmp_star = res.body.star;
					if (tmp_star) {
						scope.filmOverview.star = tmp_star.slice(1, tmp_star.length - 1).split(',');
					} else {
						scope.filmOverview.star = ['0%', '0%', '0%', '0%', '0%'];
					}
				} else {
					request.pop_up(res.message);
				}
			})
		}
	}
}])