package com.pattern.chain;

public class Demo {

	public static void main(String[] args) {
		
		Handle h1 = new Handle1();
		Handle h2 = new Handle2();
		h1.setSuccessor(h2);
		Request re = new Request();
		re.setNum(12);
		h1.doRequest(re);
	}
}
