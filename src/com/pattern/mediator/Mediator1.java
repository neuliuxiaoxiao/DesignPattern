package com.pattern.mediator;


public class Mediator1 implements Mediator{

	private Colleague1 c1 ;
	private Colleague2 c2;
	
	public void createC1(Colleague1 c){
		this.c1=c;
	}
	public void createC2(Colleague2 c){
		this.c2=c;
	}
	@Override
	public void send(String message, Colleague colleague) {
		if(colleague==c1){
			c2.back(message);
		}else{
			c1.back(message);
		}
	}

}
