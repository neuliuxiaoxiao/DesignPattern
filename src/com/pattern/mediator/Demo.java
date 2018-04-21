package com.pattern.mediator;

public class Demo {

	public static void main(String[] args) {
		Mediator1 mediator1 = new Mediator1();
		Colleague1 c1 = new Colleague1(mediator1);
		Colleague2 c2 = new Colleague2(mediator1);
		mediator1.createC1(c1);
		mediator1.createC2(c2);
		c1.send("吃饭了吗");
		c2.send("没");
	}
	
}
