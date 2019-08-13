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

import java.util.List;

import com.liferay.docs.course.model.Registration;
import com.liferay.docs.course.service.base.RegistrationLocalServiceBaseImpl;
import com.liferay.docs.course.service.persistence.RegistrationFinderUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the registration local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.course.service.RegistrationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author to.trinh
 * @see com.liferay.docs.course.service.base.RegistrationLocalServiceBaseImpl
 * @see com.liferay.docs.course.service.RegistrationLocalServiceUtil
 */
public class RegistrationLocalServiceImpl extends RegistrationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.docs.course.service.RegistrationLocalServiceUtil} to access the registration local service.
	 */
	public Registration addRegistration(long courseId, long userId) throws PortalException, SystemException {		
		
		int countRegistrationExisted = countRegistrationByCourseIdAndUserId(courseId, userId);
		
		if(countRegistrationExisted > 0) return null;
		
		long registrationId = counterLocalService.increment(Registration.class.getName());
		
		Registration registration = registrationPersistence.create(registrationId);
		
		registration.setCourseId(courseId);
		registration.setUserId(userId);
		registration.setStatus(WAITING_APPROVAL);
		
		super.addRegistration(registration);
		return registration;
	}
	
	public List<Registration> getRegistrationByCourseId(long courseId, int start, int end) throws SystemException {
		return registrationPersistence.findByCourseId(courseId, start, end);
	}
	
	public int countRegistrationByCourseId(long courseId) throws SystemException {
		return registrationPersistence.countByCourseId(courseId);
	}
	
	public int countRegistrationApprovedByCourseId(long courseId) throws SystemException {
		return registrationPersistence.countByCourseIdAndStatus(courseId, STATUS_APPROVED);
	}
	public Registration approveRegistration(long registrationId) throws PortalException, SystemException {
		return _updateRegistration(registrationId, STATUS_APPROVED);
	}
	
	public Registration rejectRegistration(long registrationId) throws PortalException, SystemException {
		return _updateRegistration(registrationId, STATUS_REJECTED);
	}
	
	public int countRegistrationByCourseIdAndUserId(long courseId, long userId) throws SystemException {
		return registrationPersistence.countByCourseIdAndUserId(courseId, userId);
	}
	
	public void updateRegistrationsWithRejectedStatus(long courseId) throws SystemException {
		RegistrationFinderUtil.updateRegistrationsWithRejectedStatus(courseId);
	}
	
	public List<Registration> getRegistrationByUserId(long userId) throws SystemException {
		return registrationPersistence.findByUserId(userId);
	}
	
	public int countRegistrationByUserId(long userId) throws SystemException {
		return registrationPersistence.countByUserId(userId);
	}
	
	public Registration deleteRegistration(Registration registration) throws SystemException {
		return registrationPersistence.remove(registration);
	}

	public Registration deleteRegistration(long registrationId) throws SystemException {
		Registration registration = registrationPersistence.fetchByPrimaryKey(registrationId);
		return deleteRegistration(registration);
	}
	public static final int WAITING_APPROVAL = 0;
	public static final int STATUS_APPROVED = 1;
	public static final int STATUS_REJECTED = -1;
	
	private Registration _updateRegistration(long registrationId, int status) throws PortalException, SystemException {
		Registration registration = registrationPersistence.findByPrimaryKey(registrationId);
		
		registration.setStatus(status);
		
		super.updateRegistration(registration);
		return registration;
	}
}