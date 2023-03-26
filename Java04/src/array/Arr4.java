package array;

import java.util.Scanner;

public class Arr4 {
	public static void main(String[] args) {
		// 국가와 수도 (5개)
		/*
		 [국가별 수도]
		 대한민국의 수도는 서울입니다. 
		 일본의 수도는 도쿄입니다.
		 중국의 수도는 베이징입니다.
		 미국의 수도는 워싱턴입니다.
		 러시아의 수도는 모스크바입니다.
		 */
		
		String nations[] = {"대한민국", "일본", "중국", "미국", "러시아"};
		String cities[] = {"서울", "도쿄", "베이징", "워싱턴", "모스크바"};
		
		System.out.println("[국가별 수도]");
		for(int i=0;i<nations.length;++i) {
			System.out.println(nations[i]+"의 수도는 "+cities[i]+"입니다.");
		}
		
		Scanner sc = new Scanner(System.in);
		String user_input = "";
		int bk_index = -1;
		System.out.print("수도를 알고자하는 국가의 이름을 입력하세요>>");
		user_input = sc.next();
		
		// 해당하는 위치를 찾는다
		for(int i=0;i<nations.length;++i) {
			if(user_input.equals(nations[i])) {
				bk_index = i;
				break;
			}
		}
		
		if(bk_index == -1) {
			// 못찾았다
			System.out.println("해당 국가가 없습니다.");
		}else {
			// 찾았으니깐 값이 변경되었겠지
			System.out.println(nations[bk_index]+"의 수도는 "+cities[bk_index]+"입니다.");
		}
		
	}
}
