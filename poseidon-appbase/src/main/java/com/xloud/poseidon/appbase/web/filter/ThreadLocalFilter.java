package com.xloud.poseidon.appbase.web.filter;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.stereotype.Component;

import com.xloud.poseidon.core.utils.FwDateUtils;

@Component
public class ThreadLocalFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		FwDateUtils.setThreadDateTime(new Date());
		chain.doFilter(request, response);
	}

}
