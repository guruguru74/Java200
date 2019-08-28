package s072_System으로_환경변수_확인하기;

import java.util.Iterator;
import java.util.Map;

public class SystemPropertyTest {
	private static String title = "=> s072_System으로_환경변수_확인하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
	
		long nanotime = System.nanoTime();
		for(int i=0; i<100000; i++)
			System.out.print("");

		long nanotime2 = System.nanoTime();			// 10^9 nano java5추가
		System.out.println(nanotime2-nanotime + " nano seconds");		// 1/1000000000초
		System.out.println(System.getenv("JAVA_HOME"));		// 환경변수
		
		// 모든 env 구하기
		Map<String, String> map = System.getenv();			// 환경변수
		Iterator<String> iter = map.keySet().iterator();	// Map에서 키 얻기
		int j=0;
		while(iter.hasNext()) {
			String keys = iter.next();
			System.out.println((++j + ". ") + keys + " : " + map.get(keys));
		}
	}
}
