package com.pattern.singleton;

/**
 * 
 * <p>
 * Title:登记式/静态内部类
 * </p>
 * 
 * @author Administrator
 * @date 2018年2月26日
 */
public class Singleton3 {
	private static class SingletonHolder {
		private static final Singleton3 INSTANCE = new Singleton3();
	}

	private Singleton3() {
	}

	public static final Singleton3 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
