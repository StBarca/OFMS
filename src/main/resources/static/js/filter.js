app.filter('catFilmName', function () {
	return function (item) {
		if (item && item.length > 9) {
			return item.slice(0, 9) + '...';
		} else {
			return item;
		}
	}
})
app.filter('catFilmDate', function () {
	return function (item) {
		if (item && item.length > 10) {
			return item.slice(0, 10);
		} else {
			return item;
		}
	}
})