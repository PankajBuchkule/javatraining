package a_package;

import java.util.Scanner;

public class input {

	public static void main(String[] args) 
	{
		int i;
		i = 10;
		Scanner keyboard; // class file provided by 
		//System.out.println(keyboard);
		keyboard = new Scanner (System.in); // Creating object java
		int age;
		String height;
		double weight;
		System.out.println("How old are you");
		age = keyboard.nextInt(); // age = keyboard.topUppercase();
		System.out.println("How toll are you");
		height = keyboard.next();
		System.out.println("How much do you weight");
		weight = keyboard.nextDouble();
		System.out.println("How much do you");
		System.out.println("So you are " + age + " old, " + height +" tall and " + weight + " heavy : ");
		keyboard.close();	
	}

}
