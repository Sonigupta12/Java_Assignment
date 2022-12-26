
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Tshirt Search</title>

<link rel="stylesheet" type="text/css" href="Css/home.css">

</head>
<body id="table">
	<div class="container mt-2">
		<c:if test="${username != null}">
			<header>
				<div>
					<table width="100%">
						<tr>
							<td>
								<h2 id="data">
									<center>Enter details to search!!</center>
								</h2>
							</td>
							
							<td align="right">
								<form action="/logout" method="post">
									<input type="submit" value="SignOut" />
								</form>
							</td>
						</tr>
					</table>
				</div>
			</header>
			<div class="container">
				<form action="search" method="POST">
					<table>
						<tr>
							<td>Colour :</td>
							<td><input type="text" name="colour" required /></td>
						</tr>
						<tr>
							<td>Size :</td>
							<td><input type="text" name="size" required /></td>
						</tr>
						<tr>
							<td>Gender :</td>
							<td><select name="gender_recommendation" required>
									<option value="M">Male</option>
									<option value="F">Female</option>
									<option value="U">Unisex</option>
							</select></td>
						</tr>
						<tr>
							<td>Sort by :</td>
							<td><select name="sortingType" required>
									<option selected value="price">Price</option>
									<option value="rating">Rating</option>
							</select></td>
						</tr>
						<tr>
							<td></td>
							<td align="right"><input type="submit" value="Search" /></td>
						</table>
				</form>
			</div>
		</c:if>
		<c:if test="${username == null}">
			<c:redirect url="index.jsp" />
		</c:if>
	</div>
	
</body>
</html>