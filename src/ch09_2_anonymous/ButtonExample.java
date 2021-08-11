package ch09_2_anonymous;

class Button {
	// 중첩 인터페이스 
	static interface OnClickListener {
		void onClick();
	}
	// 인터페이스 타입 필드 
	OnClickListener listener;
	
	// 매개변수의 다형성 
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener; // 이 과정을 왜 해줄까요..?
	}
	// 인터페이스 구현 객체의 onClick() 메소드 호출 
	void touch() {
		listener.onClick();
	}
}

class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	public Window() { // Window클래스의 생성자 
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {	
				System.out.println("메세지를 보냅니다.");
			}
		});
	}
}

public class ButtonExample {
	public static void main(String[] args) {
		Window win = new Window();
		win.button1.touch();
		win.button2.touch();
		
	}

}
