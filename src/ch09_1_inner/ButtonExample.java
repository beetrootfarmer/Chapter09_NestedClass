package ch09_1_inner;


class Button {
	static interface OnClickListener {
		void onClick();
	}
	
	OnClickListener listener;  // 각각의 버튼들이 listener라는 인터페이스를 구현을 해서 각각 메소드를 오버라이
	
	void setOnClickListener (OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
}
class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {		
		System.out.println("전화를 겁니다.");
	}
	
}
class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {		
		System.out.println("메세지를 보냅니다.");
	}
	
}

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		btn.setOnClickListener(new CallListener());
		btn.touch();
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
