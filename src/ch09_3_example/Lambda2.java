package ch09_3_example;

interface Readable {
	void read(String s);
}
//  
//class Reader implements Readable {
//	@Override
//	public void read(String s) {
//		System.out.println("\"" + s + "\"" + "을(를) 읽는다.");
//	}
//}


public class Lambda2 {
	public static void main(String[] args) {
		Readable r1 = new Readable() {
//			[익명의 객체와 메소드 생성]
			@Override
			public void read(String s) {
				System.out.println("\"" + s + "\"" + "을(를) 읽는다.");
			}
		};
		
		r1.read("What is Labda?");
	}
}
