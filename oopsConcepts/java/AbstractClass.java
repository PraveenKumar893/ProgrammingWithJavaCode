package com.oopsConcepts.java;


abstract class absass {
	
	 abstract void run();
	 void sdds () {
		 System.out.println("dsds");
	 }
	
}

abstract class anonmyus {
	
	abstract void showSpeed();
}


class sdsda extends absass {

	void run() {
		
		System.out.println(" Running 100 Km/hr");
		
	}
	
	
}

public class AbstractClass {
		

	public static void main(String[] args) {
		
		sdsda nm = new sdsda();
		nm.run();
		nm.sdds();
		
		anonmyus jk = new anonmyus() {
			
			void showSpeed() {
				 System.out.println( " Speed is calculating........");
			}
		};
		
		jk.showSpeed();

	}

}
