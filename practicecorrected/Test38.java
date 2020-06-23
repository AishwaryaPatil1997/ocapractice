package practicecorrected;

public class Test38 {

	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40, 50 };
		int x = array.length;

//		while (x > 0) {
//			x--;
//			System.out.print(array[x] + " ");
//		}

		while (x > 0) {
			System.out.print(array[--x] + " ");
		}
	}
}
