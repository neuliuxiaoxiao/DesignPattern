package com.pattern.flyweight;

public class Website1 implements Website{

	private String name;
	public Website1(String name){
		this.name=name;
	}
	
	@Override
	public void Use(User user) {
		System.out.println("网站分类"+name+"用户="+user.getName());
	}

}
