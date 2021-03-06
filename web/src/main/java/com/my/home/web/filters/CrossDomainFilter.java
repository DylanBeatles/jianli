package com.my.home.web.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class CrossDomainFilter implements Filter {
	public static String ACAO = "Access-Control-Allow-Origin";
	public static String ACAH = "Access-Control-Allow-Headers";
	public static String ACAM = "Access-Control-Allow-Methods";
	public static String ACMG = "Access-Control-Max-Age";
	public static String CC = "Cache-Control";
	public static String ACAC = "Access-Control-Allow-Credentials";
	public static String CONF_VERSION = "X-ConfVer";

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		HttpServletResponse httpResponse = (HttpServletResponse) resp;

		System.out.println("*******************************************");

		httpResponse.setHeader(ACAO, "*");
		httpResponse.setHeader(ACAM, "POST, GET, PUT, DELETE");
		httpResponse.setHeader(ACAH, "*");
		httpResponse.setHeader(ACMG, "0");
		httpResponse.setHeader(CC, "no-cache");
		httpResponse.setHeader(ACAC, "true");

		chain.doFilter(req, resp);

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
