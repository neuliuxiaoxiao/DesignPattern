package com.pattern.adapter;

public class Forwards extends Player{

	public Forwards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("Forwards 进攻");
	}

	@Override
	public void defense() {
		System.out.println("Forwards 防守");
	}

}
