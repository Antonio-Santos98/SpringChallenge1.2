<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Book</title>
</head>
<body>
<c:if test="${editBookSuccess}">
    <div>Successfully edited Book with ISBN: ${savedBook.isbn}</div>
</c:if>

<c:url var="edit_book_url" value="/book/editBook"/>
<form:form action="${edit_book_url}" method="post" modelAttribute="book">
    <form:label path="isbn">ISBN: </form:label> <form:input type="text" path="isbn"/>
    <form:label path="name">Book Name: </form:label> <form:input type="text" path="name"/>
    <form:label path="author">Author Name: </form:label> <form:input path="author"/>
    <input type="submit" value="submit"/>
</form:form>
<button><a href="book/viewBooks">View Books</a></button>
</body>
</html>