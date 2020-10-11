<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<title>Login</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/css/register.css">
	</head>

	<body>
		<div class="bg">
			<div class="container">
				<h3>Register</h3>
				
				<form:form action="processRegistration" modelAttribute="user" >
	
					
					UserName: <form:input path="username"/>
	
					<br><br>
	
					Gender: <form:input path="gender"/>

					<br><br>
					
					Contact No.: <form:input path="contact"/>

					<br><br>
					
					Email: <form:input path="email"/>

					<br><br>
					
					Password: <form:input path="password"/>

					<br><br>

				<input type="submit" value="submit" />
				
				</form:form>
				
			</div>
		</div>
	
	</body>

</html>