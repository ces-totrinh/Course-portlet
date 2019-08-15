package com.liferay.custom.listener;

import com.liferay.docs.course.model.Registration;
import com.liferay.docs.course.service.CourseServiceUtil;
import com.liferay.docs.course.service.RegistrationLocalServiceUtil;
import com.liferay.portal.ModelListenerException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.BaseModelListener;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

public class MyRegistrationListener extends BaseModelListener<Registration>{
	@Override
	public void onAfterUpdate(Registration registration) throws ModelListenerException{
		try{
			long courseId = registration.getCourseId();
			int totalRegistrationapproved = RegistrationLocalServiceUtil.countRegistrationApprovedByCourseId(courseId);
			if(totalRegistrationapproved < MAXIMUM_NUMBER_OF_REGISTRATIONS_FOR_A_CLASS) return;
			User user = UserLocalServiceUtil.getUser(registration.getUserId());
			long groupId = user.getGroupId();
			//Setting the status of the course is 'Unavailable' when there are 20 approved registration
			CourseServiceUtil.updateStatusOfCourse(groupId, courseId, STATUS_UNAVAILALE_OF_COURSE);
			//Setting the status of the remaining registrations is 'Rejected'
			RegistrationLocalServiceUtil.updateRegistrationsWithRejectedStatus(courseId);
			
		} catch (Exception e) {
			_log.error(e.getMessage());
		}
		
	}
	
	public static final boolean STATUS_UNAVAILALE_OF_COURSE = false;
	public static final int MAXIMUM_NUMBER_OF_REGISTRATIONS_FOR_A_CLASS = 20;
	private static final Log _log = LogFactoryUtil.getLog(MyRegistrationListener.class);
}
