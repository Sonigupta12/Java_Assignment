

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="Css/login.css">

<title>login</title>
</head>




<body>
	<div id="loginForm">

		<form action="#" th:action="@{/login}" th:object="${user}" method="post" name="loginForm">
			<table>
				<tr>
					<td id="top">Login</td>
				</tr>
				<tr>
					<td><label for="username">Username:</label> <span
						id="userid">&nbsp</span> <input type="email" id="userid" placeholder="Username"name="username"
						required /></td>
				</tr>
				<tr>
					<td><label for="password">Password:</label> <span
						id="necessary">&nbsp</span> <input type="password" placeholder="Password"
						name="password" required /></td>
				</tr>


				<tr id="bottom">
					<td><input type="submit" value="Login>>" /></td>
				</tr>
			</table>
		</form>
	</div>

</body>
<link rel="stylesheet" type="text/css" href="Style.css">
</html>




</body>
</html>