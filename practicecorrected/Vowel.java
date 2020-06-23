package practicecorrected;

public class Vowel {

	private char var;
	public static void main(String[] args) {
		
		char var1 = 'a';
		char var2 = var1;
		var2 = 'e';
		
		Vowel v1 = new Vowel();
		Vowel v2 = v1;
		v1.var = 'i';
		v2.var = 'o';
		
		System.out.println(var1 + ", " + var2);
		System.out.println(v1 .var+ ", " + v2.var);
	}
}
