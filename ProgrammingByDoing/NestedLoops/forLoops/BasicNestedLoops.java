package forLoops;

public class BasicNestedLoops {
	public static void main(String[] args) {
		int i, j;

		for (i = 0; i <= 5; i++) {
			for (j = 0; j <= 5; j++) {
				System.out.print("(" + i + "," + j + ")");
			}
			System.out.println();
		}
		// System.out.println();
	}

}
