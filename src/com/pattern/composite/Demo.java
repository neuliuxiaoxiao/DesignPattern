package com.pattern.composite;

public class Demo {

	public static void main(String[] args) {
		Composite root = new Composite("root");
		root.add(new Leaf("leaf a"));
		root.add(new Leaf("leaf b"));
		
		Composite com1 = new Composite("composite x");
		com1.add(new Leaf("leaf xa"));
		com1.add(new Leaf("leaf xb"));
		
		Composite com2 = new Composite("composite xy");
		com2.add(new Leaf("leaf xa"));
		com2.add(new Leaf("leaf xb"));
		
		root.add(com1);
		com1.add(com2);
		root.show(com1);
		
		
	}
}
