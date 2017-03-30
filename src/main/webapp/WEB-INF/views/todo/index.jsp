<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
	<head>
		<title>Todo List</title>
	</head>
	<body>
		<h2>This is Todo list</h2>
		<form action="/spring-myBatis/todo/loadTodo" method="get">
			<input type="text" name="id" placeholder="idを入力してください">
			<input type="submit" value="送信">
		</form>

	</body>
</html>