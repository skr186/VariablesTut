package com.smtech;

public class AnimalDetail {

	public static String Kingdom = "Animal";	//Static/Class Variable
	public static String Location = "Africa";
	public int leg;
	public int  eye;
	public int tail;
	
	
	public AnimalDetail(int walk, int look, int wag) {
		this.leg = walk;
		this.eye = look;
		this.tail = wag;
	}
}
