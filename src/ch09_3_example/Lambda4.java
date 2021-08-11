package ch09_3_example;

interface Readable3 {
	void read(String s);
}

public class Lambda4 {
	public static void main(String[] args) {

//		[익명 객체를 함수로 표현한 것 == Lambda식 ]
		Readable2 r1 = 
				(s) -> {System.out.println("\"" + s + "\"" + "을(를) 읽는다.");};
				
//		[Lamda 식을 외부에서 썼을 때 식의 정체를 알려면 내부 객체들을 살펴봐야하기 때문에 잘 안쓰기도 했다.. ]
//		[앞으로 많이 쓸것 같아 ]
		r1.read("What is Labda?");
	}
}
