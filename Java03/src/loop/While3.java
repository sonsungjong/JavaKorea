package loop;

import java.util.Scanner;

public class While3 {
	public static void main(String[] args) {
		// while문의 플래그를 활용하여
		// 1~10의 합계를 구해보세요 (정답은 55)
		int sum = 0;
        int i = 1;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("몇까지 더할까요?");
        num = sc.nextInt();
        while (i <= num) {
            sum += i;
            i++;
        }

        System.out.println("1부터 "+num+"까지의 합계: " + sum);
		
		
		// 사용자에게 정수값을 입력받아서
		// 1~입력값까지 모두 합한 결과를 출력
		// 예를들어 50을 입력하면 1~50까지 각각 다 더해서 답은 1275가 나와야합니다
		
	}
}
