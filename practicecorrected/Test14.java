package practicecorrected;

public class Test14 {

	public static void main(String[] args) {
		int[] intArr = {8,16,32,64,128};
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		for (int i : intArr) {
			System.out.print(i + " ");
		}
	}
}
