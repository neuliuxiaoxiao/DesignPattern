package com.pattern.flyweight;

import java.util.Hashtable;

public class WebsiteFactory {

	private Hashtable flyweights = new Hashtable();
	
	public Website getWebsite(String key){
		
		if(!flyweights.containsKey(key)){
			flyweights.put(key, new Website1(key));
		}
		return (Website) flyweights.get(key);
	}
	public int getCount(){
		return flyweights.size();
	}
}
