package s056;
//=> s056 : 배열보다 편리한 List 사용하기
import java.util.ArrayList;
import java.util.List;

public class LottoList {
	private static String title = "=> s056 : 배열보다 편리한 List 사용하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
		
		List<Integer> ilist = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			ilist.add(i);
		}
		ilist.add(0,  123);
		for(int i=0; i<ilist.size(); i++) {
			int m=ilist.get(i);
			System.out.printf("%d\t",  m);
		}
		System.out.println("...");
	}
}
