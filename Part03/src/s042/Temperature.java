package s042;
// => s042 : 정수-실수 변환으로 섭씨를 화씨로 바꾸기
public class Temperature {
	private static String title = "=> s042 : 정수-실수 변환으로 섭씨를 화씨로 바꾸기";
	public static void main(String[] args) {
		System.out.println(title);
		
		for(int i=0; i<101; i++) {
			double fahrenheit = 9.0/5*i+32;
			System.out.printf("섭씨 %d도 = 화씨 %.2f도.\n", i, fahrenheit);
		}			
	}
}
