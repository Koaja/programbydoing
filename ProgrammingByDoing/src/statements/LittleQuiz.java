package statements;

import java.util.Scanner;

public class LittleQuiz {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int correctAnswer = 0;
		int answer;
		int numberOfQuestions = 0;
		
		System.out.println("Are you ready to start? ");

		System.out.println("Q" + (numberOfQuestions++ +1) + " What is the capital of Alaska?");
		System.out.println("1) Melbourne");
		System.out.println("2) Anchorage");
		System.out.println("3) Juneau");
		
		answer = input.nextInt();
		
		if(answer == 3){
			System.out.println("That's right");
			correctAnswer++;
		}else {
			System.out.println("That's wrong");
		}
		
		System.out.println("Q" + numberOfQuestions++ + " Can you store the value 'cat' in a variable of type int?");
		System.out.println("1) yes");
		System.out.println("2) no");

		answer = input.nextInt();
		
		if(answer == 2){
			System.out.println("That's right");
			correctAnswer++;
		}else {
			System.out.println("That's wrong");
		}
		
		System.out.println("Q" +  numberOfQuestions++ + " What is the result of 9+6/3?");
		System.out.println("1) 5");
		System.out.println("2) 11");
		System.out.println("3) 15/3");
		
		answer = input.nextInt();
		
		if(answer == 2){
			System.out.println("That's right!");
			correctAnswer++;
		}else {
			System.out.println("That's wrong");
		}

		System.out.println("Overall, you got " + correctAnswer + " out of " + numberOfQuestions);
		
	}

}
