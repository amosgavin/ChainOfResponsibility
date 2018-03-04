package com.swidy.dp.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

	List<Filter> filters = new ArrayList<Filter>();
	
	public FilterChain setFilter(Filter filter) {
		filters.add(filter);
		return this;
	}
	
	int index = 0;
	
	@Override
	public void doFilter(Request request, Response response, FilterChain filterChain) {
		if(index == filters.size()) return ;
		
		Filter f  = filters.get(index);
		index++;
		f.doFilter(request, response, filterChain);
	}

}
