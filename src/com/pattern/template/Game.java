package com.pattern.template;

public abstract class Game {

	abstract void start();
	abstract void init();
	abstract void end();
	
	public final void play(){
		init();
		start();
		end();
	}
}
