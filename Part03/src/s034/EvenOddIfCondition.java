package s034;
// => s034 : if 조건문을 이용하여 짝/홀수 판별하기
public class EvenOddIfCondition {
	private static String title = "=> s034 : if 조건문을 이용하여 짝/홀수 판별하기";
	public static void main(String[] args) {
		System.out.println(title);
		
		int temp=99;
		if(temp%2==1) {
			temp=temp*3+1;
		} else {
			temp=temp/2;
		}
		
		System.out.printf("계산 후 = %d\n", temp);
	}
}
