package practicecorrected;

public class Test1 {

	public static void main(String[] args) {
		double discount = 0;
		int qty = Integer.parseInt(args[0]);
		
		if (qty >= 90) {
			discount = 0.5;
		}
		
		if (qty > 80 && qty < 90) {
			discount = 0.2;
		}
	}
}
