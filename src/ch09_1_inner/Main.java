package ch09_1_inner;

public class Main {
	public static void main(String[] args) {
		
		// 중첩클래스 상황에서 멤버 호출하는 방법 //
		
		A a = new A();
		
		// 인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		b.field = 3;
		b.method1();
		
		// 정적 멤버 클래스 객체 생성
		A.C c = new A.C(); // C는 static이라서 new변수 생성이 안되는데 A의 멤버로서 호출 가능...?!?!?
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		// 로컬 클래스 객체 생성 
		a.method();
	}

}
