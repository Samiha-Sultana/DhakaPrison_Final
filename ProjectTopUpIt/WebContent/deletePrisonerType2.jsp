<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body bgcolor="#E6E6FA">
<form action="prisonerType2.jsp">
    <input type="submit" value="Go Back" />
</form>
	<form action="deletePrisonerType2" method="post">
	<table align="center">
		
			<td>Prisoner_ID:</td>
			<td><input type="text" name="Prisoner_ID" value=""></td>
		</tr>
		<tr>
			
			<td><input type="submit" value="submit" name="submit"></td>
			<td><input type="reset" name="reset" value="Clear"></td>
		</tr>
		
		</table>
	</form>

</body>
</html>