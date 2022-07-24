package day10;

public class StringClass2 {
	public static void main(String[] args) {
		String info1 = "STAname=A01price=001000num=02ED";
		String info2 = "STAname=A04price=001500num=04ED";
		String info3 = "STAname=E01price=002500num=04ED";
		Quiz2 q2 = new Quiz2();
		q2.go(info1);			// 에스프레소 2잔 주문, 2000원
		q2.go(info2);			// 카페라떼 4잔 주문, 6000원
		q2.go(info3);			// 오렌지주스 4잔 주문, 10000원
	}
}

class Quiz2{
	// info는 주문 내역 (통신패킷)
	// 보안을 위해서 시작은 무조건 STA로 시작, 마지막은 ED로 끝나야함
	
	// 상품명은 name= 다음에, 가격은 price= 다음에, 수량은 num= 다음에
	// A01 : 에스프레소, A02 : 아메리카노, A03 : 카푸치노, A04: 카페라떼
	// E01 : 오렌지주스
	
	public void go(String info) {
		// 이름 위치 찾고
		// 이름자르고
		// 이름은 변경 (A02 -> 아메리카노)
		
		// 수량 위치 찾고
		// 수량자르고
		// 수량은 Integer.parseInt()
		
		// 가격 위치 찾고
		// 가격자르고
		// 가격은 Integer.parseInt()
		
		// 총 가격은 가격*수량
		// syso()
	}
}