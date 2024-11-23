package com.Algorithms.Algoriths;


abstract class absrrsa {
	
	 void displayfields() {
		 System.out.println("Abstract Method Called");
	 }
}

class animal {
	
	static void stastic() {
		
		System.out.println(" Static Methods Values Called sss against Animal ");
	}
	
	void display() {
	
		System.out.println(" ANimals Method Called ");
	}
}

class hshsh extends animal {
	
	static void stastic() {
		
		System.out.println(" Static Methods Values Called sss against Dogss ");
	}

	
	void display() {
		
		System.out.println(" dogs Method Called ");
	}
	
}

public class stringmodifierclass {
	
	
	public static void main(String[] args) {
		
		StringBuilder str1 = new StringBuilder("Praveen");
		StringBuilder str2 = new StringBuilder("Praveen");
		
		if(str1.equals(str2)) {
			System.out.println(str1.hashCode() + " AND  " + str2.hashCode());
		} else {
			System.out.println(str1.hashCode() + "  " + str2.hashCode());
		}

		animal ani  =new hshsh();
		ani.display();
		animal.stastic();
				
	}

}
