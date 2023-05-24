<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>View Books</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>ISBN</th>
        <th>Name</th>
        <th>Author</th>
    </tr>
    </thead>
    <tbody>
    <c:if test="${editBookSuccess}">
        <div>Successfully edited Book with ISBN: ${savedBook.isbn}</div>
    </c:if>
    <c:if test="${deleteBookSuccess}">
        <div>Successfully deleted Book with ISBN: ${deletedBook.isbn}</div>
    </c:if>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.isbn}</td>
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td>
                <form:form method="GET" action="/book/editBook/${book.isbn}">
                    <input type="submit" value="Edit Book"/>
                </form:form>
            </td>
            <td>
                <form:form method="DELETE" action="/book/deleteBook/${book.isbn}">
                    <input type="submit" value="Delete Book"/>
                </form:form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<button><a href="/book/addBook">Add Book</a></button>
</body>
</html>