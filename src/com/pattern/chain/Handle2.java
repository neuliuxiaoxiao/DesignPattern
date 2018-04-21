package com.pattern.chain;

public class Handle2 extends Handle {

	@Override
	public void doRequest(Request req) {
		if(req.getNum()<20&&req.getNum()>10){
			System.out.println("Handle2 处理请求");
		}else if(handle != null){
			handle.doRequest(req);
		}
	}

}
