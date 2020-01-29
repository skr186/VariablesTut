package com.smtech;

public class Animal {
	
	public int speed = 80;	//Instance Variable
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.run();
		
	}
	
	public void run()
	{
		
		System.out.println("going to merge in master branch.");
		
		String name= "Leopard"; //Local Variable
		AnimalDetail ad = new AnimalDetail(4,2,1); //From Parameterized Constructor in class AnimalDetail
		
		System.out.println("Kingdom: " + AnimalDetail.Kingdom + " --> [Static/Class Variable]");
		System.out.println("Name: " + name + " --> [Local Variable]");
		System.out.println("Running Speed: " + speed + " Km/h --> [Instance Variable]");
		
		System.out.println("==========================================================");
		
		System.out.println("No. of Legs : " + ad.leg + " ---|");
		System.out.println("No. of Eyes : " + ad.eye + " ---|---> [From Parameterized Constructor]");
		System.out.println("No. of Tails: " + ad.tail+" ---|");
		
		System.out.println("==========================================================");

		System.out.println("Current Location: " + AnimalDetail.Location + " ---> [Static variable/ Only one value in whole program]");
		System.out.println("Current Location: " + ad.Location + " ---> [Static variable/ Only one value in whole program]");
		
		System.out.println("==========================================================");
		
//		String name1= "Tiger"; //Local Variable
//		AnimalDetail ad1 = new AnimalDetail(4,2,1); //From Parameterized Constructor in class AnimalDetail
//		speed = 60;
//		AnimalDetail.Location = "Rainforest";
//		
//		System.out.println("Kingdom: " + AnimalDetail.Kingdom + " --> [Static/Class Variable]");
//		System.out.println("Name: " + name1 + " --> [Local Variable]");
//		System.out.println("Running Speed: " + speed + " Km/h --> [Instance Variable]");
//		
//		System.out.println("==========================================================");
//		
//		System.out.println("No. of Legs : " + ad1.leg + " ---|");
//		System.out.println("No. of Eyes : " + ad1.eye + " ---|---> [From Parameterized Constructor]");
//		System.out.println("No. of Tails: " + ad1.tail+" ---|");
//		
//		System.out.println("==========================================================");
//
//		System.out.println("Current Location: " + AnimalDetail.Location + " ---> [Static variable/ Only one value in whole program]");
//		System.out.println("Current Location: " + ad1.Location + " ---> [Static variable/ Only one value in whole program]");
	}
}
