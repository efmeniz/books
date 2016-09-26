'use strict';

angular.module('myApp.books', ['ngRoute', 'ngResource'])

    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/books', {
            templateUrl: 'books/books.html',
            controller: 'BooksController'
        });
    }])

    .service('BooksService', ['$resource',
        function ($resource) {
            return {
                books: $resource(globalResource + "api/books", {}, {
                    get: {
                        method: 'GET',
                        cache: true
                    }
                })
            };
        }])
    .controller('BooksController', ['BooksService', '$scope', function (BooksService, $scope) {
        $scope.query = {
            limit: 10,
            page: 1
        };

        function success(books) {
            $scope.books = books;
        }

        $scope.getBooks = function () {
            $scope.promise = BooksService.books.get($scope.query, success).$promise;
        };
        $scope.getBooks();
    }]);
