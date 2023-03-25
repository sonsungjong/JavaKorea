package loop;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		// for문을 통해서 구현해보세요
		
		// 1. 안녕 5번
		for(int i=0;i<5;i++) {
			System.out.println("안녕");
		}
		
		// 2. 1~10까지 합계 구하기
		int sum = 0;			// 합계를 저장할 변수
		for(int i=1;i<=10;i++) {
			sum += i;
		}
		System.out.println("합계는 : "+sum);
		
		// 3. 1~입력값까지 합계 구하기 
		// (예시: 10 => 55)
		// (예시: 50 => 1275)
		int sum1 = 0;
		int last_num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("몇까지 더할까요?");
		last_num = sc.nextInt();
		
		for(int i=1; i<=last_num;++i) {
			sum1 += i;
		}
		System.out.println("합계는 : "+sum1);
		
	}
}
