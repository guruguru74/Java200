package s071_System으로_연산소요시간구하기;

import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

public class SystemTest {
	private static String title = "=> s071_System으로_연산소요시간구하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
		
		long ltime = System.currentTimeMillis();
		System.out.println(ltime);	// 1970.1.1부터
		for(int i=0; i<10000000; i++)
			System.out.print("");
		
		long ltime2 = System.currentTimeMillis();
		System.out.println(ltime2-ltime + " msec");	// milli second 단위
		System.out.println(ltime2 + " : " + ltime2/1000/60/60/24/365+" 년");
		//System.out.println(ltime2 + " : " + ltime2/(1000*60*60*24*365)+" 년");
		
		Properties pro = System.getProperties();
		// 원하는 System Property
		System.out.println(pro.getProperty("java.vm.version"));
		System.out.println(pro.getProperty("file.separator"));
		System.out.println(new Date(System.currentTimeMillis()));	// 오늘
		
		// 모든 System Property
		Enumeration<Object> en = pro.keys();
		int i=0;
		while(en.hasMoreElements()) {
			String keys = (String)en.nextElement();
			System.out.println((++i+". ") + keys + " : " + pro.getProperty(keys));
		}
	}
}
