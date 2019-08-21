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
	searchContext.setStart(0);
	searchContext.setEnd(10);
	searchContext.setAndSearch(true);
	
	Indexer indexer = IndexerRegistryUtil.getIndexer(Course.class);

    Hits hits = indexer.search(searchContext);
    
    List<Course> courses = new ArrayList<Course>();

    for (int i = 0; i < hits.getDocs().length; i++) {
            Document doc = hits.doc(i);

            long courseId = GetterUtil
            .getLong(doc.get(Field.ENTRY_CLASS_PK));

            Course course = null;
            
            try {
            	course = CourseLocalServiceUtil.getCourseById(courseId);
            } catch (PortalException pe) {
            	_log.error(pe.getLocalizedMessage());
            } catch (SystemException se) {
            	_log.error(se.getLocalizedMessage());
            }
            
            courses.add(course);
    }
	
%>
<aui:form action="<%= portletURLString %>" method="post" name="fm">
	<liferay-ui:search-form page="/html/course/search.jsp"
			servletContext="<%= application %>" />
	<div align="right">
		<liferay-ui:icon image="add_article" message="Add new Course" />
		<aui:a href="${addURL}">Add new Course</aui:a>
	</div>
	<liferay-ui:search-container delta="10" emptyResultsMessage="No result was found">
		<liferay-ui:search-container-results
			results="<%= courses%>"
			total="<%= courses.size() %>" />
		<liferay-ui:search-container-row
			className="com.liferay.docs.course.model.Course" modelVar="course"
			escapedModel="<%= true %>">
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
</aui:form>

<%!
        private static Log _log = LogFactoryUtil.getLog("docroot.html.course.view_jsp");
%>