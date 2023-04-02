package cls;

public class KrController {
	public static void main(String[] args) {
		// 객체화
		KrModel km1 = new KrModel();		// 모델
		KrModel km2 = new KrModel();
		
		km1.setNum(111);
		km1.setStr("안녕");
		
		km2.setNum(222);
		km2.setStr("반갑");
		
		KrService ks = new KrService();		// 꾸며주기 클래스
		KrView kv = new KrView();		// 출력 클래스
		
		kv.printStr(km1);
		kv.printStr(km2);
		
		ks.decoEquals(km1);
		ks.decoPlus(km2);
		
		kv.printStr(km1);
		kv.printStr(km2);
	}
}

// KrModel 클래스 (변수 : num, str / 메서드 : get, set)
class KrModel{
	int num;
	String str;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
}

// KrView 클래스 (출력용)
class KrView{
	void printNum(KrModel km) {
		System.out.println(km.getNum());
	}
	
	void printStr(KrModel km) {
		System.out.println(km.getStr());
	}
}

// KrService 클래스 (자바기능)
class KrService{
	// 출력하기 전에 꾸며주기
	void decoEquals(KrModel km) {
		// 양 옆에 == 표시
		km.setStr("=="+km.getStr()+"==");		// 문자열을 가져온다음 ==을 붙여서 저장
	}
	
	void decoPlus(KrModel km) {
		// 얖옆에 + 표시
		//km.setStr("+"+km.getStr()+"+");			// 문자열을 가져온다음 +를 붙여서 저장
		km.str = "+" + km.str + "+";
	}
}

