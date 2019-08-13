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

package com.liferay.docs.course.service.http;

import com.liferay.docs.course.service.CourseServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.docs.course.service.CourseServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.docs.course.model.CourseSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.docs.course.model.Course}, that is translated to a
 * {@link com.liferay.docs.course.model.CourseSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author to.trinh
 * @see CourseServiceHttp
 * @see com.liferay.docs.course.model.CourseSoap
 * @see com.liferay.docs.course.service.CourseServiceUtil
 * @generated
 */
public class CourseServiceSoap {
	public static com.liferay.docs.course.model.CourseSoap addCourse(
		java.lang.String name, java.lang.String description,
		java.lang.String lecturer, int duration, boolean status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.liferay.docs.course.model.Course returnValue = CourseServiceUtil.addCourse(name,
					description, lecturer, duration, status, serviceContext);

			return com.liferay.docs.course.model.CourseSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.docs.course.model.CourseSoap updateCourse(
		long courseId, java.lang.String name, java.lang.String description,
		java.lang.String lecturer, int duration, boolean status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.liferay.docs.course.model.Course returnValue = CourseServiceUtil.updateCourse(courseId,
					name, description, lecturer, duration, status,
					serviceContext);

			return com.liferay.docs.course.model.CourseSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.docs.course.model.CourseSoap updateStatusOfCourse(
		long groupId, long courseId, boolean status) throws RemoteException {
		try {
			com.liferay.docs.course.model.Course returnValue = CourseServiceUtil.updateStatusOfCourse(groupId,
					courseId, status);

			return com.liferay.docs.course.model.CourseSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.docs.course.model.CourseSoap getCourse(
		long courseId) throws RemoteException {
		try {
			com.liferay.docs.course.model.Course returnValue = CourseServiceUtil.getCourse(courseId);

			return com.liferay.docs.course.model.CourseSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.docs.course.model.CourseSoap deleteCourse(
		long courseId, com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.liferay.docs.course.model.Course returnValue = CourseServiceUtil.deleteCourse(courseId,
					serviceContext);

			return com.liferay.docs.course.model.CourseSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.docs.course.model.CourseSoap _updateCourse(
		long courseId, java.lang.String name, java.lang.String description,
		java.lang.String lecturer, int duration, boolean status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.liferay.docs.course.model.Course returnValue = CourseServiceUtil._updateCourse(courseId,
					name, description, lecturer, duration, status,
					serviceContext);

			return com.liferay.docs.course.model.CourseSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CourseServiceSoap.class);
}