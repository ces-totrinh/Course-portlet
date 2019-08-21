<%@ include file="/html/init.jsp"%>

<%
	ResultRow row =(ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Course course =(Course) row.getObject();
	ServiceContext serviceContext = ServiceContextFactory.getInstance(Registration.class.getName(), renderRequest);
%>

<portlet:actionURL name="registerCourse" var="registerURL">
	<portlet:param name="courseId"
		value="<%=String.valueOf(course.getCourseId())%>" />
</portlet:actionURL>

<c:set var="countRegistrationExisted" scope="session"
	value="<%= RegistrationLocalServiceUtil.countRegistrationByCourseIdAndUserId(course.getCourseId(),serviceContext.getUserId())%>" />
<c:choose>
	<c:when test="${countRegistrationExisted gt 0 }">
		<liferay-ui:icon image="time" message="Waiting-Approval" />
		Waiting-Approval
	</c:when>
	<c:otherwise>
		<aui:a cssClass="btn btn-default" href="${registerURL}">
			<liferay-ui:icon image="join" message="Register" />Register
		</aui:a>	
	</c:otherwise>
</c:choose>
