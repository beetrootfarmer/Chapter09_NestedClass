package ch09_2_anonymous;

class Animal {
	void sound() {
		System.out.println("~");
	}
}
public class Example {
	public static void main(String[] args) {
		Animal ani = new Animal() {
			void run() {System.out.println("피슝-------!");}
			@Override
			void sound() {
				System.out.println("왈왈!!왈왈!!");
				run();
			}
		};
		ani.sound();
		System.out.println();
		
		ani = new Animal( ) {
			void swim() {
				System.out.println("헤엄~헤엄~");
			}
			@Override
			void sound() {
				System.out.println("Hi~Im Dori~ ");
				swim();
		}
	};
	
	ani.sound();
	System.out.println();

		ani = new Animal( ) {
			void dance() {
				System.out.println("냥 !냥 !냥 !");
			}
			@Override
			void sound() {
				System.out.println("먀옹~ 먀옹~ ");
				dance();
			}
		};
		ani.sound();
		System.out.println();

}
}

//
//	class Minam extends Animal {
//		@Override
//		void sound() {
//			System.out.println("왈왈!!왈왈!!");
//		}
//
//		void run() {
//			System.out.println("피슝-------!");
//		}
//	}
//
//	class Cat extends Animal {
//		@Override
//		void sound() {
//			System.out.println("먀옹~ 먀옹~ ");
//		}
//
//		void dance() {
//			System.out.println("냥 !냥 !냥 !");
//		}
//	}
//
//	class Dori extends Animal {
//		@Override
//		void sound() {
//			System.out.println("Hi~Im Dori~ ");
//		}
//
//		void swim() {
//			System.out.println("헤엄~헤엄~");
//		}
//	}
//
//	public class Example {
//		public static void main(String[] args) {
//			Animal ani = new Animal();
//			void run();
//			@Override
//			void sound() {
//				System.out.println("");
//				run();
//			}
//		};
//		ani.sound();
//	}
//
//}
