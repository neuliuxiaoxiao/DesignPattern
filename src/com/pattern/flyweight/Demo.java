package com.pattern.flyweight;

public class Demo {

	public static void main(String[] args) {
		
		WebsiteFactory w = new WebsiteFactory();
		
		Website b1 = w.getWebsite("产品展示");
		b1.Use(new User("小菜"));
		
		Website b2 = w.getWebsite("产品展示");
		b2.Use(new User("小菜1"));
		
		Website b3 = w.getWebsite("产品展示");
		b3.Use(new User("小菜2"));
		
		Website b4 = w.getWebsite("博客");
		b4.Use(new User("小菜1"));
		
		System.out.println(w.getCount());
	}
}
