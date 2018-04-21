package com.pattern.adapter;

public class AdapterPlayer {

	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AdapterPlayer(){
	}
	public void attack(){
		System.out.println("适配器进攻");
	}
	public void defense(){
		System.out.println("适配器防守");
	}
}
