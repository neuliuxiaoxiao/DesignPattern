package com.pattern.chain;

public class Handle1 extends Handle {

	@Override
	public void doRequest(Request req) {
		if(req.getNum()<10){
			System.out.println("Handle1 处理请求");
		}else if(handle != null){
			handle.doRequest(req);
		}
	}

}
