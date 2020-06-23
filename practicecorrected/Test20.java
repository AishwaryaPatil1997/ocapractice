package practicecorrected;

public class Test20 {

	public static void main(String[] args) {
		
		String stuff = "TV";
		String res = null;
		
		res = stuff.equals("TV")? "Walter" : stuff.equals("Movie")? "White" : "No Result";
		System.out.println(res);
	}
}
