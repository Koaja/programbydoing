package forLoops;

public class CountingByHalves {

	public static void main(String[] args) throws InterruptedException {
		
		for(double i = -10 ; i <= 10; i +=0.5){
			System.out.println(i + " ");
			Thread.sleep(500);
		}
	}
}
