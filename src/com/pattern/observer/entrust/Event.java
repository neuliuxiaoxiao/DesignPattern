package com.pattern.observer.entrust;

import java.lang.reflect.Method;

public class Event {
	 private Object object;
	    private String methodName;
	    private Object [] params;
	    private Class [] paramTypes;
	    public Event(Object object,String methodName,Object...objects ){
	        this.object=object;
	        this.methodName=methodName;
	        this.params=objects;
	        contractParamTypes(this.params);
	    }
	    
	    private void contractParamTypes(Object [] params){
	        if(params==null){
	            return;
	        }
	        paramTypes=new Class[params.length];
	        for(int i=0;i<params.length;i++){
	            paramTypes[i]=params[i].getClass();
	        }
	    }
	    public void invoke() throws Exception{
	        Method method =object.getClass().getMethod(methodName, paramTypes);
	        if(method==null){
	            
	        }else{
	            method.invoke(object, params);
	        }
	    }

}
