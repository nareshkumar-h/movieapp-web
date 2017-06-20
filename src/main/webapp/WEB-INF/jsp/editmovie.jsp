<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MovieApp</title>
</head>
<body>
	<h3>Update Movie</h3>

	<form action="../movies/update" method="get">

		<input type="text" name="movieName" placeholder="Enter the movie name"
			required autofocus  value="Bahubali"/>
		<button type="submit">Submit</button>
	</form>

	<ul>
		<li><a href="../movies/list"> List Movie </a></li>
	</ul>
</body>
</html>