package com.pattern.adapter;

public class Center extends Player{

	public Center(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("Center 进攻");
	}

	@Override
	public void defense() {
		System.out.println("Center 防守");
	}

}
