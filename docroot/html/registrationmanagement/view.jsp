<%@ include file="/html/init.jsp"%>

<liferay-ui:search-container emptyResultsMessage="No result was found">
	<liferay-ui:search-container-results 
	results="<%= RegistrationLocalServiceUtil.getRegistrationByUserId(themeDisplay.getUser().getUserId())%>" 
	total="<%= RegistrationLocalServiceUtil.countRegistrationByUserId(themeDisplay.getUser().getUserId()) %>" />
	<liferay-ui:search-container-row 
		className="com.liferay.docs.course.model.Registration" modelVar="registration" escapedModel="<%= true %>">
		<liferay-ui:search-container-column-text name="Course Name"
			value='<%=CourseLocalServiceUtil.getCourseById(registration.getCourseId()).getName() %>' />
		<liferay-ui:search-container-column-text name="Lecturer"
			value='<%=CourseLocalServiceUtil.getCourseById(registration.getCourseId()).getLecturer() %>' />
		<liferay-ui:search-container-column-jsp name="Actions"
			path="/html/registrationmanagement/actionButton.jsp" />
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>