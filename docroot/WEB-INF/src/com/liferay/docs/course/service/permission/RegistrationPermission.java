package com.liferay.docs.course.service.permission;

import com.liferay.docs.course.model.Registration;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;

public class RegistrationPermission {
	public static void check(PermissionChecker permissionChecker, long groupId, long registrationId, String actionId) throws PortalException, SystemException {
		if (!contains(permissionChecker, groupId, registrationId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker, long groupId, long registrationId, String actionId) throws PortalException, SystemException {
		return permissionChecker.hasPermission(groupId, Registration.class.getName(),	registrationId, actionId);

	}
}
