package com.valerysamovich.java.basic.statements.examplewhile;

public class ExampleWhile {

	public static void main(String[] args) {

		int x = -10;
		
		while(x <= 0){
			System.out.println("x = " + x);
			// x++;
			// x = x + 1;
			// x += 1;
			x += 2;
		}

	}

}