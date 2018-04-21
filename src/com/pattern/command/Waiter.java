package com.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

	private List<Command> list = new ArrayList<Command>();
	public void setCommand(Command command ){
		list.add(command);
	}
	public void tongzhi(){
		for(Command command :list){
			command.command();
		}
	}
}
