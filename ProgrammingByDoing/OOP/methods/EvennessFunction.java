package methods;

public class EvennessFunction {
	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {
			System.out.println(isDivisibleBy3(i));
		}

	}

	public static boolean isEven(int n) {
		if (n == 2) {
			System.out.println(n + " <");
			return true;
		}

		return false;
	}

	public static boolean isDivisibleBy3(int n) {
		if (n % 3 == 0) {
			return true;
		}

		return false;
	}
}
