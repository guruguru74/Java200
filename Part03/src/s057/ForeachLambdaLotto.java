package s057;
//=> s057 : foreach와 Lambda 형식을 이용하여 List 출력하기
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForeachLambdaLotto {
	private static String title = "=> s057 : foreach와 Lambda 형식을 이용하여 List 출력하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
		
		// Integer : int의 래퍼클래스
		List<Integer> mmlists = Arrays.asList(1, 6, 16, 22, 23, 33);
		mmlists.forEach(
				m->{ System.out.printf(m+"\t"); }
		);
		
		System.out.println("---");
		Consumer<Integer> consume=(Integer m)->{ System.out.printf(m+"\t"); };
		mmlists.forEach(consume);;
	}
	
}
