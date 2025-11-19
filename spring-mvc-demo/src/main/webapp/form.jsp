<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>student</title>
</head>
<body>
<h1>Student Registration Form</h1>
<form action="save" method="post">
	<label>Name : </label><br>
	<input type="text" name="studentName"><br>
	<label>Id : </label><br>
	<input type="number" name="studentId"><br>
	<label>Age : </label><br>
	<input type="number" name="studentAge"><br>
	<label>Gender : </label><br>
	<input type="text" name="studentGender"><br>
	<button type="submit">SUBMIT</button>
</form>

</body>
</html>