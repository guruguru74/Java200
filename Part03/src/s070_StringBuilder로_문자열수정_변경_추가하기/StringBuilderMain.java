package s070_StringBuilder로_문자열수정_변경_추가하기;

public class StringBuilderMain {
	private static String title = "=> ";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();

		// syncronized 안한 StringBuilder
		StringBuilder sbu = new StringBuilder();
		sbu.append("I")
			.append(" go")
			.append(" to school.");
		System.out.println(sbu);
		
		sbu.replace(7, 11, "");
		System.out.println(sbu);
		
		sbu.reverse();
		System.out.println(sbu);
		
		sbu.deleteCharAt(3);
		System.out.println(sbu);
		
		sbu.delete(1, 3);
		System.out.println(sbu);
		
		String ss = sbu.substring(0);
		System.out.println(ss);
		System.out.println(sbu);
		
		String st = sbu.substring(0,4);
		System.out.println(st);
		System.out.println(sbu);
	}
}
