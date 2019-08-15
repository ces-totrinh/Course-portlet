<%@ include file="/html/init.jsp"%>

<%
	ResultRow row =(ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Object object =(Object) row.getObject();
%>
<portlet:renderURL var="managementURL">
	<portlet:param name="courseId" value="<%=String.valueOf((Long) ((Object[])object)[0])%>"/>
	<portlet:param name="mvcPath" value="/html/registrationapproval/registrationOfCourse.jsp"/>
</portlet:renderURL>
<aui:a cssClass="btn btn-default" href="${managementURL}">
	<liferay-ui:icon image="configuration" message="Management"/>Management
</aui:a>