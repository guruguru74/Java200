package s053;
// => s053 : for와 if를 이용하여 홀수의 합을 구하기
public class ForCondition {
	private static String title = "=> s053 : for와 if를 이용하여 홀수의 합을 구하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
		
		int s=0;
		for(int i=1; i<=100; i++)
			s+=i;
		System.out.println("1~100의 합 : " + s);
		
		s=0;
		for(int i=1; i<=100; i++) {
			if(i%2==1)
				s+=i;
		}
		System.out.println("1~100 사이의 홀수의 합 : " + s);
	}
}
