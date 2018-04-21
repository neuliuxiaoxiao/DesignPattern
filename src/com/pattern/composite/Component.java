package com.pattern.composite;

public abstract class Component {

	protected String name;
	public Component(String name){
		this.name=name;
	}
	abstract void add(Component e);
	abstract void delete(Component e);
	abstract void show(Component e);
}
