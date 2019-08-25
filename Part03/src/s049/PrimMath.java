package s049;
// => s049 : 제곱근을 이용하여 소수 판별하기
public class PrimMath {
	private static String title = "=> s049 : 제곱근을 이용하여 소수 판별하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
		
		int number = 12345678;
		boolean ifPrime = isPrime(number);	// 소수인가를 확인한다.
		String str = "";
		if(ifPrime)
			str = String.format("%d는 1과 자신으로만 나눠 떨어지는 소수다.",  number);
		else
			str = String.format("%d는 소수가 아니다.", number);
		
		System.out.println(str);
	}
	
	/**
	 * 소수 판별 방법은 에라토스테네스 사용
	 * @param n
	 * @return
	*/	
	public static boolean isPrime(int n) {
		boolean isS=true;
		for(int i=2; i<=(int)Math.sqrt(n); i++) {
			if(n%i==0) {
				isS = false;
				break;
			}
		}
		return isS;
	}
}
