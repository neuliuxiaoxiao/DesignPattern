package com.pattern.bridge;

public class Demo {

	public static void main(String[] args) {
		Phone p1 = new Phone1(new Soft2());
		p1.run();
		
		Phone p2 = new Phone2(new Soft1());
		p2.run();
	}

}
