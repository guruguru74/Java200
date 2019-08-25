package s061;
// => s061 : String과 char를 이용하여 10진수를 2진수로 변환하기
public class BitShifting {
	private static String title = "=> s061 : String과 char를 이용하여 10진수를 2진수로 변환하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
		
		int ival=2345;
		int eval=-2345;
		BitShifting bitsh=new BitShifting();
		
		String vals=bitsh.makeBit(ival);
		System.out.println(ival + " \t==> " + vals);
		
		vals=bitsh.makeBit(eval);
		System.out.println(eval + " \t==> " + vals);
		
		char[] vs = vals.toCharArray();
		System.out.println(vs[0]);
	}
	
	public static final int BITMASK=1;
	public String makeBit(int value) {
		char[] val = new char[32];
		for(int i=31; i>=0; i--) {
			if((value & BITMASK)==1)
				val[i]='1';
			else
				val[i]='0';
			value >>>=1;	// 부호 무시하고 오른쪽 이동
		}
		return new String(val);	// char 배열을 String으로
	}
}
