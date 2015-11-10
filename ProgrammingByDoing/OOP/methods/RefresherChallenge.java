package methods;

import java.util.Scanner;

public class RefresherChallenge {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Name :");
		String userName = input.nextLine();

		for (int i = 0; i < 10; i++) {
			if (userName.equals("Mitchel")) {
				System.out.println(userName);
				System.out.println(userName);
				System.out.println(userName);
				System.out.println(userName);
				System.out.println(userName);
				break;
			}
			System.out.println(userName);
		}
	}
}
