package com.pattern.command;

public class Command1 extends Command{

	public Command1(Baker baker) {
		super(baker);
	}

	@Override
	public void command() {
		baker.run1();
	}

	
}
