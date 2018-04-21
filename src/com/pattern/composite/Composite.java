package com.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{

	List<Component> list = new ArrayList<Component>();
	public Composite(String name) {
		super(name);
	}

	@Override
	void add(Component e) {
		list.add(e);
	}

	@Override
	void delete(Component e) {
		list.remove(e);
	}

	@Override
	void show(Component e) {
		System.out.println("conposite ="+e.name);
		for(Component c :list){
			c.show(c);
		}
	}

}
