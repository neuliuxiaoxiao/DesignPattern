package com.pattern.mediator;

public class Colleague1 extends Colleague{

	public Colleague1(Mediator mediator) {
		super(mediator);
	}

	public void send(String message){
		mediator.send(message, this);
	}
	
	public void back(String message){
		System.out.println("Colleague1 ="+message);
	}
}
