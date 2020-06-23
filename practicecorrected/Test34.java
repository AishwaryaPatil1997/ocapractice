package practicecorrected;

public class Test34 {

	public static int stvar = 100;
	public int var = 200;
	public String toString() {
		return var + ":" + stvar;
	}
	
	public static void main(String[] args) {
		Test34 t1 = new Test34();
		t1.var = 300;
		System.out.println(t1);
		Test34 t2 = new Test34();
		t2.stvar = 300;
		System.out.println(t2);
	}
}
