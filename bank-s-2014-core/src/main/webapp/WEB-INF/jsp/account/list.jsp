<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<script src="<c:url value="/resources/js/jquery-2.1.1.min.js" />"></script>
    <title>List</title>
</head>
<body>

<h1>Accounts</h1>
<h2>List and Show</h2>
<c:if test="${not empty accounts}">
	<ul>
		<c:forEach var="accountInstance" items="${accounts}">
			<li>
		 	<form action="${uriContext}/submit" method="get" class="list">
		 		<%-- use acc_id since values or html attribute should ignore case --%>
				AccId: <input type="text" name="acc_id" value="${accountInstance.accId}">
				<span></span>
				IBAN: <input type="text" name="iban" value="${accountInstance.iban}">
				<span></span>
				BIC: <input type="text" name="bic" value="${accountInstance.bic}">
			 	<div id="buttons">
					<input type="submit" name="action" value="update">
					<input type="submit" name="action" value="delete">
					<input type="submit" name="action" value="reset">
					<div style="clear:both"></div>
			 	</div>
			</form>
			</li>
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
<%-- possible improvements: 
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
	field AccId should not be editable
	move logic out of the same view
		one view for list, only lists main fields
			has a show button to browse to a show action
			has a create button to browse to a create action
			has an edit button for each entry to browse to an edit action 
		one view for show, shows detailed data for each account field 
		one view for create, browses 
			to list or show with flash message if create was successful
			to create with flash message if there are errors
		one view for edit, has delete button
			to list or show with flash message with the result of the 
					delete or edit operation
		views create and edit should reuse the same form partial template view
	use unobtrusive JS on submit to perform validation on the client consider 
			using AngularJS to perform part of the safe logic on the client and
			dynamic display logic
	use deferred load for js
	use "use strict;"
	populate fields with js once the page is loaded.
	use spring i18n for the content or js framework
--%>
<script>
$(document).ready(function() {
	"use strict";
<%-- Declare function for each button --%>
<%--
Read values from dom
prepare rest url
set request method
add parameters
add callbacks
execute request
--%>
var deleteF = function() {
	console.debug(">ini del");
	
	return false;
}

<%-- Attach function to each button --%>
var listForms = $("form.list");
var delButtons = listForms.find("input[value=delete]");
delButtons.bind("click", deleteF);

<%-- possible improvements: 
	move part of the js to a javascript file
    add functions for default action on buttons, onclick only works with mouse
            might not work moving the focus to the button and pressing enter
    perform the call asynchronously using ajax calls, this prevents the page 
            from reloading and allow to specify callback for result status 
            like onsuccess, onerror, oncomplete. The cause/code of the error
            will be provided from backend.
    check if form or input HTML nodes can have id attributes according to 
            HTML4.01/HTML5 standard
    check if script can be autoclosed
    group each entry in a div with dinamically generated id
    validation should be performed client- and server-side
    add handler to button instead of replacing all the possible existing handlers
--%>
});
</script>

</body>
</html>