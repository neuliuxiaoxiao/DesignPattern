package com.pattern.command;

public class Demo {

	public static void main(String[] args) {
		Baker baker = new Baker();
		Waiter w = new Waiter();
		
		w.setCommand(new Command1(baker));
		w.setCommand(new Command2(baker));
		w.tongzhi();
	}
}
