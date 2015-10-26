package methods;

/*
 * Finish the program provided. You'll need to write five if statements and some function calls. 
 * If you do it right it should display a phrase in an interesting way.
 * 
 * What You Should Do on Your Own

	Assignments turned in without these things will receive no credit.
	Add the five if statements and function calls where indicated.
	(optional) Add a delay using Thread.sleep()
 */

import java.util.Random;

public class FlickerPhrase {
	public static void main(String[] args) throws InterruptedException {
		Random rng = new Random();
		int r;

		for (int i = 0; i < 10; i++) {
			r = 1 + rng.nextInt(5);
			// Write five if statements here.
			// If r is 1, then call the function named 'first'.
			// If r is 2, then call the function named 'second', and so on.

			// Optional: after the if statements are over, add in a slight
			// delay.
			
			if(r == 1){
				first();
			}else if (r ==2){
				second();
			}else if (r == 3){
				third();
			}else if (r == 4){
				fourth();
			}else if (r == 5){
				fifth();
			}
			Thread.sleep(1000);
		}

		System.out.println("I pledge allegiance to the flag.");

	}

	public static void first() {
		System.out.print("I                               \r");
	}

	public static void second() {
		System.out.print("  pledge                        \r");
	}

	public static void third() {
		System.out.print("         allegiance             \r");
	}

	public static void fourth() {
		System.out.print("                    to the      \r");
	}

	public static void fifth() {
		System.out.print("                           flag.\r");
	}
}