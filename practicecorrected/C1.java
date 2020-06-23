package practicecorrected;

class C2 {
	public void displayC2() {
		System.out.print("C2");
	}
}

interface I {
	public void displayI();
}

public class C1 extends C2 implements I {

	@Override
	public void displayI() {
		System.out.print("C1");
	}

	public static void main(String[] args) {
		C2 obj1 = new C1();
		I obj2 = new C1();
		
		C2 s = (C2) obj2;
		I t = (I) obj1;
		
		t.displayI();
		s.displayC2();
	}
}
