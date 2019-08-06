<%@ include file="/html/course/init.jsp"%>

<portlet:renderURL var="addURL">
	<portlet:param name="mvcPath" value="/html/course/editForm.jsp" />
</portlet:renderURL>

<div align="right">
	<a href="${addURL}">Add new Student</a>
</div>
<liferay-ui:search-container emptyResultsMessage="No result was found">
	<liferay-ui:search-container-results results="<%= CourseLocalServiceUtil.getCourses(searchContainer.getStart(), searchContainer.getEnd())%>" total="<%= CourseLocalServiceUtil.getCoursesCount() %>" />
	<liferay-ui:search-container-row
		className="com.liferay.docs.course.model.Course" modelVar="course" escapedModel="<%= true %>">
		<liferay-ui:search-container-column-text property="name" />
		<liferay-ui:search-container-column-text property="description" />
		<liferay-ui:search-container-column-text property="lecturer"
			name="Lecturer" />
		<liferay-ui:search-container-column-text name="status"
			value='${ course.isStatus() == true ? "Available" : "Unavailable" }' />
		<liferay-ui:search-container-column-text property="duration" />
		<liferay-ui:search-container-column-jsp name="Actions"
			path="/html/course/actionButton.jsp" />
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />


</liferay-ui:search-container>