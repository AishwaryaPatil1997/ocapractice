package practicecorrected;

public class Test15 {

	public static void main(String[] args) {
		
//		Byte x = 1;
//		short x = 1;
//		String x = "1";  compile time error
//		Long x = 1;    compile time error
//		Double x = 1;   compile time error
//		Integer x = new Integer("1");
		Integer x = 1;
		
		switch (x) {
		case 1:
			System.out.println("ONE");
			break;

		case 2:
			System.out.println("TWO");
			break;
		
		}
	}
}
