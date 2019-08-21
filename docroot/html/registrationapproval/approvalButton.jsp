<%@ include file="/html/init.jsp"%>

<%
	ResultRow row =(ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Registration registration =(Registration) row.getObject();
%>
<c:set var="status" scope="session" value="<%= registration.getStatus() %>"/>  
<c:choose>
	<c:when test="${status eq 0}">  
		<liferay-ui:icon-menu message="Waiting-Approval " direction="right">
			<portlet:actionURL name="approveRegistration" var="approveURL">
				<portlet:param name="registrationId"
					value="<%=String.valueOf(registration.getRegistrationId())%>" />
				<portlet:param name="courseId"
					value="<%=String.valueOf(registration.getCourseId())%>" />
			</portlet:actionURL>
			<liferay-ui:icon image="check" message="Approve"
				url="<%=approveURL%>" />
			<portlet:actionURL name="rejectRegistration" var="rejectURL">
				<portlet:param name="registrationId"
					value="<%=String.valueOf(registration.getRegistrationId())%>" />
					<portlet:param name="courseId"
					value="<%=String.valueOf(registration.getCourseId())%>" />
			</portlet:actionURL>
			<liferay-ui:icon image="delete" message="Reject"
				url="<%=rejectURL %>" />
		</liferay-ui:icon-menu>
	</c:when>
	<c:when test="${status eq 1 }">
		<liferay-ui:icon image="check" message="Approved"/>Approved

	</c:when>
	<c:otherwise>
		<liferay-ui:icon image="delete" message="Rejected"/>Rejected
	</c:otherwise>
</c:choose>
