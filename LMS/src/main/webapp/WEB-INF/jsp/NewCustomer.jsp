<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<body>
<div>
	<ul>
  <li><a class="active" href="/index">Home</a></li>
  <li><a href="/getAll">All Books</a></li>
  <li><a href="#contact">New</a></li>
  <li><a href="#about">Delete</a></li>
</ul>
</div>
<div>
<sf:form action="/update" method="POST" modelAttribute="book">
	<fieldset>
	<table cellspacing="0">
		
		<tr>
			<th><label>Book Name:</label></th>
			<td><sf:hidden path="id" readonly="readonly" size="15" id="ids" value="${Book.id}" />
			<sf:input path="bookName" size="50" value="${Book.bookName}" id="bookName" /> 
		     </td>
		</tr>
		<tr>
			<th><label>Author:</label></th>
			<td><sf:input path="author" size="50" value="${Book.author}" id="author" /> 
			</td>
		</tr>
		<tr>
			<th><label>Purchase Date:</label></th>
			<td><sf:input path="purchaseDate" size="50" value="${Book.purchaseDate}" id="purchaseDate" /> 
				
			</td>
		</tr>
		<tr>
			<th></th>
			<td><input type="submit" value="submit"/></td>
		</tr>
	</table>
	</fieldset>
</sf:form>
</div>
</body>
</html>
