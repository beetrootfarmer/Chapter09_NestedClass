package ch09_2_anonymous;

interface Calculatable {
	public int sum();
}

class Anonymousing {
	private int field;
	
	public void method(final int arg1, int arg2) { // 안써있지만 final int arg2 임 ..왜???
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		//arg1 =20;
		//arg2 =20;
		//var1 = 30;
		//var2 = 30;
		
		Calculatable calc = new Calculatable () {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}
public class Caculate {
	public static void main(String[] args) {
		Anonymousing annoy = new Anonymousing();
		annoy.method(0, 0);
	}

}
