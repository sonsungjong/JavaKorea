package except;

import java.util.Scanner;

public class Try2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// # 1
		// try-catch를 사용해서 나누기를 해보세요
		// 숫자 2개를 나누기하되
		// 0이 들어올 수 있으니깐 try로 예외처리
		int x = 10;
		int y = 0;
		int num;
		
		try {
			num = x/y;
			System.out.println(num);
		}catch(Exception e) {
			System.out.println("0으로 나눔");
		}
		
		
		// #2
		// int a = sc.nextInt();	에 대한 예외처리 (숫자를 입력해야하는 함수에 문자열를 입력할 수 있음)
//		System.out.println("숫자를 입력하세요>>");
//		int a = 0;
//		try {
//			a = sc.nextInt();		// nextInt : 숫자만 입력해줘야함
//			System.out.println(a);
//		}catch(Exception e) {
//			System.out.println("숫자를 입력해주세요");
//		}
		
		// 형변환 String -> int
		int c = 0;
		String str = "글자";
		try {
			c = Integer.parseInt(str);
			System.out.println(c);			
		}catch(Exception e) {
			System.out.println("숫자만 가능 "+e);
		}
	}
}

