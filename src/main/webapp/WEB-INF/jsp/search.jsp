<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Danh sách</h1>
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