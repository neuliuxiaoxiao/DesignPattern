package com.pattern.builder;

public class Director {

	public void show(Builder build){
		build.buildA();
		build.buildB();
	}
}
