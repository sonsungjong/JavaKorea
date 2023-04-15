package string;

public class String2 {
	public static void main(String[] args) {
		MyClass9 mc = new MyClass9();
		// 카페 포스기와 키오스크와 모바일간 통신(보안)
		String order1 = "name=001price=2000type=0";		
		System.out.println(mc.info(order1));		// 뜨거운 에스프레소 2000원		
		
		String order2 = "name=003price=6000type=1";		// 차가운 카페라떼 6000원
		System.out.println(mc.info(order2));		// 뜨거운 에스프레소 2000원
		
		String order3 = "name=004price=6000type=1";			// 차가운 딸기라떼 6000원
		System.out.println(mc.info(order3));		// 뜨거운 에스프레소 2000원
		
	}
}

class MyClass9{
	public String info(String str) {		// String str = order1;
		// name 001 : 에스프레소, 002: 아메리카노, 003: 카페라떼, 004: 딸기라떼, 005: 케모마일차
		// price
		// type 0 : 뜨거운, 1: 차가운
		String result = "";
		// 구현
		String name = str.substring(5,8);		// 5 ~ 7
		String price = str.substring(14, 18);		// 14 ~ 17
		String type = str.substring(23, 24);		// 23
		
		if(name.equals("001")) {
			name = "에스프레소";
		}else if(name.equals("002")) {
			name = "아메리카노";
		}else if(name.equals("003")) {
			name = "카페라떼";
		}else if(name.equals("004")) {
			name = "딸기라떼";
		}else if(name.equals("005")) {
			name = "케모마일차";
		}
		// name이 이름으로 변경되어있을 것
		
		if(type.equals("0")) {
			type = "뜨거운";
		}else if(type.equals("1")) {
			type = "차가운";
		}else {
			type = "";
		}
		
		result = type +" "+ name + " " + price +"원";
		
		return result;
	}
}

