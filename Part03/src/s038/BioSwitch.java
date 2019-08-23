package s038;
// => s038 : enum 값에 따라 신체, 감정, 지성값 출력하기
public class BioSwitch {
	private static String title = "=> s038 : enum 값에 따라 신체, 감정, 지성값 출력하기";
	
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
		
		PEI index = PEI.PHYSICAL;
		double value = 0.86;
		System.out.println("신체 지수 주기값 : " + index.getPei());		// enum을 int로 변환
		
		String st = textInfor(index.getPei(), value);
		System.out.println(st);
		System.out.println(index.ordinal());
		System.out.println(index.name());
		System.out.println(index);
		System.out.println(index.getPei());
	}
}
