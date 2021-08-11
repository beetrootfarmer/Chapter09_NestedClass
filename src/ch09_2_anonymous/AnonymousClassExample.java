package ch09_2_anonymous;

class Person {
	void wake() {
		System.out.println("7시에 일어납니다.");
	}
}
class Anonymous {
	Person field = new Person() {
		// 클래스상속 받아서 구현
		void work() {System.out.println("출근을 합니다.");}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	}; // 익명의 클래스를 만든거야 
	void method1() {
		Person localVar = new Person() {
			void walk() { System.out.println("산책을 합니다."); }
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		localVar.wake();
	}
	void method2(Person person) {
		person.wake();
	}
}
public class AnonymousClassExample {
	public static void main(String[] args) {
		Anonymous annoy = new Anonymous();
		
		// 익명 객체 필드 사용
		annoy.field.wake();
		
		// 익명 객체 로컬 변수 사용
		annoy.method1();
		
		// 익명 객체 매개값 사용 
//	annoy.method2(new Person()); { // 메소드 호출해서 괄호에 왜 Person을 적어주는 건지 이해 못함 
//	}
	
	annoy.method2(new Person() {
			void study() { System.out.println("공부를 합니다.");}
			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
			
	}

}
