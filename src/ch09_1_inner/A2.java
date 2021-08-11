package ch09_1_inner;

// 바깥 필드와 메소드에서 사용 제한

/** 클래스A2**/
public class A2 {
	/**인스턴스 멤버 클래스**/
	class B2{}
	
	/**정적 멤버 클래스 **/
	static class C2 {}
	
	// 인스턴스 필드
	B2 field1 =new B2();
	C2 field2 = new C2();
	
	// 정적 필드 초기화...스태틱 필드
	//static B2 field3 = new B2(); 
		// field3 스태틱인데 new...static에  instance 객체를 넣는것은 불가능 
	static C2 field4 = new C2(); // static과 static은 가능 
	
	//인스턴스 메소드
	void method1() {
		B2 var1 = new B2();
		C2 var2 = new C2();
	}
	
	
	// 스태틱  메소드
	static void method2() {
		//B2 var1 = new B2 ();
		C2 var2 = new C2();
	}

}
