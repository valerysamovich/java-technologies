package org.samovich.technologies.basics.concepts.classes.superex.box;

public class SubBox extends Box {
	
	// Super keyword is used to access super class data and methods
	public void calculateVolume(int length, int width, int height){
		double volume = super.calculateArea(length, width) * height;
		System.out.println("Volume = " + volume);
	}
}
