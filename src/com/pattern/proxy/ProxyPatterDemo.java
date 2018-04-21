package com.pattern.proxy;

public class ProxyPatterDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_image.jpg");
		image.display();
		System.out.println("");
		image.display();
	}
}
