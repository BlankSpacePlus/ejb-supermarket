package com.neu.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 设置字符编码的过滤器
 * @author BlankSpace
 */
public class CharacterEncodingFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
	}

}
