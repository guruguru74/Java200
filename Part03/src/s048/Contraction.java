package s048;
// 
public class Contraction {
	private static String title = "=> s048 : while과 단축 연산자를 이용하여 각 자릿수의 합 구하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
		
		int number=123456789;
		int value=sumEach(number);
		System.out.printf("%d에 대한 각 자리 숫자 합 : %d", number, value);
	}
	
	public static int sumEach(int n) {
		int tot=0;
		while(n!=0) {
			tot+=n%10;		// 3->2->1
			n/=10;			// 123->12->1->0
		}
		return tot;
	}
}
