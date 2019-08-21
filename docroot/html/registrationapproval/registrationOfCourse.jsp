<%@ include file="/html/init.jsp"%>

<%
	long courseId = ParamUtil.getLong(renderRequest, "courseId");
	Course course = CourseLocalServiceUtil.getCourseById(courseId);
%>

<portlet:renderURL var="goBackURL">
	<portlet:param name="mvcPath" value="/html/registrationapproval/view.jsp" />
</portlet:renderURL>
<div align="left">
	<liferay-ui:icon image="back" message="Go Back"/>
	<aui:a href="${goBackURL}">Go back</aui:a>
</div>
<h4><%= course.getName() %> - <%= course.getLecturer() %></h4>
<h6 align="right">Number of registration approved: 
	<%=RegistrationLocalServiceUtil.countRegistrationApprovedByCourseId(courseId) %>
	/ 
	<%=RegistrationLocalServiceUtil.countRegistrationByCourseId(courseId) %>
<liferay-ui:search-container emptyResultsMessage="No result was found">
	<liferay-ui:search-container-results results="<%= RegistrationLocalServiceUtil.getRegistrationsByCourseId(courseId, searchContainer.getStart(), searchContainer.getEnd())%>" total="<%= RegistrationLocalServiceUtil.countRegistrationByCourseId(courseId) %>" />
	<liferay-ui:search-container-row 
		className="com.liferay.docs.course.model.Registration" modelVar="registration" escapedModel="<%= true %>">
		<liferay-ui:search-container-column-text name="User Name"
			value='<%=UserLocalServiceUtil.getUser(registration.getUserId()).getFullName() %>' />
		<liferay-ui:search-container-column-jsp name="Actions"
			path="/html/registrationapproval/approvalButton.jsp" />
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>