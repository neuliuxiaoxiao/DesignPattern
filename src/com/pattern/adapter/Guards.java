package com.pattern.adapter;

public class Guards extends Player{

	public Guards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("Guards 进攻");
	}

	@Override
	public void defense() {
		System.out.println("Guards 防守");
	}

}
