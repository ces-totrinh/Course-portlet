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
import com.liferay.docs.course.service.base.CourseServiceBaseImpl;
import com.liferay.docs.course.service.permission.ModelPermission;
import com.liferay.docs.course.service.permission.CoursePermission;
import com.liferay.docs.course.util.ActionKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

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
	
	public Course updateCourse(long groupId, long courseId, String name, String description, String lecturer, int duration, boolean status) throws PortalException, SystemException {
		if(courseId <= 0) {
			ModelPermission.check(getPermissionChecker(), groupId, ActionKeys.ADD_COURSE);
			return courseLocalService.addCourse(groupId, name, description, lecturer, duration, status);
		}
		else {
			CoursePermission.check(getPermissionChecker(), courseId, ActionKeys.UPDATE_COURSE);
			return courseLocalService.updateCourse(courseId, name, description, lecturer, duration, status);
		}
	}
	
	public Course updateStatusOfCourse(long courseId, boolean status) throws PortalException, SystemException {
		CoursePermission.check(getPermissionChecker(), courseId, ActionKeys.UPDATE_COURSE);
		return courseLocalService.updateStatusOfCourse(courseId, status);
	}
	public Course getCourse(long courseId) throws PortalException, SystemException {
		return courseLocalService.getCourse(courseId);
	}
	
	public Course deleteCourse(long courseId) throws Exception {
		CoursePermission.check(getPermissionChecker(),  courseId, ActionKeys.DELETE_COURSE);
		return courseLocalService.deleteCourse(courseId);
	}

}