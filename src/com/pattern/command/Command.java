package com.pattern.command;


public abstract class Command {

	protected Baker baker;
	
	public Command(Baker baker){
		this.baker=baker;
	}
	
	abstract void command();
}
