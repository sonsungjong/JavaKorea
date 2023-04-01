package cls;

public class Method4 {
	public static void main(String[] args) {
		// 객체화
		MyClass7 mc7 = new MyClass7();
		int result = mc7.나머지구하기(10, 3);
		System.out.println(result);
	}
}

class MyClass7{
	// 더하기 +
	int 더하기(int num1, int num2) {
		return num1+num2;
	}
	
	// 빼기 -
	int 빼기(int num1, int num2) {
		return num1-num2;
	}
	
	// 곱하기 *
	int 곱하기(int num1, int num2) {
		return num1*num2;
	}
	
	// 나누기 / (0으로 나누면 결과를 0으로)
	double 나누기(int num1, int num2) {
		double result = 0.0;
		if(num2 == 0) {
			return result;
		}else {
			result = num1/num2;
			return result;
		}
	}
	
	// %기호 안쓰고 나머지 구하기 만들어보기
	int 나머지구하기(int num1, int num2) {
		// 나머지 구하기
		int result = 0;
		// 방법1
		result = num1-((num1/num2)*num2);
		
		// 방법2
//		result = num1;
//		while(true) {
//			if(result < num2) {
//				break;
//			}
//			result -= num2;
//		}
		
		return result; 
	}
}