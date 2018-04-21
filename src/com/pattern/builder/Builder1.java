package com.pattern.builder;

public class Builder1 extends Builder{

	private Product product = new Product();
	@Override
	public void buildA() {
		product.add("1-1");
	}

	@Override
	public void buildB() {
		product.add("1-2");
	}

	@Override
	public Product show() {
		return product;
	}

}
