/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.course.service.impl;

import com.liferay.docs.course.model.Registration;
import com.liferay.docs.course.service.base.RegistrationServiceBaseImpl;
import com.liferay.docs.course.service.permission.ModelPermission;
import com.liferay.docs.course.service.permission.RegistrationPermission;
import com.liferay.docs.course.util.ActionKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the registration remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.course.service.RegistrationService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author to.trinh
 * @see com.liferay.docs.course.service.base.RegistrationServiceBaseImpl
 * @see com.liferay.docs.course.service.RegistrationServiceUtil
 */
public class RegistrationServiceImpl extends RegistrationServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.docs.course.service.RegistrationServiceUtil} to access the registration remote service.
	 */
	public Registration addRegistration(long courseId, long userId, ServiceContext serviceContext) throws PortalException, SystemException {
		ModelPermission.check(getPermissionChecker(), serviceContext.getScopeGroupId(), ActionKeys.ADD_REGISTRATION);
		return registrationLocalService.addRegistration(courseId, userId);
	}
	public Registration approveRegistration(long registrationId, ServiceContext serviceContext) throws PortalException, SystemException {
		RegistrationPermission.check(getPermissionChecker(), serviceContext.getScopeGroupId(), registrationId, ActionKeys.UPDATE_REGISTRATION);
		return registrationLocalService.approveRegistration(registrationId);
	}
	
	public Registration rejectRegistration(long registrationId, ServiceContext serviceContext) throws PortalException, SystemException {
		RegistrationPermission.check(getPermissionChecker(), serviceContext.getScopeGroupId(), registrationId, ActionKeys.UPDATE_REGISTRATION);
		return registrationLocalService.rejectRegistration(registrationId);
	}
	
	public Registration deleteRegistration(long registrationId, ServiceContext serviceContext) throws Exception {
		RegistrationPermission.check(getPermissionChecker(), serviceContext.getScopeGroupId(), registrationId, ActionKeys.DELETE_REGISTRATION);
		return registrationLocalService.deleteRegistration(registrationId);
	}
}