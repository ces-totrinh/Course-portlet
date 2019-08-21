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

import com.liferay.docs.course.service.CourseServiceUtil;

import java.util.Arrays;

/**
 * @author to.trinh
 * @generated
 */
public class CourseServiceClpInvoker {
	public CourseServiceClpInvoker() {
		_methodName26 = "getBeanIdentifier";

		_methodParameterTypes26 = new String[] {  };

		_methodName27 = "setBeanIdentifier";

		_methodParameterTypes27 = new String[] { "java.lang.String" };

		_methodName32 = "updateCourse";

		_methodParameterTypes32 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "int", "boolean"
			};

		_methodName33 = "updateStatusOfCourse";

		_methodParameterTypes33 = new String[] { "long", "boolean" };

		_methodName34 = "getCourse";

		_methodParameterTypes34 = new String[] { "long" };

		_methodName35 = "deleteCourse";

		_methodParameterTypes35 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName26.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes26, parameterTypes)) {
			return CourseServiceUtil.getBeanIdentifier();
		}

		if (_methodName27.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes27, parameterTypes)) {
			CourseServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName32.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes32, parameterTypes)) {
			return CourseServiceUtil.updateCourse(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4],
				((Integer)arguments[5]).intValue(),
				((Boolean)arguments[6]).booleanValue());
		}

		if (_methodName33.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes33, parameterTypes)) {
			return CourseServiceUtil.updateStatusOfCourse(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName34.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes34, parameterTypes)) {
			return CourseServiceUtil.getCourse(((Long)arguments[0]).longValue());
		}

		if (_methodName35.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes35, parameterTypes)) {
			return CourseServiceUtil.deleteCourse(((Long)arguments[0]).longValue());
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