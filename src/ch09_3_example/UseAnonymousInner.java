package ch09_3_example;

interface Printable3 {
	void print();
}

class Papers3 {
	private String contents;

	public Papers3(String s) { // 생성자 
		contents = s;
	}

	public Printable3 getPrinter2() {
//		익명개체 만드는 방법 
		return new Printable3() {
			@Override
			public void print() {
				System.out.println(Papers3.this.contents);
		}
			
	};
	}
}		
//		[객체에 이름 붙여서 실행하는 방법] 
//		Printer2 prn = new Printer2();
//		return prn; 
//		[중첩클래스로 실행하는 방법]
//		return new Printer3();


public class UseAnonymousInner {
	public static void main(String[] args) {
		
	}

}
