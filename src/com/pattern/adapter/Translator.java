package com.pattern.adapter;

public class Translator extends Player {

	private AdapterPlayer pp = new AdapterPlayer();
	public Translator(String name) {
		super(name);
		pp.setName(name);
	}

	@Override
	public void attack() {
		pp.attack();
	}

	@Override
	public void defense() {
			pp.defense();
	}

}
