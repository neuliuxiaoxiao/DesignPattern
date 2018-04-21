package com.pattern.memento;

public class Demo {

	public static void main(String[] args) {
		
		CareTaker c = new CareTaker();
		Originator o = new Originator();
		o.setAge(12);
		o.setName("1");
		o.setSex("1");
		
		c.addMemento(o.createMemento());
		
		
		o.setAge(11);
		c.addMemento(o.createMemento());
		
		o.getMemento(c.getMemento(0));
		System.out.println(o.getAge());
		
		
	}
}
