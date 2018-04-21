package com.pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	private List<Memento> list = new ArrayList<Memento>();;
	
	public void addMemento(Memento m){
		list.add(m);
	}
	public Memento getMemento(int index){
		return list.get(index);
	}
	
}
