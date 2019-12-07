package com.aowin.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import com.aowin.model.Syuser;

public class MsphaseInteceptor implements HandlerInterceptor{
	/**
	 * 预处理程序 调用controller方法之前
	 * 返回false 不继续执行
	 * 返回true 继续执行
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Syuser user = (Syuser)request.getSession().getAttribute("syuser");
		String url = request.getRequestURI();
		if(url.contains("/index")) {
			return true;
		}
		List<String> msPhases = user.getPhases();
		for(String msPhase:msPhases) {
			if(url.contains(msPhase)) {
				return true;
			}
		}
		return false;
	}
}
