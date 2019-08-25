package s051;
// => s051 : &(비트) 연산자를 이용하여 2진수 문자열로 바꾸기
public class BitNShiftMain {
	private static String title = "=> s051 : &(비트) 연산자를 이용하여 2진수 문자열로 바꾸기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
		
		int intNums1=123;
		int intNums2=-123;
		System.out.printf("%d \t: %s\n",  intNums1, shifts(intNums1));
		System.out.printf("%d \t: %s\n",  intNums2, shifts(intNums2));
	}
	
	public static String shifts(int a) {
		int BITMASK=1;
		String s="";
		for(int i=0; i<32; i++) {
			s=(a & BITMASK)+s;
			a>>=1;		// a/=2
		}
		return s;
	}
}
