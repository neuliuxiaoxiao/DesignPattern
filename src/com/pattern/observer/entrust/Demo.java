package com.pattern.observer.entrust;

public class Demo {
	public static void main(String[] args) {
		Notifier notifier=new GoodNofitier();
		DeleObserverA doa=new DeleObserverA();
		DeleObserverB dob=new DeleObserverB();
		      notifier.addListener(doa, "doaUpdate", new Object[]{123,"spring"});
		     notifier.addListener(dob, "dobUpdate", new Object[]{456,"summer"});

		notifier.notifyx();
	}
	
}
