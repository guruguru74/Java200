package s075_Calendar와String사이_날짜변환하기;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import sun.security.ssl.Debug;

public class RestDay {
	private static String title = "=> s075_Calendar와String사이_날짜변환하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
		
		String st = "2017-06-13";
		Calendar d2 = toDate(st);
		System.out.println(toYMD(d2));
		
		String st2 = goGo(st, -7);	// -7일
		System.out.println(st2);
		
		Calendar d3 = toDate(st2);
		System.out.println(toYMD(d3));
		
		TimeZone tz = TimeZone.getDefault();	// Asia/Seoul 현재 PC의 시간대(타임존).
		Calendar cal = Calendar.getInstance(tz);	// 타임존에 대한 오늘
		System.out.println(toYMD2(cal));
		
		TimeZone tzNY = TimeZone.getTimeZone("America/New_York");
		Calendar calNY = Calendar.getInstance(tzNY);
		System.out.println(toYMD2(calNY));
	}
	
	public static Calendar toDate(String ss) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dd = new Date();
		try {
			dd = sdf.parse(ss);
		} catch(ParseException e) {
			
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(dd);
		return cal;
	}
	
	public static String toYMD(Calendar cal) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(cal.getTime());
	}
	
	public static String toYMD2(Calendar cal) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(cal.getTime());
	}
	
	public static String goGo(String ss, int day) {
		Calendar cal = toDate(ss);
		cal.add(Calendar.DAY_OF_YEAR,  day);	// -7일을 더하면 일주전
				
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		return sdf.format(cal.getTime());
		return toYMD(cal);
		
	}
	
}
