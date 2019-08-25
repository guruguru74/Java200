package s043;
// => s043 : while을 이용하여 1이 될 때까지 나누고 곱하기
public class EvenOdd {
	private static String title = "=> s043 : while을 이용하여 1이 될 때까지 나누고 곱하기";
	public static void main(String[] args) {
		System.out.println(title);
	
		showOddnEentw(1122);
	}
	
	public static void showOddnEentw(int n) {
		int temp = n;
		while(temp!=1) {
			if(temp%2==1)	// 홀수
				temp=temp*3 + 1;
			else			// 짝수
				temp/=2;	
			System.out.printf("[%d] ", temp);
		}
		System.out.println("\n-----------------");
	}
}
