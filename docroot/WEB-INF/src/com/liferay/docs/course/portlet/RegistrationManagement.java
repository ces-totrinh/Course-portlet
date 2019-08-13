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
 * Portlet implementation class RegistrationManagement
 */
public class RegistrationManagement extends MVCPortlet {
 
	public void deleteRegistration(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		long registrationId = ParamUtil.getLong(actionRequest, "registrationId");
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Registration.class.getName(), actionRequest);
		
		RegistrationServiceUtil.deleteRegistration(registrationId, serviceContext);
		sendRedirect(actionRequest, actionResponse);
	}
}
