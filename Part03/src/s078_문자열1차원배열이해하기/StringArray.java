package s078_문자열1차원배열이해하기;

public class StringArray {
	private static String title = "=> s078_문자열1차원배열이해하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
		
		String[] myNum = new String[] {"2016-08-17", "2016-09-17", "2016-03-17"};		// 동적 배열
		String[] myNum2 = {"2016-08-17", "2016-09-17", "2016-03-17"};					// 정적 배열
		System.out.println(myNum2[0]);
		print(myNum);
		
		// myNum2 = {"2016-08-17", "2016-09-17", "2016-03-17"};	// 다시 초기화 불가
		myNum = new String[] {"2016-08-17", "2016-09-17", "2016-03-17", "2016-04-17"};
		String[] tos = new String[myNum.length];
		System.arraycopy(myNum, 0,  tos,  0,  myNum.length);
		print(tos);
	}
	
	public static void print(String[] tos) {
		for(String ss : tos)
			System.out.print(ss+"\t");
		System.out.println();
	}
}
