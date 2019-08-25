package s045;
// => s045 : for를 이용하여 1이 될 때까지 나누고 곱하기\n
public class EvenOdd {
	private static String title = "=> s045 : for를 이용하여 1이 될 때까지 나누고 곱하기\n";
	public static void main(String[] args) {
		System.out.println(title);
		
		showOddnEvenf(1122);
	}
	
	public static void showOddnEvenf(int n) {
		int temp=n;
		for(;temp!=1;) {
			if(temp%2==1)	// 홀수
				temp=temp*3+1;
			else
				temp/=2;
			System.out.printf("[%d] ",  temp);
		}
		System.out.println("\n-----------------");
	}
}
