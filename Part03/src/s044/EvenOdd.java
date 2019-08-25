package s044;
// => s044 : do-while을 이용하여 1이 될 때까지 나누고 곱하기
public class EvenOdd {
	private static String title = "=> s044 : do-while을 이용하여 1이 될 때까지 나누고 곱하기\n";
	public static void main(String[] args) {
		System.out.println(title);
		
		showOddnEven(1122);
	}
	
	public static void showOddnEven(int n) {
		int temp=n;
		do {
			if(temp%2==1)
				temp=temp*3+1;	// 홀수
			else
				temp/=2;		// 짝수
			System.out.printf("[%d] ", temp);
		} while(temp!=1);
		System.out.println("\n-----------------");
	}
}
