<%
    response.setHeader("cache-control", "no-cache, no-store, must-revalidate");
    response.setHeader("pragma", "no-cache");
    response.setDateHeader("expires", 0);
    response.setHeader("Cache-Type", "private");
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover {
    background-color: #111;
}
</style>
</head>
<body style="background-color: #B7B7B7;">
<div>
	<ul>
  <li><a class="active" href="/index">Home</a></li>
  <li><a href="/getAll">All Books</a></li>
  <li><a href="#contact">New</a></li>
  <li><a href="#about">Delete</a></li>
</ul>
</div>
<div>
     <table style="width: 100%;border: 1px solid black;border-collapse: collapse;background-color: #f2f2f2;">    
                <tr style="background-color: #eee8aa">
                    <th>Sl No.</th>
                    <th>Book Name</th>
                    <th>Author</th>
                    <th>Purchase Date</th>
                    <th>Edit</th>
                    <th>Delete</th>
              </tr>
                
                <c:forEach items="${list}" var="record">
                    <tr style="text-align: left;">
                        <td><c:out value="${record.id}"/></td>
                        <td><c:out value="${record.bookName}"/></td>
                        <td><c:out value="${record.author}"/></td>
                        <td><c:out value="${record.purchaseDate}"/></td>
                        <td><a href="/edit?id=${record.id}"><span class="glyphicon glyphicon-pencil"></span></a></td>
                        <td><a href="/delete?id=${record.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
                        
                    </tr>
                </c:forEach>
            </table> 
            
            </div>
</body>
</html>