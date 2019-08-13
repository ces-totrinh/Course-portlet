package com.liferay.docs.course.service.permission;

import com.liferay.docs.course.model.Course;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.service.ServiceContext;

public class CoursePermission {

	public static void check(PermissionChecker permissionChecker, long groupId, long courseId, String actionId) throws PortalException, SystemException {
		if (!contains(permissionChecker, groupId, courseId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker, long groupId, long courseId, String actionId) throws PortalException, SystemException {
		return permissionChecker.hasPermission(groupId, Course.class.getName(),	courseId, actionId);

	}
}
