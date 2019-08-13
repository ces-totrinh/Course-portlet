package com.liferay.custom.action;

import java.util.List;

import com.liferay.portal.kernel.events.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.struts.LastPath;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.util.PortalUtil;

public class MyCustomLoginAction extends Action {
	/* (non-Java-doc)
	 * @see com.liferay.portal.kernel.events.Action#Action()
	 */
	public MyCustomLoginAction() {
		super();
	}

	/* (non-Java-doc)
	 * @see com.liferay.portal.kernel.events.Action#run(HttpServletRequest arg0, HttpServletResponse arg1)
	 */
	public void run(HttpServletRequest request, HttpServletResponse response) throws ActionException {
		try {
			User user = PortalUtil.getUser(request);
			if (_isStaffRoleExisting(user.getRoles())) {
				LastPath privatelastPath = new LastPath(StringPool.BLANK, "/group/course/home");
				HttpSession session = request.getSession();
				session.setAttribute(WebKeys.LAST_PATH, privatelastPath);
			} else {
				LastPath privatelastPath = new LastPath(StringPool.BLANK, "/group/register/home");
				HttpSession session = request.getSession();
				session.setAttribute(WebKeys.LAST_PATH, privatelastPath);
			}
		} catch (Exception e) {
			System.out.print(e);
		}
	}

	private boolean _isStaffRoleExisting(List<Role> roles) {
		boolean result = false;
		for (Role role : roles) {
			if (role.getName().equals("Staff")) {
				result = true;
			}
		}
		return result;
	}
}