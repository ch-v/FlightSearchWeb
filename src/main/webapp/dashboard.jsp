<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@page import="java.util.*"%>
<%@page import="com.nagarro.flightsearchweb.entity.Flight"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function logout() {
		location.href = "login.jsp";
	}
</script>
<style type="text/css">
table, th, td {
	border: 1px solid black;
}

th {
	text-align: centre;
}
</style>
</head>
<body>


	<h2>Welcome:${username}</h2>
	
	<input type="submit" value="logout" align="right" onclick="logout()">
	<br>

	<fieldset>

		<form action="dashboard">

			<h4>
				Source: <input type="text" name="source"required\>
			</h4>

			<h4>
				Destination:<input type="text" name="dest" required>
			</h4>

			<h4>
				Date:<input type="date" name=date>
			</h4>

			<h4>
				Flight Class: <input type="checkbox" value="E" name="class" />E <input
					type="checkbox" value="EB" name="class" />EB<br>

			</h4>
			<h4>
				Sort By: <input type="checkbox" value="fare" name="sort" />Fare <input
					type="checkbox" value="flightDuration" name="sort" />Duration<br>
			</h4>

			<input type="submit" value="search">

		</form>

		<fieldset>
			<table style="width: 100%">
				<tr>
					<th>arrLoc</th>
					<th>depLoc</th>
					<th>fare</th>
					<th>flightClass</th>
					<th>flightNo</th>
					<th>flightDuration</th>
					<th>seatAvailability</th>
					<th>Date</th>
					<th>flightTime</th>
				</tr>

				<c:if test="${lists!=null }">
					<c:forEach var="list" begin="1" end="${lists.size()}">
						<c:set var="item" value="${lists.get(list - 1)}" />
						<tr>
							<td>${item.getArrLoc()}</td>
							<td>${item.getDepLoc()}</td>
							<td>${item.getFare()}</td>
							<td>${item.getFlightClass()}</td>
							<td>${item.getFlightNo()}</td>
							<td>${item.getFlightDuration()}</td>
							<td>${item.isSeatAvailability()}</td>
							<td>${item.getValidTill()}</td>
							<td>${item.getFlightTime()}</td>


						</tr>

					</c:forEach>
				</c:if>
			</table>

		</fieldset>
	</fieldset>



</body>
</html>