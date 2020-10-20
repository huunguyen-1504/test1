<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
</head>
<body>
	<h3>Update</h3>

<div>
  <form method="post">
  	<input type="number" name="id" value="${up.get().getId() }" hidden="true">
    <label for="fname">First Name</label>
    <input type="text" id="fname" name="firstname" value="${up.get().getName() }">

    <label for="lname">Last Name</label>
    <input type="text" id="lname" name="add" value="${up.get().getAddress() }">
	
    <input type="submit" value="Submit">
  </form>
</div>
	
</body>
</html>