package forLoops;

public class GettingIndividualDigits {
	public static void main(String[] args) {

		for (int i = 10; i <= 99; i++) {
			for (int j = 0; j < 1; j++) {
				int k = i / 10;
				int l = i % 10;
				int m = k + l;
				System.out.println(i + ", " + k + " + " + l + " = " + m);
			}
		}
	}
}
