package collection_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Food {
	public static void main(String[] args) {
		// 1. 추가 2. 변경 3. 삭제 4. 전체보기 0. 끝내기
		// 음식점 항목을 관리하는 프로그램 만들기
		// 기본메뉴 : 김밥, 떡볶이, 순대
		// 가격 : 1000, 2000, 3000
		FoodList food = new FoodList();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String food_name = "";
		int food_price = 0;
		
		System.out.println("==항목을 선택하세요==");
		while(true) {
			System.out.println("1.추가 2.변경 3.삭제 4.보기 0.끝내기");
			choice = sc.nextInt();
			if(choice == 1) {
				// 1. 추가
				System.out.println("추가할 음식명:");
				food_name = sc.next();
				System.out.println("추가 음식의 가격:");
				food_price = sc.nextInt();
				food.addFood(food_name, food_price);
			}else if(choice == 2) {
				// 2. 변경
				System.out.println("변경할 음식: ");
				food_name = sc.next();
				System.out.println("변경 후 음식명: ");
				String after = sc.next();
				System.out.println("변경 음식의 가격:");
				food_price = sc.nextInt();
				food.setFood(food_name, after, food_price);
			}else if(choice == 3) {
				// 3. 삭제
				System.out.println("삭제할 음식:");
				food_name = sc.next();
				food.deleteFood(food_name);
			}else if(choice == 4) {
				// 전체 보기
				food.showAll();
			}else if(choice == 0){
				System.out.println("프로그램 종료");
				break;
			}else {
				/* no actions */
			}
		}
	}
}

class FoodList{
	ArrayList<String> name = new ArrayList<>();
	ArrayList<Integer> price = new ArrayList<>();
	
	public FoodList(){
		String arr1[] = {"김밥","떡볶이","순대"};
		int arr2[] = {1000, 2000, 3000};
		
		name.addAll(Arrays.asList(arr1));
		for(int i=0;i<arr2.length;++i) {
			price.add(arr2[i]);
		}
	}
	
	public void addFood(String a_name, int a_price) {
		name.add(a_name);
		price.add(a_price);
	}
	
	public void setFood(String a_before, String a_after, int a_price) {
		int number = name.indexOf(a_before);
		name.set(number, a_after);
		price.set(number, a_price);
	}
	
	public void deleteFood(String a_name) {
		int number = name.indexOf(a_name);
		name.remove(number);
		price.remove(number);
	}
	
	public void showAll() {
		for(int i=0;i<name.size();++i) {
			System.out.println(name.get(i)+" : "+price.get(i)+"원");
		}
	}
}
