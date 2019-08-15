package com.liferay.docs.course.service.persistence;

import java.util.List;

import com.liferay.docs.course.model.Course;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class CourseFinderImpl extends BasePersistenceImpl<Course> implements CourseFinder {

	public List<Object> getCoursesWithTotalRegistration() throws Exception {
		Session session = null;
			session = openSession();
			String sql = CustomSQLUtil.get(GET_COURSE_WITH_TOTAL_REGISTRAION);
			SQLQuery query = session.createSQLQuery(sql);

			query.setCacheable(false);
			query.addScalar("course_id", Type.LONG);
			query.addScalar("course_name", Type.STRING);
			query.addScalar("course_lecturer", Type.STRING);
			query.addScalar("total_registration", Type.INTEGER);
			QueryPos qPos = QueryPos.getInstance(query);
			return (List<Object>) query.list();
	}

	public static final String GET_COURSE_WITH_TOTAL_REGISTRAION = CourseFinder.class
			.getName() + ".getCoursesWithTotalRegistration";
}
