package com.pattern.bridge;

public class Phone1 implements Phone{

	private Soft soft;

	public Phone1(Soft soft){
		this.soft=soft;
	}
	
	@Override
	public void run() {
		soft.run();
	}
	
	
}
