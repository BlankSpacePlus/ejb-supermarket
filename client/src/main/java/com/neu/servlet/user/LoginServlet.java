package com.neu.servlet.user;

import com.neu.pojo.User;
import com.neu.service.user.UserService;
import com.neu.tools.Constants;
import com.neu.tools.GetEJBService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author BlankSpace
 */
public class LoginServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("login ============ " );
		// 获取用户名和密码
		String userCode = request.getParameter("userCode");
		String userPassword = request.getParameter("userPassword");
		// 调用service方法，进行用户匹配
		UserService userService = (UserService) GetEJBService.getService("user");
		User user = userService.login(userCode,userPassword);
		// 登录成功
		if (null != user) {
			// 放入session
			request.getSession().setAttribute(Constants.USER_SESSION, user);
			// 页面跳转（frame.jsp）
			response.sendRedirect(request.getContextPath()+"/jsp/frame.jsp");
		} else {
			// 页面跳转（login.jsp）带出提示信息--转发
			request.setAttribute("error", "用户名或密码不正确");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
