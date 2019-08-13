package com.liferay.docs.course.service.persistence;

import com.liferay.docs.course.model.Registration;
import com.liferay.docs.course.model.impl.CourseImpl;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class RegistrationFinderImpl extends BasePersistenceImpl<Registration> implements RegistrationFinder {
	
	public void updateRegistrationsWithRejectedStatus(long courseId)
			throws SystemException {
		
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(UPDATE_REGISTRAION_WITH_REJECTED_STATUS);
			System.out.print(sql);
			SQLQuery query = session.createSQLQuery(sql);
			query.setCacheable(false);
			query.addEntity("Course", CourseImpl.class);
			QueryPos qPos = QueryPos.getInstance(query);
			qPos.add(courseId);
			query.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static final String UPDATE_REGISTRAION_WITH_REJECTED_STATUS = RegistrationFinder.class
			.getName() + ".updateRegistrationsWithRejectedStatus";
}