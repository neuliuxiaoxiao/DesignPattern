package com.pattern.adapter;

public class Demo {

	public static void main(String[] args) {
		
		Player p = new Forwards("麦德龙");
		p.attack();
		Player b = new Center("bob");
		b.attack();
		Player c = new Translator("要命");
		c.attack();
		c.defense();
	}
}
