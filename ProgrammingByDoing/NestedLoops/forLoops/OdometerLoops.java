package forLoops;

public class OdometerLoops {

	public static void main(String[] args) throws InterruptedException {

		for (int thous = 0; thous < 10; thous++) {
			for (int hund = 0; hund < 10; hund++) {
				for (int tens = 0; tens < 10; tens++) {
					for (int ones = 0; ones < 10; ones++) {
						System.out.print(" " + thous + "" + hund + "" + tens + "" + ones + "\r");
						Thread.sleep(500);
					}
				}
			}
		}

		System.out.println();
	}
}
