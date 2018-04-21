package com.pattern.bridge;

public class Phone2 implements Phone{

	private Soft soft;

	public Phone2(Soft soft){
		this.soft=soft;
	}
	
	@Override
	public void run() {
		soft.run();
	}
	
	
}
