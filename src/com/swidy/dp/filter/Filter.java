package com.swidy.dp.filter;

public interface Filter {
	void doFilter(Request request, Response response, FilterChain filterChain);
}
