package s060;
// => s060 : Stream과 map을 이요하여 홀수에 대한 제곱의 합 구하기
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * filter : 리스트에 저장된 데이터에 대해 조건에 맞는 수를 찾음.
 * map : "이렇게 처리하라"
 * collect : 해당 수의 값을 새로운 리스트에 저장.
 * filter(수->홀수).map(수->수*수).collect()는 홀수에 대하여 제곱한 수를 새로운 리스트에 저장한다는 의미.
 * @author skchoi
 *
 */
public class ForLambdaCondition {
	private static String title = "=> s060 : Stream과 map을 이요하여 홀수에 대한 제곱의 합 구하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
		
		List<Integer> ilist = new ArrayList<>();
		int s=0;
		for(int i=1; i<=10; i++)
			ilist.add(i);
		
		// stream filter map collect
		ilist = ilist.stream()
				.filter(i->i%2==1)
				.map(i->i*i)
				.collect(Collectors.toList());
		ilist.forEach(i->{ System.out.printf(i+"\t"); });
		System.out.println("...");
		
		// stream reduce
		s=ilist.stream().reduce(0,  Integer::sum);
		System.out.println("1~10 사이의 홀수에 대한 제곱합 : " + s);
	}
}
