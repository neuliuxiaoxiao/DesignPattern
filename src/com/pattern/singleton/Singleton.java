package com.pattern.singleton;

public class Singleton {
	private static Singleton instance;

	private Singleton() {
	}

	// public static synchronized Singleton getInstance() {
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
