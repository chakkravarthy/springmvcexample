<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2> Book Update </h2>

<form action="/springapp/book" method="post">

	Cost : <input type="text" value="" name="cost" />
	
	<p>Date: <input type="text" id="datepicker" value="" name="printedDate"></p>

	<input type="submit"/>

</form>

</body>

<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

 <script type="text/javascript">
 $(
	function() {
    	$( "#datepicker" ).datepicker();
	 } 
  );
 </script>

</html>