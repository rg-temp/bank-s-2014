<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>List</title>
</head>
<body>

<h1>List</h1>
<c:if test="${not empty accounts}">
	<ul>
		<c:forEach var="accountInstance" items="${accounts}">
		<%-- possible improvement: use for each with index add class for style using idx % 2 --%>
			<li>a</li>
		</c:forEach>
	</ul>
</c:if>

</body>
</html>