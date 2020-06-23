package practicecorrected;

public class Test24 {

	static int count = 0;
	int i = 0;
	
	public void changeCount() {
		while (i<5) {
			i++;
			count++;
		}
	}
	
	public static void main(String[] args) {
		Test24 t1 = new Test24();
		Test24 t2 = new Test24();
		t1.changeCount();
		t2.changeCount();
		System.out.println(t1.count + " : " + t2.count);
	}
}
