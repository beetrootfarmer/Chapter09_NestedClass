package ch09_3_example;

interface Readable2 {
	void read(String s);
}

public class Lambda3 {
	public static void main(String[] args) {

//		[익명 객체를 함수로 표현한 것 == Lambda식 ]
		Readable2 r1 = 
				/*public void read*/(String s) -> {System.out.println("\"" + s + "\"" + "을(를) 읽는다.");};
				// public void read로 지정하는 대신에 -> 로 해결...
		r1.read("What is Labda?");
	}
}
