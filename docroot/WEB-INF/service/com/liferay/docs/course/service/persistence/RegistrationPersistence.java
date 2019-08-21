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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the registration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author to.trinh
 * @see RegistrationPersistenceImpl
 * @see RegistrationUtil
 * @generated
 */
public interface RegistrationPersistence extends BasePersistence<Registration> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RegistrationUtil} to access the registration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the registrations where courseId = &#63;.
	*
	* @param courseId the course ID
	* @return the matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.course.model.Registration> findByCourseId(
		long courseId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.docs.course.model.Registration> findByCourseId(
		long courseId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.docs.course.model.Registration> findByCourseId(
		long courseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first registration in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration
	* @throws com.liferay.docs.course.NoSuchRegistrationException if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.course.model.Registration findByCourseId_First(
		long courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first registration in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration, or <code>null</code> if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.course.model.Registration fetchByCourseId_First(
		long courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last registration in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration
	* @throws com.liferay.docs.course.NoSuchRegistrationException if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.course.model.Registration findByCourseId_Last(
		long courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last registration in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration, or <code>null</code> if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.course.model.Registration fetchByCourseId_Last(
		long courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.docs.course.model.Registration[] findByCourseId_PrevAndNext(
		long registrationId, long courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the registrations where courseId = &#63; from the database.
	*
	* @param courseId the course ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCourseId(long courseId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of registrations where courseId = &#63;.
	*
	* @param courseId the course ID
	* @return the number of matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public int countByCourseId(long courseId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the registrations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.course.model.Registration> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.docs.course.model.Registration> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.docs.course.model.Registration> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first registration in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration
	* @throws com.liferay.docs.course.NoSuchRegistrationException if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.course.model.Registration findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first registration in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration, or <code>null</code> if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.course.model.Registration fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last registration in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration
	* @throws com.liferay.docs.course.NoSuchRegistrationException if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.course.model.Registration findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last registration in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration, or <code>null</code> if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.course.model.Registration fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.docs.course.model.Registration[] findByUserId_PrevAndNext(
		long registrationId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the registrations where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of registrations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the registrations where courseId = &#63; and status = &#63;.
	*
	* @param courseId the course ID
	* @param status the status
	* @return the matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.course.model.Registration> findByCourseIdAndStatus(
		long courseId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.docs.course.model.Registration> findByCourseIdAndStatus(
		long courseId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.docs.course.model.Registration> findByCourseIdAndStatus(
		long courseId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.docs.course.model.Registration findByCourseIdAndStatus_First(
		long courseId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first registration in the ordered set where courseId = &#63; and status = &#63;.
	*
	* @param courseId the course ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration, or <code>null</code> if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.course.model.Registration fetchByCourseIdAndStatus_First(
		long courseId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.docs.course.model.Registration findByCourseIdAndStatus_Last(
		long courseId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last registration in the ordered set where courseId = &#63; and status = &#63;.
	*
	* @param courseId the course ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration, or <code>null</code> if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.course.model.Registration fetchByCourseIdAndStatus_Last(
		long courseId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.docs.course.model.Registration[] findByCourseIdAndStatus_PrevAndNext(
		long registrationId, long courseId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the registrations where courseId = &#63; and status = &#63; from the database.
	*
	* @param courseId the course ID
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCourseIdAndStatus(long courseId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of registrations where courseId = &#63; and status = &#63;.
	*
	* @param courseId the course ID
	* @param status the status
	* @return the number of matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public int countByCourseIdAndStatus(long courseId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the registrations where courseId = &#63; and userId = &#63;.
	*
	* @param courseId the course ID
	* @param userId the user ID
	* @return the matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.course.model.Registration> findByCourseIdAndUserId(
		long courseId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.docs.course.model.Registration> findByCourseIdAndUserId(
		long courseId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.docs.course.model.Registration> findByCourseIdAndUserId(
		long courseId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.docs.course.model.Registration findByCourseIdAndUserId_First(
		long courseId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first registration in the ordered set where courseId = &#63; and userId = &#63;.
	*
	* @param courseId the course ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration, or <code>null</code> if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.course.model.Registration fetchByCourseIdAndUserId_First(
		long courseId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.docs.course.model.Registration findByCourseIdAndUserId_Last(
		long courseId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last registration in the ordered set where courseId = &#63; and userId = &#63;.
	*
	* @param courseId the course ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration, or <code>null</code> if a matching registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.course.model.Registration fetchByCourseIdAndUserId_Last(
		long courseId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.docs.course.model.Registration[] findByCourseIdAndUserId_PrevAndNext(
		long registrationId, long courseId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the registrations where courseId = &#63; and userId = &#63; from the database.
	*
	* @param courseId the course ID
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCourseIdAndUserId(long courseId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of registrations where courseId = &#63; and userId = &#63;.
	*
	* @param courseId the course ID
	* @param userId the user ID
	* @return the number of matching registrations
	* @throws SystemException if a system exception occurred
	*/
	public int countByCourseIdAndUserId(long courseId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the registration in the entity cache if it is enabled.
	*
	* @param registration the registration
	*/
	public void cacheResult(
		com.liferay.docs.course.model.Registration registration);

	/**
	* Caches the registrations in the entity cache if it is enabled.
	*
	* @param registrations the registrations
	*/
	public void cacheResult(
		java.util.List<com.liferay.docs.course.model.Registration> registrations);

	/**
	* Creates a new registration with the primary key. Does not add the registration to the database.
	*
	* @param registrationId the primary key for the new registration
	* @return the new registration
	*/
	public com.liferay.docs.course.model.Registration create(
		long registrationId);

	/**
	* Removes the registration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationId the primary key of the registration
	* @return the registration that was removed
	* @throws com.liferay.docs.course.NoSuchRegistrationException if a registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.course.model.Registration remove(
		long registrationId)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.docs.course.model.Registration updateImpl(
		com.liferay.docs.course.model.Registration registration)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the registration with the primary key or throws a {@link com.liferay.docs.course.NoSuchRegistrationException} if it could not be found.
	*
	* @param registrationId the primary key of the registration
	* @return the registration
	* @throws com.liferay.docs.course.NoSuchRegistrationException if a registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.course.model.Registration findByPrimaryKey(
		long registrationId)
		throws com.liferay.docs.course.NoSuchRegistrationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the registration with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param registrationId the primary key of the registration
	* @return the registration, or <code>null</code> if a registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.course.model.Registration fetchByPrimaryKey(
		long registrationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the registrations.
	*
	* @return the registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.course.model.Registration> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.docs.course.model.Registration> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.docs.course.model.Registration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the registrations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of registrations.
	*
	* @return the number of registrations
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}