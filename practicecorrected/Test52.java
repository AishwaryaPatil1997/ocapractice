package practicecorrected;

public class Test52 {

	void readCard(int cardNo) throws Exception {
		System.out.println("Reading Card");
	}
	
	void checkCard(int cardNo) throws RuntimeException {
		System.out.println("Checking Card");
	}
	
	public static void main(String[] args) throws Exception {
		Test52 ex = new Test52();
		int cardNo = 12344;
		ex.checkCard(cardNo);
		ex.readCard(cardNo);
	}
}
