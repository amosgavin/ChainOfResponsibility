package com.swidy.dp.filter;

public class Main {

	public static void main(String[] args) {
		String msg = "大家好,<script>这是责任链设计模式</script>,敏感词汇有,翻墙,言论自由";
		Request request = new Request();
		request.setRequestStr(msg);
		Response response = new Response();
		response.setResponseStr("response");
		FilterChain filterChain = new FilterChain();
		
		filterChain.setFilter(new HTMLFilter()).setFilter(new SensitiveFilter());
		filterChain.doFilter(request, response, filterChain);
		System.out.println(request.getRequestStr());
		System.out.println(response.getResponseStr());
		
	}
	
}
