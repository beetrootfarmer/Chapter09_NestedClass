package ch09_1_inner;

class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field ="Nested field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field); // 이 메소드를 포함한 필드를 가리킨다. 
			this.method();
			System.out.println(Outter.this.field); // Outter 의 필드를 가리킴. 
			Outter.this.method();
		}
	}
}


public class OuterExample {
	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}
}
