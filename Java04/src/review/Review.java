package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 1~10 중 짝수만 출력하기
		// for(초기값;조건식;증감량){반복할 코드;}
		for (int i = 1; i <= 10; ++i) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// 2. 정수형태 비밀번호 맞추기 (기회는 5번, 맞추면 맞췄다!, 기회를 모두 사용하면 접속불가.)
//		int pwd = 1234;
//		int user_input = 0;
//
//		for (int i = 0; i < 5; ++i) {
//			System.out.print("비밀번호를 입력하세요>>");
//			user_input = sc.nextInt();
//			if (user_input == pwd) {
//				System.out.println("맞았습니다!");
//				break;
//			}
//			if (i == 4) {
//				System.out.println("접속불가");
//			}
//		}
		
		// 3. 시험합격 점수는 국어,영어,수학이 각각 40점 이상이고, 총점수가 150점 이상이면 합격
		// 40점 이하의 점수가 있으면 과락, 각 과목이 40점 이상이나 총점이 미달되었으면 총점미달(조건문)
		/*
		 39, 40, 40   ==> 과락
		 39, 40, 100  ==> 과락
		 40, 40, 40  ==> 총점 미달
		 40, 40, 100 ==> 합격
		*/
		int 국어 = 40;
		int 영어 = 40;
		int 수학 = 100;
		int 총점수 = 0;
		
		총점수 = 국어 + 영어 + 수학;
		
		if(국어 >= 40 && 영어 >= 40 && 수학 >= 40) {
			// 과락X
			if(총점수 >= 150) {
				System.out.println("합격");
			}else {
				System.out.println("총점 미달");
			}
		}else {
			System.out.println("과락");
		}
		
		// 4. 1~10까지의 합 구하기(반복문)
		/* 55 */
		int sum = 0;
		for(int i=1;i<=10;i+=1) {
			sum += i;
		}
		System.out.println(sum);
		
		// 5. 10~1까지 거꾸로 출력하기(반복문)
		/* 10 9 8 7 6 5 4 3 2 1 */
		for(int i=10;i>=1;i--) {
			System.out.print(i+" ");
		}
		
	}
}
