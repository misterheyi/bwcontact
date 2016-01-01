/**
 * @FileName: LoginFilter.java
 * @Author Huang.Yong
 * @Description:
 * @Date 2015年12月30日 下午2:53:25
 */
package com.bw.contact.web.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

/**
 * @Author Huang.Yong
 * @Description: 登陆拦截器
 * @Date 2015年12月30日 下午2:53:25
 * @Version 0.1
 */
public class LoginFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		filterChain.doFilter(request, response);
	}

}
