package s035;
// => s035 : 삼항연산자를 이용하여 짝/홀수 판별하기
public class EvenOddTriCondition {
	private static String title = "=> s035 : 삼항연산자를 이용하여 짝/홀수 판별하기";
	public static void main(String[] args) {
		System.out.println(title);
		
		int temp=99;
		temp=(temp%2==1 ? temp*3+1 : temp/2);
		System.out.printf("계산 후 = %d\n", temp);
	}
}
