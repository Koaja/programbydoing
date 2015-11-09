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
		int numberOfKeyschains = 0;
		final int PRICE_PER_KEYCHAIN = 10;
		boolean loop = true;

		System.out.println("Ye olde Keychain Shoppe\n");

		while (loop) {
			System.out.println(
					"1. Add Keychains to order\n2. Remove Keychains from Order\n3. View Current Order\n4. Checkout\n");
			System.out.print("Please enter your choice: ");
			userChoice = input.nextInt();
			System.out.println();
			if (userChoice == 1) {
				numberOfKeyschains = add_keychains(numberOfKeyschains);
			} else if (userChoice == 2) {
				numberOfKeyschains = remove_keychains(numberOfKeyschains);
			} else if (userChoice == 3) {
				view_order(numberOfKeyschains, PRICE_PER_KEYCHAIN);
			} else if (userChoice == 4) {
				checkout(numberOfKeyschains, PRICE_PER_KEYCHAIN);
				break;
			}
		}
	}

	public static int add_keychains(int numberOfKeychains) {
		Scanner input = new Scanner(System.in);
		int addedKeys = numberOfKeychains;
		int keys;

		System.out.println("You have " + addedKeys + " keychains. How many to add? ");
		keys = input.nextInt();
		addedKeys += keys;
		System.out.println("You now have " + addedKeys + " keychains\n");
		return addedKeys;
	}

	public static int remove_keychains(int numberOfKeyschains) {
		Scanner input = new Scanner(System.in);
		int removedKeys = numberOfKeyschains;
		int keys;

		System.out.println("You have " + removedKeys + " keychains. How many keys to remove? ");
		keys = input.nextInt();
		removedKeys -= keys;
		System.out.println("You now have " + removedKeys + " keychains\n");
		return removedKeys;
	}

	public static void view_order(int currentNumberOfKeyschains, int keychainPrice) {
		System.out.println("You currently have " + currentNumberOfKeyschains + " keychains.");
		System.out.println("Keychains cost $" + keychainPrice + " each");
		double orderTotal = currentNumberOfKeyschains * keychainPrice;
		System.out.println("Total cost is $" + orderTotal);
	}

	public static void checkout(int currentNumberOfKeyschains, int keychainPrice) {
		Scanner input = new Scanner(System.in);

		System.out.println("What is your name ? ");
		String userName = input.nextLine();
		view_order(currentNumberOfKeyschains, keychainPrice);
		System.out.println("Thank you for your order " + userName);
	}
}
