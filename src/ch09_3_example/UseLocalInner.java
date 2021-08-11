package ch09_3_example;

interface Printable2 {
	void print();
}

class Papers2 {
	private String contents;

	public Papers2(String s) { // 생성자 
		contents = s;
	}

	public Printable2 getPrinter() {
		class Printer2 implements Printable2 {
			@Override
			public void print() {
				System.out.println(Papers2.this.contents);
			}
		}
//		Printer2 prn = new Printer2();
//		return prn; 
		//new Printer2 이름 붙여줘서 실행하는거랑 밑의 값은 같다.
		return new Printer2();
	}

}

public class UseLocalInner {
	public static void main(String[] args) {
		Papers2 papers = new Papers2 ( "My Doc ...... ");
		Printable2 prn = papers.getPrinter();
		prn.print();
		
	}

}
