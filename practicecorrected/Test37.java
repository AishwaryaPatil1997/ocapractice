package practicecorrected;

public class Test37 {

	int x, y;
	
	public Test37 (int x, int y) {
		initialize(x, y);
	}
	
	public void initialize (int x, int y) {
		this.x = x * x;
		this.y = y * y;
	}
	
	public static void main(String[] args) {
		int x = 3, y = 5;
		Test37 t = new Test37(x, y);
		System.out.println(x + " " + y);
	}
}
