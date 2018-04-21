package com.pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

	List<String> parts = new ArrayList<String>();
	public void add(String part){
		parts.add(part);
	}
	public void show(){
		System.out.println("创建---");
		for(String s :parts){
			System.out.println(s);
		}
	}
}
