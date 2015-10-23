package forLoops;

import java.util.Scanner;

public class CountingMachineRevisited {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int countFrom;
		int countTo;
		int countBy;
		
		System.out.print("Count from: ");
		countFrom = input.nextInt();
		
		System.out.print("Count to: ");
		countTo = input.nextInt();
		
		System.out.print("Count by: ");
		countBy = input.nextInt();
		
		for(countFrom = countFrom ; countFrom <= countTo ; countFrom += countBy ){
			System.out.print(countFrom + " ");
		}
	}

}
