<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
	<head>
		<title>Todo List</title>
	</head>
	<body>
		<h2>This is Todo list</h2>
		<p> Todo's title is ${title}. </p>

		<table border=1>
			<tr><th>column</th><th>value</th></tr>
			<tr><td>id</td><td>${id}</td></tr>
			<tr><td>title</td><td>${title}</td></tr>
			<tr><td>description</td><td>${description}</td></tr>
			<tr><td>staff</td><td>${staff}</td></tr>
			<tr><td>limit</td><td>${limit}</td></tr>
		</table>
	</body>
</html>