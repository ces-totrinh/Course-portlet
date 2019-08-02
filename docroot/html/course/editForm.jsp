<%@ include file="/html/course/init.jsp"%>

<%
	long courseId = ParamUtil.getLong(renderRequest, "courseId");
	Course course = null;
	if(courseId > 0) {
		course = CourseLocalServiceUtil.getCourse(courseId);
	}
	pageContext.setAttribute("course", course);
%>
<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/html/course/view.jsp" />
</portlet:renderURL>
<portlet:actionURL name="addCourse" var="addCourseURL" />
<portlet:actionURL name="editCourse" var="editCourseURL" />

<aui:form action="${ courseId > 0 ? editCourseURL : addCourseURL }"	method="post">
	<aui:input label="id" name="courseId" type="hidden"
		value="${not empty course ? course.courseId : ''}" />
	<aui:input label="Name" name="name" type="text"
		value="${not empty course ? course.name : ''}" max-length="75" />
	<aui:input lable="Description" name="description" type="text"
		value="${not empty course ? course.description : ''}" />
	<aui:input lable="Lecturer" name="lecturer" type="text"
		value="${not empty course ? course.lecturer : ''}" />
	<aui:input lable="Duration" name="duration" type="number" min="1"
		max="40" value="${not empty course ? course.duration : ''}" />	
	<aui:fieldset>
		<label>Status</label>
	    <aui:row>
			<aui:input label="Available" name="status" type="radio" value="true" checked="${not empty course ? course.status : true}" />
			<aui:input label="Unavailable" name="status" type="radio" value="false" checked="${not empty course ? not course.status : false}"/>
	    </aui:row>    
	</aui:fieldset>
	<aui:button-row>
		<aui:button type="submit"/>
		<aui:button type="cancel" onClick="${ viewURL.toString() }"></aui:button>
	</aui:button-row>
</aui:form>

<aui:script>
	AUI().use('aui-form-validator',function(A){
	    var rules = {
		    <portlet:namespace/>name: {
			  	required: true,
			  	maxLength: 75
			},
			<portlet:namespace/>description: {
			  	maxLength: 2000
			},
			<portlet:namespace/>lecturer: {
			  	required: true,
			  	maxLength: 75
			},
			<portlet:namespace/>duration: {
			  	required: true,
			  	min: 1,
			  	max: 40
			}
		};
		var fieldStrings = {
			<portlet:namespace/>name: {
				required: 'Type course name in this field.',
				maxLength: 'The maximum length of the course name is 75'
			},
			<portlet:namespace/>description: {
				maxLength: 'The maximum length of the course name is 2000'
			},
			<portlet:namespace/>lecturer: {
				required: 'Type course lecturer in this field.',
				maxLength: 'The maximum length of the course lecturer is 75'
			},
			<portlet:namespace/>duration: {
				required: 'Type course duration in this field.',
				max: 'The maximum value of the course duration is 40',
				min: 'The maximum value of the course duration is 1'
			},	
		};
		new A.FormValidator({
			boundingBox: '#<portlet:namespace/>fm2',
			fieldStrings: fieldStrings,
			rules: rules,
			showAllMessages:true
		});
	});
</aui:script>