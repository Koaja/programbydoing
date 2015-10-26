package methods;

import java.util.Scanner;

/*
 * Your program should present a menu for the human to choose which shape to calculate, then ask them for the appropriate values (length, width, radius, etc.). 
 * Then it should pass those values to the appropriate function and display the resulting area.

	Notice that you must not input the values inside the functions, and you must not display the values inside the functions. 
	All input and output must be in the  main(), and values must be passed to the functions and returned from them.
 */

public class AreaCalculator {

	public static double area_circle(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}

	public static int area_rectangle(int length, int width) {
		return length * width;
	}

	public static int area_square(int side) {
		return side * 2;
	}

	public static double area_triangle(int base, int height) {
		return (base * height) / 2;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int chosenShape;
		double radius;
		int length;
		int width;
		int side;
		int height;
		int base;

		System.out.println("1) Triangle\n2) Rectengle\n3) Square\n4) Circle\n5) Quit");

		System.out.print("Which Shape: ");
		chosenShape = input.nextInt();

		switch (chosenShape) {
		case 1:
			System.out.print("Radius :");
			radius = input.nextInt();
			System.out.println("The area is :" + area_circle(radius));
			break;
		case 2:
			System.out.print("Length : ");
			length = input.nextInt();
			System.out.print("Width : ");
			width = input.nextInt();
			System.out.println("The area is :" + area_rectangle(length, width));
			break;
		case 3:
			System.out.print("Side : ");
			side = input.nextInt();
			System.out.println("The area is :" + area_square(side));
			break;
		case 4:
			System.out.print("Base : ");
			base = input.nextInt();
			System.out.print("Height : ");
			height = input.nextInt();
			System.out.println("The area is :" + area_triangle(base, height));
			break;
		case 5:
			System.out.print("GoodBye");
			break;
		default:
			System.out.println("Not a valid option");
		}

	}
}
