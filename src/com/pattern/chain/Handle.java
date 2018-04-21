package com.pattern.chain;

public abstract class Handle {

	protected Handle handle;
	public void setSuccessor(Handle handle){
		this.handle=handle;
	}
	public abstract void doRequest(Request req);
}
