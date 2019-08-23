package s037;
// => s037 : 상수값에 따라 신체, 감정, 지성값 출력하기
public class BioSwitch {
	private static String title = "=> s037 : 상수값에 따라 신체, 감정, 지성값 출력하기";
	
	// 상수
	public static final int PHYSICAL = 23;
	public static final int EMOTIONAL = 28;
	public static final int INTELLECTUAL = 33;
	
	// 메서드 선언
	public static String textInfor(int index, double value) {
		String result = "";
		switch(index) {
			case 23: result = "신체 지수 : "; break;
			case 28: result = "감정 지수 : ";	break;
			case 33: result = "지성 지수 : "; break;
		}
		return result + (value * 100);
	}
	
	public static void main(String[] args) {
		System.out.println(title);
		
		int index = PHYSICAL;
		double value = 0.86;
		String st = textInfor(index, value);
		System.out.println(st);
	}
}
