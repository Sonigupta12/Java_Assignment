<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">


<title>Result Page</title>
<link rel="stylesheet" type="text/css" href="Css/tshirtresult.css">
</head>
<body>

	<div class="container">

		<c:if test="${tshirts.size() != 0}">
			<header>
				<div>
					<table width="100%">
						<tr>
							
							<td align="right">
								<form action="/logout" th:action="@{/logout}" method="post">
									<input type="submit" value="SignOut" />
								</form>
							</td>
						</tr>
					</table>
				</div>
			</header>
			<table class="result">
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Color</th>
					<th>Gender</th>
					<th>Size</th>
					<th>Price</th>
					<th>Rating</th>
					<th>Availability</th>
				</tr>
				<c:forEach items="${tshirts}" var="tshirts">
					<tr>
						<td>${tshirts.getid()}</td>
						<td>${tshirts.getname()}</td>
						<td>${tshirts.getcolor()}</td>
						<td>${tshirts.getgender_recommendation()}</td>
						<td>${tshirts.getsize()}</td>
						<td>${tshirts.getprice()}</td>
						<td>${tshirts.getrating()}</td>
						<td>${tshirts.getavailability()}</td>
					</tr>
				</c:forEach>

			</table>
		</c:if>
		<br> <br>
		<c:if test="${tshirts.size() == 0}">
			<header>
				<div>
					<table width="100%">
						<tr>
							<td>
								<h2>No matching Tshirt Available!!</h2>
							</td>
							<td align="right">
								<form action="#" th:action="@{/logout}" method="post">
									<input type="submit" value="SignOut" />
								</form>
							</td>
						</tr>
					</table>
				</div>
			</header>
		</c:if>
		<br>
	</div>
</body>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</html>