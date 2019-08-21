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

package com.liferay.docs.course.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Registration}.
 * </p>
 *
 * @author to.trinh
 * @see Registration
 * @generated
 */
public class RegistrationWrapper implements Registration,
	ModelWrapper<Registration> {
	public RegistrationWrapper(Registration registration) {
		_registration = registration;
	}

	@Override
	public Class<?> getModelClass() {
		return Registration.class;
	}

	@Override
	public String getModelClassName() {
		return Registration.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("registrationId", getRegistrationId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("courseId", getCourseId());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long registrationId = (Long)attributes.get("registrationId");

		if (registrationId != null) {
			setRegistrationId(registrationId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long courseId = (Long)attributes.get("courseId");

		if (courseId != null) {
			setCourseId(courseId);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this registration.
	*
	* @return the primary key of this registration
	*/
	@Override
	public long getPrimaryKey() {
		return _registration.getPrimaryKey();
	}

	/**
	* Sets the primary key of this registration.
	*
	* @param primaryKey the primary key of this registration
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_registration.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the registration ID of this registration.
	*
	* @return the registration ID of this registration
	*/
	@Override
	public long getRegistrationId() {
		return _registration.getRegistrationId();
	}

	/**
	* Sets the registration ID of this registration.
	*
	* @param registrationId the registration ID of this registration
	*/
	@Override
	public void setRegistrationId(long registrationId) {
		_registration.setRegistrationId(registrationId);
	}

	/**
	* Returns the group ID of this registration.
	*
	* @return the group ID of this registration
	*/
	@Override
	public long getGroupId() {
		return _registration.getGroupId();
	}

	/**
	* Sets the group ID of this registration.
	*
	* @param groupId the group ID of this registration
	*/
	@Override
	public void setGroupId(long groupId) {
		_registration.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this registration.
	*
	* @return the user ID of this registration
	*/
	@Override
	public long getUserId() {
		return _registration.getUserId();
	}

	/**
	* Sets the user ID of this registration.
	*
	* @param userId the user ID of this registration
	*/
	@Override
	public void setUserId(long userId) {
		_registration.setUserId(userId);
	}

	/**
	* Returns the user uuid of this registration.
	*
	* @return the user uuid of this registration
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registration.getUserUuid();
	}

	/**
	* Sets the user uuid of this registration.
	*
	* @param userUuid the user uuid of this registration
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_registration.setUserUuid(userUuid);
	}

	/**
	* Returns the course ID of this registration.
	*
	* @return the course ID of this registration
	*/
	@Override
	public long getCourseId() {
		return _registration.getCourseId();
	}

	/**
	* Sets the course ID of this registration.
	*
	* @param courseId the course ID of this registration
	*/
	@Override
	public void setCourseId(long courseId) {
		_registration.setCourseId(courseId);
	}

	/**
	* Returns the status of this registration.
	*
	* @return the status of this registration
	*/
	@Override
	public int getStatus() {
		return _registration.getStatus();
	}

	/**
	* Sets the status of this registration.
	*
	* @param status the status of this registration
	*/
	@Override
	public void setStatus(int status) {
		_registration.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _registration.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_registration.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _registration.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_registration.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _registration.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _registration.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_registration.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _registration.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_registration.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_registration.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_registration.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RegistrationWrapper((Registration)_registration.clone());
	}

	@Override
	public int compareTo(
		com.liferay.docs.course.model.Registration registration) {
		return _registration.compareTo(registration);
	}

	@Override
	public int hashCode() {
		return _registration.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.docs.course.model.Registration> toCacheModel() {
		return _registration.toCacheModel();
	}

	@Override
	public com.liferay.docs.course.model.Registration toEscapedModel() {
		return new RegistrationWrapper(_registration.toEscapedModel());
	}

	@Override
	public com.liferay.docs.course.model.Registration toUnescapedModel() {
		return new RegistrationWrapper(_registration.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _registration.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _registration.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_registration.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RegistrationWrapper)) {
			return false;
		}

		RegistrationWrapper registrationWrapper = (RegistrationWrapper)obj;

		if (Validator.equals(_registration, registrationWrapper._registration)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Registration getWrappedRegistration() {
		return _registration;
	}

	@Override
	public Registration getWrappedModel() {
		return _registration;
	}

	@Override
	public void resetOriginalValues() {
		_registration.resetOriginalValues();
	}

	private Registration _registration;
}