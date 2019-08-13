package com.liferay.docs.course.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.docs.course.model.Registration;
import com.liferay.docs.course.service.RegistrationServiceUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class CourseRegistration
 */
public class CourseRegistration extends MVCPortlet {
 
	public void registerCourse(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {	
		long courseId = ParamUtil.getLong(actionRequest, "courseId");
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Registration.class.getName(), actionRequest);
		RegistrationServiceUtil.addRegistration(courseId, serviceContext.getUserId(), serviceContext);
		sendRedirect(actionRequest, actionResponse);
	}
}
