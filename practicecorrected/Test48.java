package practicecorrected;

public class Test48 {

	public static void main(String[] args) {
		
		String[][] chs = new String[2][];
		chs[0] = new String[2];
		chs[1] = new String[5];
		
		int i = 97;
		
		for (int j = 0; j < chs.length; j++) {
			for (int j2 = 0; j2 < chs.length; j2++) {
				chs[j][j2] = "" + i;
				i++;
			}
		}
		
		for (String[] ca : chs) {
			for (String c : ca) {
				System.out.print(c + " ");
			}
			
			System.out.println();
		}
	}
}
