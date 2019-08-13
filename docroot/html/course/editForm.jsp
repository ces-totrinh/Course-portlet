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

<aui:form action="${ courseId > 0 ? editCourseURL : addCourseURL }"
	method="post">
	<aui:input label="id" name="courseId" type="hidden"
		value="${not empty course ? course.courseId : ''}" />
	<aui:input label="Name" name="name" type="text"
		value="${not empty course ? course.name : ''}" max-length="75">
		<aui:validator name="required"
			errorMessage="Type course name in this field." />
		<aui:validator name="maxLength"
			errorMessage="The maximum length of the course name is 75.">75</aui:validator>
	</aui:input>
	<aui:input lable="Description" name="description" type="text"
		value="${not empty course ? course.description : ''}">
		<aui:validator name="maxLength"
			errorMessage="The maximum length of the course name is 2000.">2000</aui:validator>
	</aui:input>
	<aui:input lable="Lecturer" name="lecturer" type="text"
		value="${not empty course ? course.lecturer : ''}">
		<aui:validator name="required"
			errorMessage="Type course lecturer in this field." />
		<aui:validator name="maxLength"
			errorMessage="The maximum length of the course name is 75.">75</aui:validator>
	</aui:input>
	<aui:input lable="Duration" name="duration" type="number" min="1"
		max="40" value="${not empty course ? course.duration : ''}">
		<aui:validator name="required"
			errorMessage="Type course duration in this field." />
		<aui:validator name="max"
			errorMessage="The maximum value of the course duration is 40.">40</aui:validator>
		<aui:validator name="min"
			errorMessage="The minimum value of the course duration is 1.">1</aui:validator>
	</aui:input>
	<aui:fieldset>
		<label>Status</label>
		<aui:row>
			<aui:input label="Available" name="status" type="radio" value="true"
				checked="${not empty course ? course.status : true}" />
			<aui:input label="Unavailable" name="status" type="radio"
				value="false"
				checked="${not empty course ? not course.status : false}" />
		</aui:row>
	</aui:fieldset>
	<aui:button-row>
		<aui:button type="submit" />
		<aui:button type="cancel" onClick="${ viewURL.toString() }"></aui:button>
	</aui:button-row>
</aui:form>