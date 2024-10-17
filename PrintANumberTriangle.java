package com.java;

public class PrintANumberTriangle {
     
	private int number;
	
	public PrintANumberTriangle(int number) {
		this.number = number;
	}
	
	
	public static void main(String [] args) {
		PrintANumberTriangle printTriangle = new PrintANumberTriangle(5);
		printTriangle.printNumbertTriangle();
		
	}
	
	public void printNumbertTriangle() {
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5 
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
}


