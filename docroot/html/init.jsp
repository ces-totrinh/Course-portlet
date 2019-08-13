<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>

<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.service.ServiceContext" %>
<%@page import="com.liferay.portal.service.ServiceContextFactory" %>

<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.security.permission.ActionKeys" %>

<%@page import="com.liferay.docs.course.model.Course"%>
<%@page import="com.liferay.docs.course.service.CourseLocalServiceUtil"%>

<%@page import="com.liferay.docs.course.model.Registration"%>
<%@page import="com.liferay.docs.course.service.RegistrationLocalServiceUtil"%>

<%@page import="com.liferay.portal.service.UserLocalServiceUtil" %>

<%@page import="java.util.List"%>
<portlet:defineObjects />
<liferay-theme:defineObjects />