package forLoops;

public class XsAndYs {

	public static void main(String[] args) {
		
		double x =0;
		double y = Math.sqrt(x);
		System.out.println("x \t y");
		System.out.println("--------------");
		for(x = -10 ; x <= 10 ; x += 0.5){
			System.out.println(x + "\t" + (Math.pow(x, 2)));
		}
	}
}
