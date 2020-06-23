package practicecorrected;

public class Test17 {

	public static void main(String[] args) {
		Boolean arr[] = {true, null};
		boolean a = new Boolean(Boolean.valueOf(arr[0]));
		boolean b = new Boolean(arr[1]);
		System.out.println(a + " " + b);
	}
}
