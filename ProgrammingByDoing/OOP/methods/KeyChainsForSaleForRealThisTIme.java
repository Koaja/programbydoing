package methods;

import java.util.Scanner;

/*
 * You will need 2 new variables in main, one to store the current number of keychains, and one to store the price per keychain.
	1. The price should be $10 per keychain.
	2. add_keychains() will need to be passed one int, and have a return type of int. It will ask the user for the number of keychains to add to the order, and then return the new number of keychains.
	3. remove_keychains() will need to be passed one int, and have a return type of int. It will ask the user for the number of keychains to remove from the order, and then return the new number of keychains.
	4. view_order() will need to be passed two ints, and have a return type of void. It will display, on three different lines, the number of keychains in the order, the price per keychain, and the total cost of the order.
	5. checkout() will need to be passed two ints, and have a return type of void. It will ask the user for his/her name in order to deliver them correctly, display the order information, and then thank the user, by name, for ordering.

 */

public class KeyChainsForSaleForRealThisTIme {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int userChoice;
		int currentNumberOfKeyschains;
		int pricePerKeyChain = 10;
		boolean loop = true;
		System.out.println("Ye olde Keychain Shoppe\n");

		while (loop) {
			System.out.println(
					"1. Add Keychains to order\n2. Remove Keychains from Order\n3. View Current Order\n4. Checkout\n");
			System.out.print("Please enter your choice: ");
			userChoice = input.nextInt();
			System.out.println();
			if (userChoice == 1) {
			
				add_keychains(input.nextInt());
			} else if (userChoice == 2) {
				System.out.println("You have " + currentNumberOfKeyschains + " keychains. How many to remove?");
				remove_keychains();
			} else if (userChoice == 3) {
				view_order();
			} else if (userChoice == 4) {
				checkout();
				loop = false;
			}
		}

	}

	public static int add_keychains(int numberOfKeysToAdd) {
		currentNumberOfKeyschains = add_keychains(numberOfKeysToAdd);
		System.out.println("You have " + currentNumberOfKeyschains + " keychains. How many to add?");

		return numberOfKeysToAdd;
	}

	public static void remove_keychains(int numberOfKeysToRemove) {
		System.out.println();
	}

	public static void view_order() {
		System.out.println("VIEW ORDER\n");
	}

	public static void checkout() {
		System.out.println("CHECKOUT\n");
	}

}
