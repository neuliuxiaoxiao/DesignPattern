package com.pattern.builder;

public class Demo {

	public static void main(String[] args) {
		Director director = new Director();
		Builder1 build1 = new Builder1();
		Builder2 build2 = new Builder2();
		director.show(build1);
		Product p1 = build1.show();
		p1.show();
		
		director.show(build2);
		Product p2 = build2.show();
		p2.show();
	}
}
