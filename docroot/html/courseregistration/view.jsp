<%@ include file="/html/init.jsp"%>

<liferay-ui:search-container emptyResultsMessage="No result was found">
	<liferay-ui:search-container-results results="<%= CourseLocalServiceUtil.getCoursesByStatus(searchContainer.getStart(), searchContainer.getEnd())%>" total="<%= CourseLocalServiceUtil.countCoursesByStatus() %>" />
	<liferay-ui:search-container-row
		className="com.liferay.docs.course.model.Course" modelVar="course" escapedModel="<%= true %>">
		<liferay-ui:search-container-column-text property="name" />
		<liferay-ui:search-container-column-text property="description" />
		<liferay-ui:search-container-column-text property="lecturer"
			name="Lecturer" />
		<liferay-ui:search-container-column-text name="status"
			value='${ course.isStatus() == true ? "Available" : "Unavailable" }' />
		<liferay-ui:search-container-column-text property="duration" />
		<liferay-ui:search-container-column-jsp name="Register"
			path="/html/courseregistration/actionButton.jsp" />
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />


</liferay-ui:search-container>