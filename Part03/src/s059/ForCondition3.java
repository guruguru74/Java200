package s059;
//=> s059 : Stream을 이용하여 홀수의 합 구하기
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Stream은 "순차적으로 나열된 데이터"
 * Stream은 Stream에 저장된 데이터를 쉽고 편하게 연산(filter, map, reduce)할 수 있는 기능을 제공함.
 * Stream 참고자료 : https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html
 * 모던 자바 인 액션 4장 - 스트림 소개
 * 
 * @author skchoi
 */

public class ForCondition3 {
	private static String title = "=> s059 : Stream을 이용하여 홀수의 합 구하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
		
		List<Integer> ilist = new ArrayList<>();
		int s=0;
		for(int i=1; i<=100; i++)
			ilist.add(i);
		
		// 초기값 0
		s=ilist.stream().reduce(0,  Integer::sum);
		System.out.println("1~100의 합 : " + s);
		
		// 1~100 사이의 홀수합1
		s=0;
		s=ilist.stream().filter(i->i%2==1).reduce(0,  Integer::sum);
		System.out.println("1~100 사이 홀수의 합1 : " + s);
		
		// 1~100 사이의 홀수합2
		s=ilist.stream().filter(i->i%2==1).reduce(0,  (x,y)->x+y);
		System.out.println("1~100 사이 홀수의 합2 : " + s);
		
		// 1~100 사이의 홀수합3	// 모던자바인액션 p327 참고
		s=ilist.stream().filter(i->i%2==1).reduce(0,  
				new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		});
		System.out.println("1~100 사이 홀수의 합3 : " + s);
		
	}
}
