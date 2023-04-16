package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDateTime2 {
	public static void main(String[] args) {
		MyDate md = new MyDate();
		
		while(true) {
			System.out.println(md.now());	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}

class MyDate{
	// 현재 시간을 가져오기
	// OOOO년 OO월 OO일 OO시 OO분 OO초
	public String now() {
		Calendar cal = Calendar.getInstance();		// 컴퓨터의 시간을 받아옴
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		String str = sdf.format(cal.getTime());
		
		return str;
	}
}