package practicecorrected;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		String [] myArray;
		
		try {
			while (true) {
				myList.add("My String");
			}
		} catch (RuntimeException e) {
			System.out.println("Caught a RuntimeException");
		} catch (Exception e) {
			System.out.println("Caught a Exception");
		}
		
		System.out.println("Reday to use");
	}
}
