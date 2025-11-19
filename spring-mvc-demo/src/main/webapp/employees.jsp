<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Fill Employee Details</h1>
<form action="empsave" method="post">
<label>Name : </label>
<input type="text" name="empName"><br><br>
<label>Id : </label>
<input type="number" name="empId"><br><br>
<label>Job Role : </label>
<input type="text" name="empJob"><br><br>
<label>Experience : </label>
<input type="number" name="empExp"><br><br>
<label>Salary : </label>
<input type="number" name="empSalary"><br><br>
<button type="submit">SUBMIT</button>
</form>

</body>
</html>