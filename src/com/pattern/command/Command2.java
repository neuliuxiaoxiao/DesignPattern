package com.pattern.command;

public class Command2 extends Command{

	public Command2(Baker baker) {
		super(baker);
	}

	@Override
	public void command() {
		baker.run2();
	}

	
}
