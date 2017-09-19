<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="x-ua-compatible" content="ie=edge">
		<title>Sample Web</title>
		<meta name="description" content="">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<link rel="stylesheet" type="text/css" href="<c:url value='/assets/css/style.css'/>" />
		
		<script language="javascript" type="text/javascript" src="<c:url value='/assets/js/jquery-3.2.1.min.js'/>"></script>
		<script language="javascript" type="text/javascript" src="<c:url value='/assets/js/jquery-migrate-3.0.0.min.js'/>"></script>
	</head>
<body>
	<h2>Our Country</h2>
	<table border="1" cellpadding="5" cellspacing="0" width="80%">
		<thead>
			<tr align="center" valign="top">
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Active</th>
				<th>Create Date</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listCustomer}" var="item">
				<tr align="left" valign="top">
					<td align="center">${item.customerId}</td>
					<td>${item.firstName}&nbsp;${item.lastName}</td>
					<td>${item.email}</td>
					<td>${item.active}</td>
					<td>
						<fmt:setLocale value="th_TH" scope="session"/>
						<fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss" value="${item.createDate}"/>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
