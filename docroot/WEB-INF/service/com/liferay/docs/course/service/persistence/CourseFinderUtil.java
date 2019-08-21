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

package com.liferay.docs.course.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author to.trinh
 */
public class CourseFinderUtil {
	public static java.util.List<java.lang.Object> getCoursesWithTotalRegistration()
		throws java.lang.Exception {
		return getFinder().getCoursesWithTotalRegistration();
	}

	public static CourseFinder getFinder() {
		if (_finder == null) {
			_finder = (CourseFinder)PortletBeanLocatorUtil.locate(com.liferay.docs.course.service.ClpSerializer.getServletContextName(),
					CourseFinder.class.getName());

			ReferenceRegistry.registerReference(CourseFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(CourseFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(CourseFinderUtil.class, "_finder");
	}

	private static CourseFinder _finder;
}