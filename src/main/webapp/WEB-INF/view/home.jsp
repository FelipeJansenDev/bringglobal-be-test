<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home - Spring Security Implementation</title>
</head>
<body>
	<div class="header">
		<h1>Bem Vindo</h1>
		<a href="getAll">
			<button>Listar todas as transações</button>
		</a>
	</div>
	<br/>
	<form action="filter" method="get">
		<table>
			<tr>
				<input type="text" name="transactionType" /><br/><br/>
				<input type="submit" value="FILTRAR"/>
			</tr>
		</table>
	</form>
</body>
</html>