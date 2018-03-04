package com.swidy.dp.filter;

public class SensitiveFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response, FilterChain filterChain) {
		request.setRequestStr(request.getRequestStr().replace("翻墙", "推墙") + "--SensitiveFilter()");
		filterChain.doFilter(request, response, filterChain);
		response.setResponseStr(response.getResponseStr() + "--SensitiveFilter()");
	}
	
}
