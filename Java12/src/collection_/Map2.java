package collection_;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Map2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.추가 2.변경 3.삭제 4.조회 0.끝내기
		MyDictionary dic = new MyDictionary();		// 생성자에서 flower:꽃, sea:바다, new:새로운
		String word1 = "", word2 = "";
		int choice = 0;
		
		while(true) {
			System.out.println("1.추가 2.변경 3.삭제 4.조회 0.끝내기");
			choice = Integer.parseInt(sc.nextLine());
			if(choice == 1) {
				// 1. 추가
				System.out.print("추가할 영단어를 입력하세요>>");
				word1 = sc.nextLine();
				System.out.print("추가할 한국어 뜻을 입력하세요>>");
				word2 = sc.nextLine();
				dic.addWord(word1, word2);
			}else if(choice == 2) {
				// 2. 변경
				System.out.print("변경할 영단어를 입력하세요>>");
				word1 = sc.nextLine();
				System.out.print("변경 후의 한국어 뜻을 입력하세요>>");
				word2 = sc.nextLine();
				dic.modifyWord(word1, word2);		// 뜻을 변경
			}else if(choice == 3) {
				// 3. 삭제
				System.out.println("삭제할 영단어 또는 한국어 뜻을 입력하세요>>");
				word1 = sc.nextLine();
				dic.deleteWord(word1);
			}else if(choice == 4) {
				// 4. 조회
				dic.showAll();
			}else if(choice == 0) {
				// 0. 끝내기
				break;
			}else {
				/* no actions */
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}

// 한영사전 만들기
// 생성자에 단어 3개정도
class MyDictionary{
	// 멤버변수 private
	private Map<String, String> map;		// 다형성 (Map은 HashMap의 부모클래스)
	
	// 메서드 public
	public MyDictionary() {
		map = new HashMap<String,String>();
		map.put("flower", "꽃");
		map.put("sea", "바다");
		map.put("new", "새로운");
	}
	
	public void addWord(String word1, String word2) {
		map.put(word1, word2);
	}

	public void modifyWord(String word1, String word2) {
		map.put(word1, word2);			// 키가 중복되면 값을 덮어씀
	}

	// 전체 조회
	public void showAll() {
		Set<String> set = map.keySet();
		for(String e : set) {
			System.out.println(e);
		}
	}

	// 영단어 또는 한국어 뜻을 통해 삭제
	public void deleteWord(String word) {
		if(map.containsKey(word)) {
			map.remove(word);			// 키값을 찾아서 삭제
		}else if(map.containsValue(word)) {
			// 값을 통해서 해당하는 키의 위치를 찾고 키값으로 삭제
			String target = "";
			Set<String> set = map.keySet();

            for (String e : set) {
                if (map.get(e).equals(word)) {
                    target = e;
                }
            }
            map.remove(target);
		}
	}
}

