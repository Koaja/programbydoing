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
		int currentNumberOfKeyschains = 0;
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
				System.out.println("You have " + currentNumberOfKeyschains + " keychains. How many to add? ");
				int keysToAdd = input.nextInt();
				currentNumberOfKeyschains = currentNumberOfKeyschains + add_keychains(keysToAdd);
				System.out.println("You now have " + currentNumberOfKeyschains + " keychains\n");
			} else if (userChoice == 2) {
				System.out.println("You have " + currentNumberOfKeyschains + " keychains. How many to remove?");
				int keysToRemove = input.nextInt();
				currentNumberOfKeyschains = currentNumberOfKeyschains - remove_keychains(keysToRemove);
				System.out.println("You now have " + currentNumberOfKeyschains + " keychains\n");
			} else if (userChoice == 3) {
				view_order(currentNumberOfKeyschains, PRICE_PER_KEYCHAIN);
			} else if (userChoice == 4) {
				checkout(currentNumberOfKeyschains, PRICE_PER_KEYCHAIN);
				break;
			}
		}
	}

	public static int add_keychains(int numberOfKeys) {
		// int curentNumberOfKeyschains = 0;
		// curentNumberOfKeyschains = curentNumberOfKeyschains + numberOfKeys;
		return numberOfKeys;
	}

	public static int remove_keychains(int numberOfKeysToRemove) {
		return numberOfKeysToRemove;
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
