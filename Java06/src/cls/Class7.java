package cls;

public class Class7 {
	public static void main(String[] args) {
		// 객체화
		Human 홍길동 = new Human();
		Human 유관순 = new Human();
		
		홍길동.setName("홍길동");
		홍길동.setGender("남성");
		홍길동.setAge(30);
		
		유관순.setName("유관순");
		유관순.setGender("여성");
		유관순.setAge(19);
		
		HumanView hv = new HumanView();
		hv.printInfo(유관순);
		hv.printInfo(홍길동);
	}
}

// 멤버변수 private
// 메서드 public
class Human{
	// 데이터 : name, gender, age
	private String name;
	private String gender;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class HumanView{
	public void printInfo(Human human) {
		// 이름, 성별, 나이를 한번에 안내(출력)
		System.out.println("이름: "+human.getName()+", 성별: "+human.getGender()+", 나이: "+human.getAge());
	}
}
