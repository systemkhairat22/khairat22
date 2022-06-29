<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Member</title>
</head>
<body>
	<form action="createMemberController" method="post">
		Name:
		<input type="text" name="mem_name"><br>
		IC Number:
		<input type="text" name="mem_icnum"><br>
		Age:
		<input type="number" name="mem_age"><br>
		Gender:
		<input type="radio"name="mem_gender" value="Male">
		<label for="Male">Male</label>
		<input type="radio"name="mem_gender" value="Female">
		<label for="Female">Female</label><br>
		Address:
		<input type="text" name="mem_adress"><br>
		Phone Number:
		<input type="text" name="mem_phonenum"><br>
		Representative Name:
		<input type="text" name="rep_name"><br>
		Representative IC Number:
		<input type="text" name="rep_name"><br>
		<input type="submit" value="Submit">
		<input type="reset" value="Reset">
	</form>
</body>
</html>