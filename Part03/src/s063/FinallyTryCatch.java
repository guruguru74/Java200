package s063;
// => s063 : 수학 연산에서 발생하는 예외 처리하기"
public class FinallyTryCatch {
	private static String title = "=> s063 : 수학 연산에서 발생하는 예외 처리하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();

		try {
			int x=5;
			int y=20/(5-x);
			System.out.println(y);
		} catch (ArithmeticException e) {
			System.out.println("==> 0으로 나눴나 확인 필요!!!");
			e.printStackTrace();
		} finally {
			System.out.println("finally~~ 난 수행되어야만 해!!!");
		}
	}
}
