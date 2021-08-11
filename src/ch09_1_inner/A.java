package ch09_1_inner;

public class A {
	public A(){
		System.out.println("A 객체가 생성");
	}
	
	/**인스턴스 멤버 클래스**/
	class B {
		// 필드 
		int field;
//		static int field2;인스턴스 필드 안에 static 생성 할 수 없다. 
		// 생성자 
		public B() {
			System.out.println("B객체가 생성됨");
		}
		// 메소드 
		void method1() {}
//		static void method2() {}
	
	}
	
	/**정적 멤버 클래스**/
	static class C {
		int field1;
		static int field2;
		public C() {
			System.out.println("C 객체가 생성");
		}
		void method1() {}
		static void method2() {}
	}
	
	// 메소드
	void method() {
		/**로컬 클래스**/
		class D {
			public D() {
				System.out.println("D 객체가 생성");
			}
			int field1;
			void method1() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}

}
