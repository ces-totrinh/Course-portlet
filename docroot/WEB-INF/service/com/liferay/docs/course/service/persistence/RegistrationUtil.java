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

import com.liferay.docs.course.model.Registration;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the registration service. This utility wraps {@link RegistrationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author to.trinh
 * @see RegistrationPersistence
 * @see RegistrationPersistenceImpl
 * @generated
 */
public class RegistrationUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Registration registration) {
		getPersistence().clearCache(registration);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Registration> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Registration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Registration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Registration update(Registration registration)
		throws SystemException {
		return getPersistence().update(registration);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Registration update(Registration registration,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(registration, serviceContext);
	}

	/**
	* Returns all the registrations where courseId = &#63;.
	*
	* @param courseId the course ID
	* @return the matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.course.model.Registration> findByCourseId(
		long courseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCourseId(courseId);
	}

	/**
	* Returns a range of all the registrations where courseId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.course.model.impl.RegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param courseId the course ID
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @return the range of matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.course.model.Registration> findByCourseId(
		long courseId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCourseId(courseId, start, end);
	}

	/**
	* Returns an ordered range of all the registrations where courseId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.course.model.impl.RegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param courseId the course ID
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.course.model.Registration> findByCourseId(
		long courseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCourseId(courseId, start, end, orderByComparator);
	}

	/**
	* Returns the first registration in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration
	* @throws com.liferay.docs.course.NoSuchRegistrationException if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration findByCourseId_First(
		long courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCourseId_First(courseId, orderByComparator);
	}

	/**
	* Returns the first registration in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration, or <code>null</code> if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration fetchByCourseId_First(
		long courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCourseId_First(courseId, orderByComparator);
	}

	/**
	* Returns the last registration in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration
	* @throws com.liferay.docs.course.NoSuchRegistrationException if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration findByCourseId_Last(
		long courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCourseId_Last(courseId, orderByComparator);
	}

	/**
	* Returns the last registration in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration, or <code>null</code> if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration fetchByCourseId_Last(
		long courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCourseId_Last(courseId, orderByComparator);
	}

	/**
	* Returns the registrations before and after the current registration in the ordered set where courseId = &#63;.
	*
	* @param registrationId the primary key of the current registration
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next registration
	* @throws com.liferay.docs.course.NoSuchRegistrationException if a registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration[] findByCourseId_PrevAndNext(
		long registrationId, long courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCourseId_PrevAndNext(registrationId, courseId,
			orderByComparator);
	}

	/**
	* Removes all the registrations where courseId = &#63; from the database.
	*
	* @param courseId the course ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCourseId(long courseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCourseId(courseId);
	}

	/**
	* Returns the number of registrations where courseId = &#63;.
	*
	* @param courseId the course ID
	* @return the number of matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCourseId(long courseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCourseId(courseId);
	}

	/**
	* Returns all the registrations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.course.model.Registration> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the registrations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.course.model.impl.RegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @return the range of matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.course.model.Registration> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the registrations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.course.model.impl.RegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.course.model.Registration> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first registration in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration
	* @throws com.liferay.docs.course.NoSuchRegistrationException if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first registration in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration, or <code>null</code> if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last registration in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration
	* @throws com.liferay.docs.course.NoSuchRegistrationException if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last registration in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration, or <code>null</code> if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the registrations before and after the current registration in the ordered set where userId = &#63;.
	*
	* @param registrationId the primary key of the current registration
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next registration
	* @throws com.liferay.docs.course.NoSuchRegistrationException if a registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration[] findByUserId_PrevAndNext(
		long registrationId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId_PrevAndNext(registrationId, userId,
			orderByComparator);
	}

	/**
	* Removes all the registrations where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of registrations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns all the registrations where courseId = &#63; and status = &#63;.
	*
	* @param courseId the course ID
	* @param status the status
	* @return the matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.course.model.Registration> findByCourseIdAndStatus(
		long courseId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCourseIdAndStatus(courseId, status);
	}

	/**
	* Returns a range of all the registrations where courseId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.course.model.impl.RegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param courseId the course ID
	* @param status the status
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @return the range of matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.course.model.Registration> findByCourseIdAndStatus(
		long courseId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCourseIdAndStatus(courseId, status, start, end);
	}

	/**
	* Returns an ordered range of all the registrations where courseId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.course.model.impl.RegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param courseId the course ID
	* @param status the status
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.course.model.Registration> findByCourseIdAndStatus(
		long courseId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCourseIdAndStatus(courseId, status, start, end,
			orderByComparator);
	}

	/**
	* Returns the first registration in the ordered set where courseId = &#63; and status = &#63;.
	*
	* @param courseId the course ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration
	* @throws com.liferay.docs.course.NoSuchRegistrationException if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration findByCourseIdAndStatus_First(
		long courseId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCourseIdAndStatus_First(courseId, status,
			orderByComparator);
	}

	/**
	* Returns the first registration in the ordered set where courseId = &#63; and status = &#63;.
	*
	* @param courseId the course ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration, or <code>null</code> if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration fetchByCourseIdAndStatus_First(
		long courseId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCourseIdAndStatus_First(courseId, status,
			orderByComparator);
	}

	/**
	* Returns the last registration in the ordered set where courseId = &#63; and status = &#63;.
	*
	* @param courseId the course ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration
	* @throws com.liferay.docs.course.NoSuchRegistrationException if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration findByCourseIdAndStatus_Last(
		long courseId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCourseIdAndStatus_Last(courseId, status,
			orderByComparator);
	}

	/**
	* Returns the last registration in the ordered set where courseId = &#63; and status = &#63;.
	*
	* @param courseId the course ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration, or <code>null</code> if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration fetchByCourseIdAndStatus_Last(
		long courseId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCourseIdAndStatus_Last(courseId, status,
			orderByComparator);
	}

	/**
	* Returns the registrations before and after the current registration in the ordered set where courseId = &#63; and status = &#63;.
	*
	* @param registrationId the primary key of the current registration
	* @param courseId the course ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next registration
	* @throws com.liferay.docs.course.NoSuchRegistrationException if a registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration[] findByCourseIdAndStatus_PrevAndNext(
		long registrationId, long courseId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCourseIdAndStatus_PrevAndNext(registrationId,
			courseId, status, orderByComparator);
	}

	/**
	* Removes all the registrations where courseId = &#63; and status = &#63; from the database.
	*
	* @param courseId the course ID
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCourseIdAndStatus(long courseId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCourseIdAndStatus(courseId, status);
	}

	/**
	* Returns the number of registrations where courseId = &#63; and status = &#63;.
	*
	* @param courseId the course ID
	* @param status the status
	* @return the number of matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCourseIdAndStatus(long courseId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCourseIdAndStatus(courseId, status);
	}

	/**
	* Returns all the registrations where courseId = &#63; and userId = &#63;.
	*
	* @param courseId the course ID
	* @param userId the user ID
	* @return the matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.course.model.Registration> findByCourseIdAndUserId(
		long courseId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCourseIdAndUserId(courseId, userId);
	}

	/**
	* Returns a range of all the registrations where courseId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.course.model.impl.RegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param courseId the course ID
	* @param userId the user ID
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @return the range of matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.course.model.Registration> findByCourseIdAndUserId(
		long courseId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCourseIdAndUserId(courseId, userId, start, end);
	}

	/**
	* Returns an ordered range of all the registrations where courseId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.course.model.impl.RegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param courseId the course ID
	* @param userId the user ID
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.course.model.Registration> findByCourseIdAndUserId(
		long courseId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCourseIdAndUserId(courseId, userId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first registration in the ordered set where courseId = &#63; and userId = &#63;.
	*
	* @param courseId the course ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration
	* @throws com.liferay.docs.course.NoSuchRegistrationException if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration findByCourseIdAndUserId_First(
		long courseId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCourseIdAndUserId_First(courseId, userId,
			orderByComparator);
	}

	/**
	* Returns the first registration in the ordered set where courseId = &#63; and userId = &#63;.
	*
	* @param courseId the course ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration, or <code>null</code> if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration fetchByCourseIdAndUserId_First(
		long courseId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCourseIdAndUserId_First(courseId, userId,
			orderByComparator);
	}

	/**
	* Returns the last registration in the ordered set where courseId = &#63; and userId = &#63;.
	*
	* @param courseId the course ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration
	* @throws com.liferay.docs.course.NoSuchRegistrationException if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration findByCourseIdAndUserId_Last(
		long courseId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCourseIdAndUserId_Last(courseId, userId,
			orderByComparator);
	}

	/**
	* Returns the last registration in the ordered set where courseId = &#63; and userId = &#63;.
	*
	* @param courseId the course ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration, or <code>null</code> if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration fetchByCourseIdAndUserId_Last(
		long courseId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCourseIdAndUserId_Last(courseId, userId,
			orderByComparator);
	}

	/**
	* Returns the registrations before and after the current registration in the ordered set where courseId = &#63; and userId = &#63;.
	*
	* @param registrationId the primary key of the current registration
	* @param courseId the course ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next registration
	* @throws com.liferay.docs.course.NoSuchRegistrationException if a registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration[] findByCourseIdAndUserId_PrevAndNext(
		long registrationId, long courseId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCourseIdAndUserId_PrevAndNext(registrationId,
			courseId, userId, orderByComparator);
	}

	/**
	* Removes all the registrations where courseId = &#63; and userId = &#63; from the database.
	*
	* @param courseId the course ID
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCourseIdAndUserId(long courseId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCourseIdAndUserId(courseId, userId);
	}

	/**
	* Returns the number of registrations where courseId = &#63; and userId = &#63;.
	*
	* @param courseId the course ID
	* @param userId the user ID
	* @return the number of matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCourseIdAndUserId(long courseId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCourseIdAndUserId(courseId, userId);
	}

	/**
	* Caches the registration in the entity cache if it is enabled.
	*
	* @param registration the registration
	*/
	public static void cacheResult(
		com.liferay.docs.course.model.Registration registration) {
		getPersistence().cacheResult(registration);
	}

	/**
	* Caches the registrations in the entity cache if it is enabled.
	*
	* @param registrations the registrations
	*/
	public static void cacheResult(
		java.util.List<com.liferay.docs.course.model.Registration> registrations) {
		getPersistence().cacheResult(registrations);
	}

	/**
	* Creates a new registration with the primary key. Does not add the registration to the database.
	*
	* @param registrationId the primary key for the new registration
	* @return the new registration
	*/
	public static com.liferay.docs.course.model.Registration create(
		long registrationId) {
		return getPersistence().create(registrationId);
	}

	/**
	* Removes the registration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationId the primary key of the registration
	* @return the registration that was removed
	* @throws com.liferay.docs.course.NoSuchRegistrationException if a registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration remove(
		long registrationId)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(registrationId);
	}

	public static com.liferay.docs.course.model.Registration updateImpl(
		com.liferay.docs.course.model.Registration registration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(registration);
	}

	/**
	* Returns the registration with the primary key or throws a {@link com.liferay.docs.course.NoSuchRegistrationException} if it could not be found.
	*
	* @param registrationId the primary key of the registration
	* @return the registration
	* @throws com.liferay.docs.course.NoSuchRegistrationException if a registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration findByPrimaryKey(
		long registrationId)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(registrationId);
	}

	/**
	* Returns the registration with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param registrationId the primary key of the registration
	* @return the registration, or <code>null</code> if a registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.course.model.Registration fetchByPrimaryKey(
		long registrationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(registrationId);
	}

	/**
	* Returns all the registrations.
	*
	* @return the registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.course.model.Registration> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the registrations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.course.model.impl.RegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @return the range of registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.course.model.Registration> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the registrations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.course.model.impl.RegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.course.model.Registration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the registrations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of registrations.
	*
	* @return the number of registrations
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RegistrationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RegistrationPersistence)PortletBeanLocatorUtil.locate(com.liferay.docs.course.service.ClpSerializer.getServletContextName(),
					RegistrationPersistence.class.getName());

			ReferenceRegistry.registerReference(RegistrationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(RegistrationPersistence persistence) {
	}

	private static RegistrationPersistence _persistence;
}