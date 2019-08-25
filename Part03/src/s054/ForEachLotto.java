package s054;
// => s054 : 향상된 for(foreach)로 배열 출력하기
public class ForEachLotto {
	private static String title = "=> s054 : 향상된 for(foreach)로 배열 출력하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
		
		int[] mm = {1, 6, 16, 22, 23, 33};
		for(int m : mm) {
			System.out.println(m+ "\t");
		}
		System.out.println("end...");
	}
}
