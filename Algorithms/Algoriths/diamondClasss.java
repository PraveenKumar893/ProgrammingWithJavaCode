package com.Algorithms.Algoriths;

public class diamondClasss implements diamondProblemone , diamondproblemtwo {

	
	private String name;
	
	public diamondClasss(String name) {
		this.name = name;
	}


	static void print() {
		
		System.out.println(" Print Method is Called  ");
	}
	
	
	void printing() {
		
		System.out.println(" Printing method is CCallled ");
	}
	
	public static void main(String[] args) {
		
	//	new diamondClasss().display();
	//	new diamondClasss().diaplassa();
		
		diamondClasss diamond1 = new diamondClasss("Praveen");
		diamondClasss diamond2 = new diamondClasss("Praveen");
		
		if(diamond1.equals(diamond2)) {
			System.out.println(" Trueee " + diamond1.hashCode() + "  " + " " + diamond2.hashCode());
		} else {
			System.out.println(diamond1.hashCode() + "  " + " " + diamond2.hashCode());
		}
		
		diamondClasss diamond = null;
	//		diamond.printing();
		diamond.print();
	}

	@Override
	public void display() {
		diamondproblemtwo.super.display();
	}
}
