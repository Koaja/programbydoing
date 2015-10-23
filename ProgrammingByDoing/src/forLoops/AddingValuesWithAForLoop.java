package forLoops;

import java.util.Scanner;

public class AddingValuesWithAForLoop {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.print("Enter number: ");
		int temp =0 ;
		int countTo = input.nextInt();
		
		for (int i = 1; i <= countTo; i++) {
			System.out.println(i);
			temp += i;
		}
		System.out.println("The sum is : " + temp );
	}
}
