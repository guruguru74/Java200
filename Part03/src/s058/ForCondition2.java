package s058;
// => s058 : for와 if를 이용하여 홀수에 대한 제곱의 합 구하기
import java.util.ArrayList;
import java.util.List;

public class ForCondition2 {
	private static String title = "=> s058 : for와 if를 이용하여 홀수에 대한 제곱의 합 구하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
		
		List<Integer> ilist = new ArrayList<>();
		int s=0;
		int nmax=50;
		for(int i=1; i<=nmax; i++) {
			ilist.add(i);
		}
		
		for(int m : ilist) {
			if(m%2==1) {
				s += m*m;
				System.out.printf("%d\t",  m*m);
			}
		}
		System.out.println("...");
		System.out.printf("1~%d 사이의 홀수에 대한 제곱합 : " + s, nmax);
	}
}
