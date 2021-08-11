package ch09_2_anonymous;

interface RemoteControl {
	void turnOn();
	void turnOff();
}

class AnonymousImpement {
	// Television 클래스를 따로 만드는 대신에 안에다가 익명으로 구현 
	RemoteControl field = new RemoteControl() { 
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");};
		@Override
		public void turnOff() { 
			System.out.println("TV를 끕니다.");};
	};
	// Audio 클래스를 따로 만드는 대신에 안에다가 익명으로 구현 
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");};
			@Override
			public void turnOff() { 
				System.out.println("Audio를 끕니다.");};
		};
		localVar.turnOn();
		localVar.turnOff();
}
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}

public class AnonymousImplementExample {
	public static void main(String[] args) {
		AnonymousImpement anim = new AnonymousImpement();
		
		// 익명 객체 필드 사용
		anim.field.turnOn();
		
		// 익명 객체 로컬 변수 사용
		anim.method1();
		
		// 익명 객체 매개값 사용 
		anim.method2(new RemoteControl() {
			@Override
			public void turnOn() {	
				System.out.println("SmartTV를 켭니다.");
			}
			
			@Override
			public void turnOff() {	
				System.out.println("SmartTV를 끕니다.");
			}
		});
		
	}

}
