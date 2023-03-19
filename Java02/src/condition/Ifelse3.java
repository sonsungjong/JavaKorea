package condition;

import java.util.Scanner;

public class Ifelse3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 20세 이상이면 성인, 14~20세는 청소년, 14세 미만은 어린이로 구분
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		if(age >= 20) {
			System.out.println("성인");
		}else if(age > 13) {
			System.out.println("청소년");
		}else {
			System.out.println("어린이");
		}
		
		// 2. 학점 계산(90이상은 A, 80이상은 B, 70이상은 C, 그 미만은 F)
		System.out.print("학점을 입력하세요: ");
		int score = sc.nextInt();
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score > 69) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		
		// 3. 비밀번호를 정해놓고 사용자가 비밀번호를 입력해서 맞추면 '비밀번호가 맞습니다.'
		// 틀리면 '비밀번호가 다릅니다.' (비밀번호는 정수)
		int key = 1234;		// 정답 비밀번호
		System.out.print("비밀번호를 입력하세요: ");
		int password = sc.nextInt();
		if(key == password) {
			System.out.println("비밀번호가 맞습니다.");
		}else {
			System.out.println("비밀번호가 다릅니다.");
		}
		
		// 4. 윤년 판별하기 (년도를 입력받아 해당 년도가 윤년인지 판별해보세요)
		System.out.println("년도를 입력하세요: ");
		int year = sc.nextInt();
//		if((년도가 4의 배수이면서 년도가 100의 배수가 아니다) 또는 (년도가 400의 배수면)) {
//			System.out.println("윤년입니다.");
//		}else {
//			System.out.println("윤년이 아닙니다.");
//		}
		
		sc.close();
	}
}
