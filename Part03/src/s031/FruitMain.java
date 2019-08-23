package s031;
// => s031 : 상수의 묶음 클래스 enum 사용하기
public class FruitMain {
	private static String title = "=> s031 : 상수의 묶음 클래스 enum 사용하기";
	public static void main(String[] args) {
		System.out.println(title);
		
		FRUIT pear = FRUIT.APPLE;
		FRUIT pear2 = FRUIT.MANGO;
		
		System.out.println(pear);
		System.out.println(pear.name());
		System.out.println(pear.ordinal());		// 선언될 때 순서 0
		System.out.println(pear2.ordinal());	// 선언될 때 순서 2
		FRUIT[] fruits = FRUIT.values();
		System.out.println(fruits[0]);
	}
}
