package com.liferay.docs.course.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.portlet.PortletURL;

import com.liferay.docs.course.model.Course;
import com.liferay.docs.course.service.CourseLocalServiceUtil;
import com.liferay.docs.course.service.permission.CoursePermission;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Group;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.service.GroupLocalServiceUtil;

public class CourseIndexer extends BaseIndexer {

	public static final String[] CLASS_NAME = { Course.class.getName() };
	public static final String PORTLET_ID = "course-portlet";

	public CourseIndexer() {
		setPermissionAware(true);
	}

	@Override
	public String[] getClassNames() {
		return CLASS_NAME;
	}

	@Override
	public String getPortletId() {
		return PORTLET_ID;
	}

	@Override
	public boolean hasPermission(PermissionChecker permissionChecker, String courseClassName, long courseClassPK, String actionId) throws Exception {
		return CoursePermission.contains(permissionChecker, courseClassPK,
				ActionKeys.VIEW);
	}

	@Override
	public void postProcessSearchQuery(BooleanQuery searchQuery, SearchContext searchContext) throws Exception {
		String name = (String) searchContext.getAttribute("name");
		if (Validator.isNotNull(name)) {
			if (searchContext.isAndSearch()) {
				searchQuery.addRequiredTerm("courseName", name);
			} else {
				searchQuery.addTerm("courseName", name);
			}
		}

		String lecturer = (String) searchContext.getAttribute("lecturer");
		if (Validator.isNotNull(lecturer)) {
			if (searchContext.isAndSearch()) {
				searchQuery.addRequiredTerm("lecturer", lecturer);
			} else {
				searchQuery.addTerm("lecturer", lecturer);
			}
		}

		String status = (String) searchContext.getAttribute("status");
		if (Validator.isNotNull(status)) {
			if (searchContext.isAndSearch()) {
				searchQuery.addRequiredTerm("courseStatus", status);
			} else {
				searchQuery.addTerm("courseStatus", status);
			}
		}
	}

	@Override
	protected void doDelete(Object obj) throws Exception {
		Course course = (Course) obj;
		Group group = GroupLocalServiceUtil.getGroup(course.getGroupId());
		deleteDocument(group.getCompanyId(), course.getCourseId());
	}

	@Override
	protected Document doGetDocument(Object obj) throws Exception {
		Course course = (Course) obj;
		Document document = getBaseModelDocument(PORTLET_ID, course);

		document.addText("courseName", course.getName());
		document.addText("description", course.getDescription());
		document.addText("lecturer", course.getLecturer());
		document.addNumber("duration", course.getDuration());
		document.addText("courseStatus", Boolean.toString(course.getStatus()));
		document.addKeyword(Field.GROUP_ID, getSiteGroupId(course.getGroupId()));
		document.addKeyword(Field.SCOPE_GROUP_ID, course.getGroupId());

		return document;
	}

	@Override
	protected Summary doGetSummary(Document document, Locale locale, String snippet, PortletURL protletURL) throws Exception {
		Summary summary = createSummary(document);
		summary.setMaxContentLength(200);
		return summary;
	}

	@Override
	protected void doReindex(Object obj) throws Exception {

		Course course = (Course) obj;

		Document document = getDocument(course);

		SearchEngineUtil.updateDocument(getSearchEngineId(),
				GroupLocalServiceUtil.getGroup(course.getGroupId())
						.getCompanyId(), document, true);
	}

	@Override
	protected void doReindex(String className, long classPK) throws Exception {

		Course course = CourseLocalServiceUtil.getCourse(classPK);

		doReindex(course);
	}

	@Override
	protected void doReindex(String[] ids) throws Exception {

		long companyId = GetterUtil.getLong(ids[0]);

		reindexEntries(companyId);
	}

	@Override
	protected String getPortletId(SearchContext searchContext) {

		return PORTLET_ID;
	}

	protected void reindexEntries(long companyId) throws PortalException, SystemException {

		int courseCount = CourseLocalServiceUtil.getCoursesCount();

		int start = 0;
		int step = 50;
		int end = start + step;
		int page = courseCount / step;
		for (int i = 0; i <= page; i++) {

			List<Course> courses = CourseLocalServiceUtil
					.getCourses(start, end);
			List<Document> documents = new ArrayList();
			for (Course course : courses) {

				documents.add(getDocument(course));
			}
			SearchEngineUtil.updateDocuments(getSearchEngineId(), companyId,
					documents, true);
			start = end;
			end = start + step;
		}
	}

}