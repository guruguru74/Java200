package s074_Calendar로_살아온날_구하기;

import java.util.Date;
import java.util.Calendar;

public class CalendarTest {
	private static String title = "=> s074_Calendar로_살아온날_구하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
		
		long millis = System.currentTimeMillis();
		System.out.println(millis / 1000/24/60/60);		// 몇일 경과
		
		Date d = new Date();	// 오늘
		System.out.println(d);
		
		Date dd = new Date(d.getTime()+ 24*60*60*1000);	// 하루 후
		System.out.println(dd);
		
		Calendar cal1970 = Calendar.getInstance();
		cal1970.set(1970,  1-1, 1);		// 0월~11월, 1970.1.1
		
		Calendar today = Calendar.getInstance();	// 오늘
		printCalendar(today);
		
	}
	
	public static void printCalendar(Calendar c) {
		System.out.println("----------------------------");
		System.out.println(c.get(Calendar.YEAR));			// 몇 년
		System.out.println(c.get(Calendar.MONTH)+1);		// 몇 월
		System.out.println(c.get(Calendar.DAY_OF_MONTH));	// 몇 일
		System.out.println(c.get(Calendar.AM_PM));			// 1 PM, 0 AM
		System.out.println(c.get(Calendar.HOUR_OF_DAY));	// 몇 시
		System.out.println(c.get(Calendar.MINUTE));			// 몇 분
		System.out.println(c.get(Calendar.SECOND));			// 몇 초
	}
}
