package com.liferay.docs.course.service.permission;

import com.liferay.docs.course.model.Course;
import com.liferay.docs.course.service.CourseLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;

public class CoursePermission {

	public static void check(PermissionChecker permissionChecker, long courseId, String actionId) throws PortalException, SystemException {
		if (!contains(permissionChecker,courseId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker, long courseId, String actionId) throws PortalException, SystemException {
		Course course = CourseLocalServiceUtil.getCourseById(courseId);
		return permissionChecker.hasPermission(course.getGroupId(), Course.class.getName(),	courseId, actionId);

	}
}
