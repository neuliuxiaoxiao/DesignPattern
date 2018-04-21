package com.pattern.builder;

public class Builder2 extends Builder{

	private Product product = new Product();
	@Override
	public void buildA() {
		product.add("2-1");
	}

	@Override
	public void buildB() {
		product.add("2-2");
	}

	@Override
	public Product show() {
		return product;
	}

}
