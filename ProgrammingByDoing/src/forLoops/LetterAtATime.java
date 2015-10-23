package forLoops;

import java.util.Scanner;

public class LetterAtATime {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {

		Scanner input = new Scanner(System.in);

		String message;

		System.out.print("What is your message :");

		message = input.nextLine();

		System.out.println("Your message is :" + message.length() + " characters long");
		System.out.println("Your first character is at position " + (message.length() - message.length()) + " and is "
				+ message.charAt(0));
		System.out.println("Your last character is at position " + (message.length() - 0) + " and is "
				+ message.charAt(message.length() - 1));

		System.out.println("Here are all the characters, one at a time: ");
		for (int i = 0; i < message.length(); i++) {
			System.out.println(i + " - " + "'" + message.charAt(i) + "'");
			Thread.sleep(500);
		}
		int countLetter = 0;

		for (int i = 0; i < message.length(); i++) {
			char letter = message.charAt(i);
			if (letter == 'e' || letter == 'E') {
				countLetter++;
			}
		}

		System.out.println("\nYour message contains the letter 'e' " + countLetter + " times. Isn't that interesting?");
	}

}
