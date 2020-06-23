package practicecorrected;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.print(isAvailable + " ");
		isAvailable = t.doStuff();
		System.out.println(isAvailable);
	}
	
	public static boolean doStuff() {
		return !isAvailable;
	}
	
	static boolean isAvailable = false;
}
