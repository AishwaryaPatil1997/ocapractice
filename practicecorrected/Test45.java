package practicecorrected;

import java.time.LocalDate;

public class Test45 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2012, 1, 30);
		date.plusDays(10);
		System.out.println(date);
	}
}
