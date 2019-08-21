<%@ include file="/html/init.jsp"%>

<%
	ResultRow row =(ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Registration registration =(Registration) row.getObject();
%>
<c:set var="status" scope="session"
	value="<%= registration.getStatus() %>" />
<c:choose>
	<c:when test="${status eq -1}">
		<portlet:actionURL name="deleteRegistration" var="deleteURL">
			<portlet:param name="registrationId"
				value="<%=String.valueOf(registration.getRegistrationId())%>" />
		</portlet:actionURL>
		<aui:a cssClass="btn btn-default" href="${deleteURL}">
			<liferay-ui:icon image="delete" message="Registration was rejected"/>Delete
		</aui:a>
	</c:when>
	<c:when test="${status eq 1}">
		<liferay-ui:icon image="check" message="Approved" />Approved
	</c:when>
	<c:otherwise>
		<liferay-ui:icon image="time" message="Waiting-Approval" />Waiting-Approval
	</c:otherwise>
</c:choose>