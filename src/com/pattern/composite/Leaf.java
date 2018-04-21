package com.pattern.composite;

public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
	}

	@Override
	void add(Component e) {
		System.out.println("leaf add");
	}

	@Override
	void delete(Component e) {
	 System.out.println("leaf delete");	
	}

	@Override
	void show(Component e) {
		System.out.println("leaf show="+e.name);
	}

}
