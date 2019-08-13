package com.liferay.docs.course.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import com.liferay.docs.course.model.Registration;
import com.liferay.docs.course.service.RegistrationServiceUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class RegistrationApproval
 */
public class RegistrationApproval extends MVCPortlet {
 
	public void approveRegistration(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		long registrationId = ParamUtil.getLong(actionRequest, "registrationId");
		long courseId = ParamUtil.getLong(actionRequest, "courseId");
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Registration.class.getName(), actionRequest);
		
		RegistrationServiceUtil.approveRegistration(registrationId, serviceContext);
		_reloadViewsAfterChangeStatus(actionRequest, actionResponse, courseId, "/html/registrationapproval/registrationOfCourse.jsp");
	}
	
	public void rejectRegistration(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		long registrationId = ParamUtil.getLong(actionRequest, "registrationId");
		long courseId = ParamUtil.getLong(actionRequest, "courseId");
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Registration.class.getName(), actionRequest);
		
		RegistrationServiceUtil.rejectRegistration(registrationId, serviceContext);
		_reloadViewsAfterChangeStatus(actionRequest, actionResponse, courseId, "/html/registrationapproval/registrationOfCourse.jsp");
	}
	
	private void _reloadViewsAfterChangeStatus(ActionRequest actionRequest, ActionResponse actionResponse, long courseId, String url) throws IOException{
		String portletName = (String)actionRequest.getAttribute(WebKeys.PORTLET_ID);

		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		PortletURL redirectURL = PortletURLFactoryUtil.create(PortalUtil.getHttpServletRequest(actionRequest),
		portletName, themeDisplay.getLayout().getPlid(), PortletRequest.RENDER_PHASE);

		redirectURL.setParameter("courseId", "" + courseId);
		redirectURL.setParameter("mvcPath", url);

		actionResponse.sendRedirect(redirectURL.toString());
		
	}

}
