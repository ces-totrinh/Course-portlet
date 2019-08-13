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

import com.liferay.docs.course.model.Course;
import com.liferay.docs.course.service.CourseLocalServiceUtil;
import com.liferay.docs.course.service.base.CourseServiceBaseImpl;
import com.liferay.docs.course.service.permission.ModelPermission;
import com.liferay.docs.course.service.permission.CoursePermission;
import com.liferay.docs.course.util.ActionKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the course remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.course.service.CourseService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author to.trinh
 * @see com.liferay.docs.course.service.base.CourseServiceBaseImpl
 * @see com.liferay.docs.course.service.CourseServiceUtil
 */
public class CourseServiceImpl extends CourseServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.docs.course.service.CourseServiceUtil} to access the course remote service.
	 */
	
	public Course addCourse(String name, String description, String lecturer, int duration, boolean status, ServiceContext serviceContext) throws PortalException, SystemException {
		ModelPermission.check(getPermissionChecker(), serviceContext.getScopeGroupId(), ActionKeys.ADD_COURSE);
		return CourseLocalServiceUtil.addCourse(name, description, lecturer, duration, status);
	}
	
	public Course updateCourse(long courseId, String name, String description, String lecturer, int duration, boolean status, ServiceContext serviceContext) throws PortalException, SystemException {
		CoursePermission.check(getPermissionChecker(), serviceContext.getScopeGroupId(), courseId, ActionKeys.UPDATE_COURSE);
		return CourseLocalServiceUtil.updateCourse(courseId, name, description, lecturer, duration, status);
	}
	public Course updateStatusOfCourse(long groupId, long courseId, boolean status) throws PortalException, SystemException {
		CoursePermission.check(getPermissionChecker(), groupId, courseId, ActionKeys.UPDATE_COURSE);
		return CourseLocalServiceUtil.updateStatusOfCourse(courseId, status);
	}
	public Course getCourse(long courseId) throws PortalException, SystemException {
		return CourseLocalServiceUtil.getCourse(courseId);
	}
	
	public Course deleteCourse(long courseId, ServiceContext serviceContext) throws Exception {
		CoursePermission.check(getPermissionChecker(), serviceContext.getScopeGroupId(), courseId, ActionKeys.DELETE_COURSE);
		return CourseLocalServiceUtil.deleteCourse(courseId);
	}
	
	public Course _updateCourse(long courseId, String name, String description, String lecturer, int duration, boolean status, ServiceContext serviceContext) throws PortalException, SystemException {
		Course course = null;
		if(courseId <= 0) {
			course = addCourse(name, description, lecturer, duration, status, serviceContext);
		}
		else {
			course = getCourse(courseId);
			course = updateCourse(courseId, name, description, lecturer, duration, status, serviceContext);
		}
		return course;
	
	}
}