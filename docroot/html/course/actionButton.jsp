<%@ include file="/html/init.jsp"%>

<%
	ResultRow row =(ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Document document =(Document) row.getObject();
	long courseId = GetterUtil.getLong(document.get(Field.ENTRY_CLASS_PK));
%>

<liferay-ui:icon-menu direction="right">
	<portlet:renderURL var="editURL">
		<portlet:param name="courseId" value="<%= String.valueOf(courseId) %>"/>
		<portlet:param name="mvcPath" value="/html/course/editForm.jsp"/>
	</portlet:renderURL>
	<liferay-ui:icon image="edit" message="Edit" url="<%=editURL%>"/>
	<portlet:actionURL name="deleteCourse" var="deleteURL">
		<portlet:param name="courseId" value="<%= String.valueOf(courseId) %>"/>
	</portlet:actionURL>
	<liferay-ui:icon image="delete" message="Delete" url="<%=deleteURL %>"/>
</liferay-ui:icon-menu>