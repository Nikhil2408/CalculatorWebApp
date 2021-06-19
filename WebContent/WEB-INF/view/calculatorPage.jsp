<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator Web App</title>
</head>
<body>
<center>
	<form action="processRequest" method="post">
		First Number: <input type="number" name="firstNumber" placeholder="Enter First Number"/><br><br>
		Second Number: <input type="number" name="secondNumber" placeholder="Enter Second Number"/><br><br>
		<input type="submit" value="Add" name="add"/>
		<input type="submit" value="Subtract" name="subtract"/>
		<input type="submit" value="Divide" name="divide"/>
		<input type="submit" value="Multiply" name="multiply"/><br><br>
	</form>
	<h3>Result: ${result}</h3>
</center>
</body>
</html>