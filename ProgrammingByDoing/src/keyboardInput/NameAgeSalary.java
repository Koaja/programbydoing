package keyboardInput;

import java.util.Scanner;

public class NameAgeSalary {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		double salary;
		
		System.out.println("Hello. What is your name");
		name = input.nextLine();
		
		System.out.println("Hi, " + name + "! How old are you?");
		age = input.nextInt();
		
		System.out.println("So you're " + age + ", eh? That's not old at all!");
		System.out.println("How much do you make, " + name + "?");
		salary = input.nextDouble();
		 
		System.out.println(salary + "! I hope that's per hour and not per year!");
	}

}
