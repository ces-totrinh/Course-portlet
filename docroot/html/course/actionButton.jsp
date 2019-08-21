<%@ include file="/html/init.jsp"%>

<%
	ResultRow row =(ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Course course =(Course) row.getObject();
%>

<liferay-ui:icon-menu direction="right">
	<portlet:renderURL var="editURL">
		<portlet:param name="courseId" value="<%=String.valueOf(course.getCourseId())%>"/>
		<portlet:param name="mvcPath" value="/html/course/editForm.jsp"/>
	</portlet:renderURL>
	<liferay-ui:icon image="edit" message="Edit" url="<%=editURL%>"/>
	<portlet:actionURL name="deleteCourse" var="deleteURL">
		<portlet:param name="courseId" value="<%=String.valueOf(course.getCourseId())%>"/>
	</portlet:actionURL>
	<liferay-ui:icon image="delete" message="Delete" url="<%=deleteURL %>"/>
</liferay-ui:icon-menu>