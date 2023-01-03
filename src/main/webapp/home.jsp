<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			<form action="addform"  >
			<input type="text" name="bookCode"><br>
			<input type="text" name="bookName"><br>
			<input type="text" name="author"><br>
			<input type="text" name="date"><br>
			<input type="submit">
			
			</form>
			
			<form action="getdata"  >
			<input type="text" name="bookCode"><br>
			<input type="submit">
			
			</form>
</body>
</html>