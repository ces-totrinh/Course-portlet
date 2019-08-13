<%@ include file="/html/init.jsp"%>

<liferay-ui:search-container emptyResultsMessage="No result was found">
	<liferay-ui:search-container-results results="<%= CourseLocalServiceUtil.getCoursesWithTotalRegistration()%>" total="<%= CourseLocalServiceUtil.getCoursesCount() %>" />
	<liferay-ui:search-container-row
		className="java.lang.Object" modelVar="object" escapedModel="<%= true %>">
		<liferay-ui:search-container-column-text name="Name" value='<%= (String) ((Object[])object)[1] %>' />
		<liferay-ui:search-container-column-text name="Lecturer" value='<%= (String) ((Object[])object)[2] %>'/>
		<liferay-ui:search-container-column-text name="Total of registration" value='<%= ((Integer) ((Object[])object)[3]).toString() %>' />
		<liferay-ui:search-container-column-jsp name="Actions"
			path="/html/registrationapproval/managementButton.jsp" />
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />


</liferay-ui:search-container>