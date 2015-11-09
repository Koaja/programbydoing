package methods;

import java.util.Scanner;

/*
 * Write a program that pulls up a menu with 4 options.
 * 
 * You will need to create functions for each of the 4 menu options. Entering the number will call the correct function.
	1. This assignment does not require you to complete ANY of the functionality except for the working menu system. 
	There is no need for you to program the ability to add keychains, remove keychains, view orders or checkout.
    2. The functions should be named add_keychains(), remove_keychains(), view_order() and checkout().
    3. Each function should print a message that it has been called.
    4. The user should be able to keep putting in choices until the checkout() function is called. When checkout() is finished, the program should end.
 */

public class KeyChainsForSale {

	public static void add_keychains() {
		System.out.println("ADD KEYCHAINS\n");
	}

	public static void remove_keychains() {
		System.out.println("REMOVE KEYCHAINS\n");
	}

	public static void view_order() {
		System.out.println("VIEW ORDER\n");
	}

	public static void checkout() {
		System.out.println("CHECKOUT\n");
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int userChoice = 0;
		boolean loop = true;
		System.out.println("Ye olde Keychain Shoppe\n");

		while (loop) {
			System.out.println(
					"1. Add Keychains to order\n2. Remove Keychains from Order\n3. View Current Order\n4. Checkout\n");
			System.out.print("Please enter your choice: ");
			userChoice = input.nextInt();
			System.out.println();
			if (userChoice == 1) {
				add_keychains();
			} else if (userChoice == 2) {
				remove_keychains();
			} else if (userChoice == 3) {
				view_order();
			} else if (userChoice == 4) {
				checkout();
				break;
			}
		}

	}
}
