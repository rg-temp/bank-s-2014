<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>List</title>
</head>
<body>

<h1>Accounts</h1>
<h2>List/Show</h2>
<c:if test="${not empty accounts}">
	<ul>
		<c:forEach var="accountInstance" items="${accounts}">
		 	<form action="submit" method="post">
		 		<%-- use acc_id since values or html attribute should ignore case --%>
				AccId: <input type="text" name="acc_id"><span></span>
				IBAN: <input type="text" name="iban"><span></span>
				BIC: <input type="text" name="bic">
			 	<div id="buttons">
					<input type="submit" name="action" value="update">
					<input type="submit" name="action" value="delete">
					<input type="submit" name="action" value="reset">
					<div style="clear:both"></div>
			 	</div>
			</form>
			<li>${accountInstance.accId}, ${accountInstance.iban}, ${accountInstance.bic}</li>
		</c:forEach>
	</ul>
</c:if>
<h2>Create</h2>
<form action="create" method="post">
	IBAN: <input type="text" name="iban"><span></span>
	BIC: <input type="text" name="bic">
	<input type="submit" value="submit">
	<input type="submit" name="action" value="reset">
</form>

</body>
<%-- possible improvement: 
	use for each with index add class for style using idx % 2
	use a spring partial view template and render it having accountInstance 
			as model
	add reset/discard changes button to form
	add css for displaying and remove break return <br> tags and inline style
			and style nodes
	move view to WEB-INF/jsp/account/list.jsp
	verify method post or get of the form to be consistent whit the
			REST methods
	use Spring flash scope to display errors after submitting
	for the delete button ask for confirmation or display a simple js alert dialog
	move logic out of the same view
		one view for list, only lists main fields
			has a show button to browse to a show action
			has a create button to browse to a create action
			has an edit button for each entry to browse to an edit action 
		one view for show, shows detailed data for each account field 
		one view for create, browses 
			to list with flash message if create was successful
			to create with flash message if there are errors
		one view for edit, has delete button
			to list with flash message with the result of the delete operation
		views create and edit should reuse the same form partial template view
--%>
</html>