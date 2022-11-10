<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page import="dao.UserDao"%>
<%@page import="java.util.List"%>
<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
</head>
<body>
	<%
	User u = null;
	if (session.getAttribute("data") != null) {
		u = (User) session.getAttribute("data");
	} else {
		response.sendRedirect("login.jsp");
	}
	%>

	Welcome,
	<h1>
		Name :
		<%=u.getName()%></h1>
		
		<h1><a href="logout.jsp">Logout</a></h1>

	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Contact</th>
				<th>Address</th>
				<th>Email</th>
				<th>Password</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<%
		List<User> list = UserDao.getAllUser();
		%>
		<tbody>
			
			<%for(User u1 :list){ %>
			<tr>
				<td><%=u1.getId() %></td>
				<td><%=u1.getName() %></td>
				<td><%=u1.getContact() %></td>
				<td><%=u1.getAddress() %></td>
				<td><%=u1.getEmail() %></td>
				<td><%=u1.getPassword() %></td>
				<td>
					<form action="UserController" method="post">
						<input type="hidden" name="id" value="<%=u1.getId()%>">
						<input type="submit" name="action" value="edit">
					</form>
				</td>
				<td>
					<form action="UserController" method="post">
						<input type="hidden" name="id" value="<%=u1.getId()%>">
						<input type="submit" name="action" value="delete">
					</form>
				</td>
				
			</tr>
			<%
			}%>
		</tbody>

	</table>

</body>
</html>