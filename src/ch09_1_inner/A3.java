package ch09_1_inner;

public class A3 {
	int field1;
	void method1() {}
	
	static int field2; 
	static void method2() {}
	
	class B3 {
		void method() {
			field1 = 10; //중첩클래스에서 상위 클래스의필드 호출 가능 
			method1();
			
			field2 = 10; //중첩클래스에서 상위 클래스의필드 호출 가능 . 그 반대는 생성순서때문에 안되는 것임.
			method2();
		}
	}
	
	static class C3 {
		void method() {
			//field1 = 10; //스태틱 중첩클래스에서 상위 클래스의 인스턴스 필드 호출 불가능 
			//method1();
			
			field2 = 10; 
			A3.method2(); // 스태틱 중첩클래스에서 상위 클래스의 스태틱 필드 호출 가능. 
		}
	}

}
