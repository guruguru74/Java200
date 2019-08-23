package s039;
// => s039 : switch~case로 카드값 구하기
public class SwitchCondition {
	private static String title = "=> s039 : switch~case로 카드값 구하기";
	
	public static int toNum(char c) {
		int tot = 0;
		switch(c) {
			case 'A':	tot = 1; 	break;
			case 'T':	tot = 10;	break;
			case 'J':	tot = 11;	break;
			case 'Q':	tot = 12;	break;
			case 'K':	tot = 13;	break;
			default:	tot = c-'0';	break;	// '9'-'0'
		}
		return tot;
	}
	
	public static void main(String[] args) {
		System.out.println(title);
	
		char c = 'J';
		int result = toNum(c);
		System.out.printf("%c => %d\n", c, result);
	}
}
