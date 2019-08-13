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

import com.liferay.docs.course.model.Course;
import com.liferay.docs.course.service.base.CourseLocalServiceBaseImpl;
import com.liferay.docs.course.service.persistence.CourseFinderUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the course local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.course.service.CourseLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author to.trinh
 * @see com.liferay.docs.course.service.base.CourseLocalServiceBaseImpl
 * @see com.liferay.docs.course.service.CourseLocalServiceUtil
 */
public class CourseLocalServiceImpl extends CourseLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.docs.course.service.CourseLocalServiceUtil} to access the course local service.
	 */
	
	public Course addCourse(String name, String description, String lecturer, int duration, boolean status) throws PortalException, SystemException {
		long courseId = counterLocalService.increment(Course.class.getName());
		Course course = coursePersistence.create(courseId);
		
		course.setName(name);
		course.setDescription(description);
		course.setDuration(duration);
		course.setLecturer(lecturer);
		course.setStatus(status);
		
		super.addCourse(course);
		return course;
	}

	
	public Course updateCourse(long courseId, String name, String description, String lecturer, int duration, boolean status) throws PortalException, SystemException {
		Course course = coursePersistence.findByPrimaryKey(courseId);
		
		course.setName(name);
		course.setDescription(description);
		course.setDuration(duration);
		course.setLecturer(lecturer);
		course.setStatus(status);
		
		super.updateCourse(course);
		return course;
	}
	
	public Course updateStatusOfCourse(long courseId, boolean status) throws PortalException, SystemException {
		Course course = coursePersistence.findByPrimaryKey(courseId);
		course.setStatus(status);
		
		super.updateCourse(course);
		
		return course;
	}
	
	public Course deleteCourse(Course course) throws SystemException {
		return coursePersistence.remove(course);
	}
	public Course deleteCourse(long courseId) throws Exception {
		Course course = coursePersistence.fetchByPrimaryKey(courseId);
		return deleteCourse(course);
	}
	public List<Object> getCoursesWithTotalRegistration() throws SystemException {
		return CourseFinderUtil.getCoursesWithTotalRegistration();
	}
	
	public List<Course> getCoursesByStatus(int start, int end) throws SystemException {	
		return coursePersistence.findByStatus(true, start, end);	
	}
	
	public int countCoursesByStatus() throws SystemException {	
		return coursePersistence.countByStatus(true);
	}
	
	public Course getCourseById(long courseId) throws PortalException, SystemException {
		return coursePersistence.findByPrimaryKey(courseId);
	}
}