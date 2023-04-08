package extend;

// Impl : 구현부
public class PhoneImpl {
	public static void main(String[] args) {
		Phone2G p2 = new Phone2G();
		Phone3G p3 = new Phone3G();
		PhoneLTE p4 = new PhoneLTE();
		Phone5G p5 = new Phone5G();
		
		p2.call();
		p3.internet();
		p4.lte();
		p5.bigdata();
	}
}

class Phone2G implements Phone{
	// 전화+문자
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다.");
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("문자를 보냅니다.");
	}
}

class Phone3G implements Phone{
	// 전화+문자+인터넷

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다.");
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("문자를 보냅니다.");
	}
	
	public void internet() {
		System.out.println("인터넷을 합니다.");
	}
	
}

class PhoneLTE implements Phone{

	// 전화+문자+인터넷+속도(빠름)
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다.");
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("메시지를 보냅니다");
	}
	
	public void internet() {
		System.out.println("인터넷을 합니다.");
	}
	public void lte() {
		System.out.println("빠름");
	}
}

class Phone5G implements Phone{

	// 전화+문자+인터넷+속도+빅데이터
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다.");
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("메시지를 보냅니다");
	}
	
	public void internet() {
		System.out.println("인터넷을 합니다.");
	}
	public void lte() {
		System.out.println("빠름");
	}
	public void bigdata() {
		System.out.println("빅데이터 사용");
	}
	
}
