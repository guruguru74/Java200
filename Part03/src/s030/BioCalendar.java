package s030;
// => s030 : 멤버 메서드를 이용하여 신체 지수 구하기
public class BioCalendar {
	private static String title = "=> s030 : 멤버 메서드를 이용하여 신체 지수 구하기";
	// 상수, 상수값은 변경할 수 없다.
	public static final int PHYSICAL = 23;	// 상수(개발자 정의)
	// static 메서드 선언
	public static double getBioRhythm(long days, int index, int max) {
		return max * Math.sin((days % index) * 2 * Math.PI / index);
	}
		
	public static void main(String[] args) {
		System.out.println(title);
		
		int days = 1200;
		BioCalendar bio = new BioCalendar();
		
		// 멤버 메서드 호출
		double phyval = bio.getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("나의 신체 지수 %1$.2f입니다.", phyval);
	}
}
