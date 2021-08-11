package ch09_1_inner;

class Clac {
	static int x;
	static int y;
//	int x;
//	int y;
	
	public static int add() {
		return x +y; // 필드에 static이 붙은 상수 상태에서는 스태틱 메소드에서 호출 할 수 있ㅇㅁ.
//		return x +y; 인스턴스 변수를 스태틱 메소드에서 호출해서 사용할 수 없음. 언제 new 붙어서 값이 변할 지 모르기 때문임. 
	}
}

public class Example {
	public static void main(String[] args) {
		
	}

}
