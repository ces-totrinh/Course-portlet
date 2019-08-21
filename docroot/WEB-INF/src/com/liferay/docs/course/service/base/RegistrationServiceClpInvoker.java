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

package com.liferay.docs.course.service.base;

import com.liferay.docs.course.service.RegistrationServiceUtil;

import java.util.Arrays;

/**
 * @author to.trinh
 * @generated
 */
public class RegistrationServiceClpInvoker {
	public RegistrationServiceClpInvoker() {
		_methodName26 = "getBeanIdentifier";

		_methodParameterTypes26 = new String[] {  };

		_methodName27 = "setBeanIdentifier";

		_methodParameterTypes27 = new String[] { "java.lang.String" };

		_methodName32 = "addRegistration";

		_methodParameterTypes32 = new String[] { "long", "long", "long" };

		_methodName33 = "approveRegistration";

		_methodParameterTypes33 = new String[] { "long" };

		_methodName34 = "rejectRegistration";

		_methodParameterTypes34 = new String[] { "long" };

		_methodName35 = "deleteRegistration";

		_methodParameterTypes35 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName26.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes26, parameterTypes)) {
			return RegistrationServiceUtil.getBeanIdentifier();
		}

		if (_methodName27.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes27, parameterTypes)) {
			RegistrationServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName32.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes32, parameterTypes)) {
			return RegistrationServiceUtil.addRegistration(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName33.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes33, parameterTypes)) {
			return RegistrationServiceUtil.approveRegistration(((Long)arguments[0]).longValue());
		}

		if (_methodName34.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes34, parameterTypes)) {
			return RegistrationServiceUtil.rejectRegistration(((Long)arguments[0]).longValue());
		}

		if (_methodName35.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes35, parameterTypes)) {
			return RegistrationServiceUtil.deleteRegistration(((Long)arguments[0]).longValue());
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName26;
	private String[] _methodParameterTypes26;
	private String _methodName27;
	private String[] _methodParameterTypes27;
	private String _methodName32;
	private String[] _methodParameterTypes32;
	private String _methodName33;
	private String[] _methodParameterTypes33;
	private String _methodName34;
	private String[] _methodParameterTypes34;
	private String _methodName35;
	private String[] _methodParameterTypes35;
}