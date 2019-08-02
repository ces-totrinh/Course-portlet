package com.liferay.docs.course.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.docs.course.model.Course;
import com.liferay.docs.course.service.CourseServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;


/**
 * Portlet implementation class Course
 */
public class CoursePortlet extends MVCPortlet {
 
	public void addCourse(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {	
		_updateCourse(actionRequest);
		sendRedirect(actionRequest, actionResponse);
	}
	
	public void updateCourse(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {	
		_updateCourse(actionRequest);
		sendRedirect(actionRequest, actionResponse);
	}
	
	public void deleteCourse(ActionRequest actionRequest, ActionResponse actionResponse) throws SystemException, PortalException {
		long courseId = ParamUtil.getLong(actionRequest, "courseId");
		CourseServiceUtil.deleteCourse(courseId);
	}
	
	private Course _updateCourse(ActionRequest actionRequest) throws SystemException, PortalException {
		long courseId = ParamUtil.getLong(actionRequest,"courseId");
		String name = ParamUtil.getString(actionRequest, "name");
		String description = ParamUtil.getString(actionRequest, "description");
		String lecturer = ParamUtil.getString(actionRequest, "lecturer");
		int duration = ParamUtil.getInteger(actionRequest, "duration");
		boolean status = ParamUtil.getBoolean(actionRequest, "status");
		
		Course course = null;
		
		if(courseId <= 0) {
			course = CourseServiceUtil.addCourse(name, description, lecturer, duration, status);
		}
		else {
			course = CourseServiceUtil.getCourse(courseId);
			course = CourseServiceUtil.updateCourse(courseId, name, description, lecturer, duration, status);
		}
		return course;
	}
}
