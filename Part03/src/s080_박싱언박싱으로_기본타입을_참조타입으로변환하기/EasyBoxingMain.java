package s080_박싱언박싱으로_기본타입을_참조타입으로변환하기;

import java.util.ArrayList;

public class EasyBoxingMain {
	private static String title = "=> s080_박싱언박싱으로_기본타입을_참조타입으로변환하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
		
		int intNm1 = 123;
		long longNum1 = 345L;
		double doubleNum = 123.123;
		
		Integer intWrap1 = intNm1;			// new Integer(intNm1);
		Long longWrap1 = longNum1;			// new Long(longNum1);
		Double doubleWrap1 = doubleNum;		// new Double(doubleNum);
		
		double dd = doubleWrap1;
		
		// 기본 타입 <=> Wrapper는 캐스팅 없이 사용
		Integer intWrap2 = intNm1;			// Boxing
		intNm1 = intWrap2;						// UnBoxing
		System.out.println(intNm1);
		
		ArrayList<Integer> ilists = new ArrayList<>();
		ilists.add(new Integer(3));
		ilists.add(5);
		
		int a = ilists.get(0);					// <Integer>
		System.out.println(a);
		
		int b = Integer.parseInt("123");
		System.out.println(b);
	}
}
