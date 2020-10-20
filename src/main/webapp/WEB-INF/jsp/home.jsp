<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#customers {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #4CAF50;
	color: white;
}
</style>
</head>
<body>
	
	<h1>Danh sách</h1>
	<a href="/add">Thêm</a>
	<form action="./search" method="get">
		<input type="text" name="key">
		<input type="submit" value="Search">
	</form> 
	<table id="customers">
		<tr>
			<td>id</td>
			<td>Name</td>
			<td>Address</td>
			<td></td>
		</tr>
		<c:forEach var="sp" items="${list}">
			<tr>
				<td>${sp.getId()}</td>
				<td>${sp.getName()}</td>
				<td>${sp.getAddress()}</td>
				<td><a href="del/${sp.getId()}"
					onclick="if(!(confirm('Are you sure you want to delete this item?'))) return false">Xóa</a>
					|<a href="update/${sp.getId()}">Sửa</a></td>
			<tr>
		</c:forEach>
	</table>
</body>
</html>