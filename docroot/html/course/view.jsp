<%@ include file="/html/init.jsp"%>

<portlet:renderURL var="addURL">
	<portlet:param name="mvcPath" value="/html/course/editForm.jsp" />
</portlet:renderURL>

<%
	PortletURL portletURL = renderResponse.createRenderURL();	
	String portletURLString = portletURL.toString();	
	String name = ParamUtil.getString(request, "name");
	String lecturer = ParamUtil.getString(request, "lecturer");
	String status = ParamUtil.getString(request, "status");
%>

<%
	Map<String, Serializable> attributes = new HashMap<String, Serializable>();
	attributes.put("name", name);
	attributes.put("lecturer", lecturer);
	if(status != "") {
		attributes.put("status", status);
	}
	SearchContext searchContext = SearchContextFactory.getInstance(request);
	searchContext.setAttributes(attributes);
	searchContext.setAttribute("paginationType", "more");
	Sort[] sorts = new Sort[] {new Sort("courseStatus", true)};
	searchContext.setSorts(sorts);
	searchContext.setAndSearch(true);
	
	Indexer indexer = IndexerRegistryUtil.getIndexer(Course.class);

    Hits hits = indexer.search(searchContext);
    
    List<Document> documents = new ArrayList<Document>();
    for (int i = 0; i < hits.getDocs().length; i++) {
            Document doc = hits.doc(i);
            documents.add(doc);
    }
	
%>
<aui:form action="<%= portletURLString %>" method="post" name="fm">
	<liferay-ui:search-form page="/html/course/search.jsp"
			servletContext="<%= application %>" />
	<div align="right">
		<liferay-ui:icon image="add_article" message="Add new Course" />
		<aui:a href="${addURL}">Add new Course</aui:a>
	</div>
	<liferay-ui:search-container emptyResultsMessage="No result was found">
		<liferay-ui:search-container-results
			results="<%= documents%>"
			total="<%= documents.size() %>" />
		<liferay-ui:search-container-row
			className="com.liferay.portal.kernel.search.Document" modelVar="document"
			escapedModel="<%= true %>">
			<liferay-ui:search-container-column-text name="Name" value='${document.get("courseName")}' />
			<liferay-ui:search-container-column-text name="Description" value='${document.get("description")}' />
			<liferay-ui:search-container-column-text name="Lecturer" value='${document.get("lecturer")}'/>
			<liferay-ui:search-container-column-text name="status" value='${document.get("courseStatus") == "true" ? "Available" : "Unavailable"}' />
			<liferay-ui:search-container-column-text name="Duration" value='${document.get("duration")}' />
			<liferay-ui:search-container-column-jsp name="Actions"
				path="/html/course/actionButton.jsp" />
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
</aui:form>

<%!
        private static Log _log = LogFactoryUtil.getLog("docroot.html.course.view_jsp");
%>