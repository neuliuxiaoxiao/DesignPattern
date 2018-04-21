package com.pattern.template;

public class Demo {

	public static void main(String[] args) {
		Game gameA = new Cricket();
		gameA.play();
		
		Game gameB = new Football();
		gameB.play();
	}
	
}
