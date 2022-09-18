package headfirst.simple;

import headfirst.simple.observer.SimpleObserver;
import headfirst.simple.subject.SimpleSubject;

public class Example {

	public static void main(String[] args) {
		SimpleSubject simpleSubject = new SimpleSubject();
	
		SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);
		SimpleObserver simpleObserver1 = new SimpleObserver(simpleSubject);
		
		simpleSubject.setValue(80);
		
		simpleSubject.removeObserver(simpleObserver);
	}
}
