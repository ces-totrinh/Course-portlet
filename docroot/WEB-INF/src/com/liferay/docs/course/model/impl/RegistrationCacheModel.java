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

package com.liferay.docs.course.model.impl;

import com.liferay.docs.course.model.Registration;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Registration in entity cache.
 *
 * @author to.trinh
 * @see Registration
 * @generated
 */
public class RegistrationCacheModel implements CacheModel<Registration>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{registrationId=");
		sb.append(registrationId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", courseId=");
		sb.append(courseId);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Registration toEntityModel() {
		RegistrationImpl registrationImpl = new RegistrationImpl();

		registrationImpl.setRegistrationId(registrationId);
		registrationImpl.setGroupId(groupId);
		registrationImpl.setUserId(userId);
		registrationImpl.setCourseId(courseId);
		registrationImpl.setStatus(status);

		registrationImpl.resetOriginalValues();

		return registrationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		registrationId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
		courseId = objectInput.readLong();
		status = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(registrationId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(courseId);
		objectOutput.writeInt(status);
	}

	public long registrationId;
	public long groupId;
	public long userId;
	public long courseId;
	public int status;
}