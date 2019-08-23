package s016;
// s016 : API에서 제공하는 참조 타입 사용하기
import java.util.Calendar;
import java.util.Date;

public class JavaObjectType {
	public static void main(String[] args) {
		// 기본 타입의 배열은 참조타입
		int[] m = {1,2,3};
		int[] n = new int[] {1,2,3};
		
		// 참조타입 - 객체 타입
		String card = "H8";
		Date dt = new Date();
		Calendar cal = Calendar.getInstance();
		
		// 자동으로 toString()이 붙음.
		System.out.println("=== s016");
		System.out.println(card);
		System.out.println(dt);
		System.out.println(cal);
	}
}
