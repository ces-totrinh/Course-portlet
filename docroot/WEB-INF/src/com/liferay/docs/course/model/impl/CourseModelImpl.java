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

import com.liferay.docs.course.model.Course;
import com.liferay.docs.course.model.CourseModel;
import com.liferay.docs.course.model.CourseSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Course service. Represents a row in the &quot;course_tbl&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.docs.course.model.CourseModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CourseImpl}.
 * </p>
 *
 * @author to.trinh
 * @see CourseImpl
 * @see com.liferay.docs.course.model.Course
 * @see com.liferay.docs.course.model.CourseModel
 * @generated
 */
@JSON(strict = true)
public class CourseModelImpl extends BaseModelImpl<Course>
	implements CourseModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a course model instance should use the {@link com.liferay.docs.course.model.Course} interface instead.
	 */
	public static final String TABLE_NAME = "course_tbl";
	public static final Object[][] TABLE_COLUMNS = {
			{ "course_id", Types.BIGINT },
			{ "course_name", Types.VARCHAR },
			{ "course_description", Types.VARCHAR },
			{ "course_lecturer", Types.VARCHAR },
			{ "course_duration", Types.INTEGER },
			{ "course_status", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table course_tbl (course_id LONG not null primary key,course_name VARCHAR(75) null,course_description VARCHAR(2000) null,course_lecturer VARCHAR(75) null,course_duration INTEGER,course_status BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table course_tbl";
	public static final String ORDER_BY_JPQL = " ORDER BY course.name ASC";
	public static final String ORDER_BY_SQL = " ORDER BY course_tbl.course_name ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.docs.course.model.Course"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.docs.course.model.Course"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Course toModel(CourseSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Course model = new CourseImpl();

		model.setCourseId(soapModel.getCourseId());
		model.setName(soapModel.getName());
		model.setDescription(soapModel.getDescription());
		model.setLecturer(soapModel.getLecturer());
		model.setDuration(soapModel.getDuration());
		model.setStatus(soapModel.getStatus());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Course> toModels(CourseSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Course> models = new ArrayList<Course>(soapModels.length);

		for (CourseSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.docs.course.model.Course"));

	public CourseModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _courseId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCourseId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _courseId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Course.class;
	}

	@Override
	public String getModelClassName() {
		return Course.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("courseId", getCourseId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("lecturer", getLecturer());
		attributes.put("duration", getDuration());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long courseId = (Long)attributes.get("courseId");

		if (courseId != null) {
			setCourseId(courseId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String lecturer = (String)attributes.get("lecturer");

		if (lecturer != null) {
			setLecturer(lecturer);
		}

		Integer duration = (Integer)attributes.get("duration");

		if (duration != null) {
			setDuration(duration);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@JSON
	@Override
	public long getCourseId() {
		return _courseId;
	}

	@Override
	public void setCourseId(long courseId) {
		_courseId = courseId;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@JSON
	@Override
	public String getLecturer() {
		if (_lecturer == null) {
			return StringPool.BLANK;
		}
		else {
			return _lecturer;
		}
	}

	@Override
	public void setLecturer(String lecturer) {
		_lecturer = lecturer;
	}

	@JSON
	@Override
	public int getDuration() {
		return _duration;
	}

	@Override
	public void setDuration(int duration) {
		_duration = duration;
	}

	@JSON
	@Override
	public boolean getStatus() {
		return _status;
	}

	@Override
	public boolean isStatus() {
		return _status;
	}

	@Override
	public void setStatus(boolean status) {
		_status = status;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Course.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Course toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Course)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CourseImpl courseImpl = new CourseImpl();

		courseImpl.setCourseId(getCourseId());
		courseImpl.setName(getName());
		courseImpl.setDescription(getDescription());
		courseImpl.setLecturer(getLecturer());
		courseImpl.setDuration(getDuration());
		courseImpl.setStatus(getStatus());

		courseImpl.resetOriginalValues();

		return courseImpl;
	}

	@Override
	public int compareTo(Course course) {
		int value = 0;

		value = getName().compareTo(course.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Course)) {
			return false;
		}

		Course course = (Course)obj;

		long primaryKey = course.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Course> toCacheModel() {
		CourseCacheModel courseCacheModel = new CourseCacheModel();

		courseCacheModel.courseId = getCourseId();

		courseCacheModel.name = getName();

		String name = courseCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			courseCacheModel.name = null;
		}

		courseCacheModel.description = getDescription();

		String description = courseCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			courseCacheModel.description = null;
		}

		courseCacheModel.lecturer = getLecturer();

		String lecturer = courseCacheModel.lecturer;

		if ((lecturer != null) && (lecturer.length() == 0)) {
			courseCacheModel.lecturer = null;
		}

		courseCacheModel.duration = getDuration();

		courseCacheModel.status = getStatus();

		return courseCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{courseId=");
		sb.append(getCourseId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", lecturer=");
		sb.append(getLecturer());
		sb.append(", duration=");
		sb.append(getDuration());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.liferay.docs.course.model.Course");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>courseId</column-name><column-value><![CDATA[");
		sb.append(getCourseId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lecturer</column-name><column-value><![CDATA[");
		sb.append(getLecturer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>duration</column-name><column-value><![CDATA[");
		sb.append(getDuration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Course.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Course.class };
	private long _courseId;
	private String _name;
	private String _description;
	private String _lecturer;
	private int _duration;
	private boolean _status;
	private Course _escapedModel;
}