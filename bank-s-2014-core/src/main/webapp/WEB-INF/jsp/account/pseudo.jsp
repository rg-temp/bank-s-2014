<script src="<c:url value="/resources/js/jquery-2.1.1.min.js" />"></script>
<script>
<%-- Declare function for each button --%>
<%--
Read values from dom
prepare rest url
set request method
add parameters
add callbacks
execute request
--%>
$(document).ready(function() {
<%-- When document is loaded assign events --%>
<%-- Attach function to each button --%>
<%--
Select button from dom
assign function handler
--%>

<%-- possible improvement: 
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
--%>
});
</script>