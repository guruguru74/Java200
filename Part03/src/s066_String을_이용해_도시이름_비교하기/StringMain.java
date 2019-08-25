package s066_String을_이용해_도시이름_비교하기;

/**
 * 같은 문자열에 대해 new로 생성한 문자열의 Stack 레퍼런스는 다르지만, Heap 해시코드는 동일하다.
 * @author skchoi
 *
 */
public class StringMain {
	private static String title = "=> s066_String을_이용해_도시이름_비교하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();

		String city1 = "Asia";
		String city2 = "Europe";
		String city3 = new String("Asia");
		String city7 = "Asia";
		
		System.out.println(city1);
		System.out.println(city1.length());
		System.out.println(city1==city2);
		System.out.println(city1.equals(city2));
		System.out.println(city1==city3);
		System.out.println(city1==city7);
		System.out.println(city1.equals(city3));
		System.out.println(city1.contentEquals(city7));
		
		String city4 = String.format("%s-%s",  city1, city2);
		System.out.println(city4);
		
		String city5 = city1 + "-" + city2 + 1 + 2;		// 연산 순서
		System.out.println(city5);
		
		String city6 = 1 + 2 + city1 + "-" + city2;		// 연산 순서
		System.out.println(city6);
	}
}
