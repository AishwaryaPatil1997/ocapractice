package practicecorrected;

//interface Downloadable {
//	public void download() ;
//}

interface Readable {
	public void readBook();

	public void setBookMark();
}

abstract class Book implements Readable {
	public void readBook() {
		System.out.println("Read Book");
	}
}

class EBook extends Book { // line n3

	public void readBook() {
		System.out.println("Read E-Book");
	}

	public void setBookMark() {
		// TODO Auto-generated method stub

	}

}
