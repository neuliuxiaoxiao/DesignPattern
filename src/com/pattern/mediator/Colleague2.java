package com.pattern.mediator;

public class Colleague2 extends Colleague{

	public Colleague2(Mediator mediator) {
		super(mediator);
	}

	public void send(String message){
		mediator.send(message, this);
	}
	
	public void back(String message){
		System.out.println("Colleague2 ="+message);
	}
}
