package s062;
// => s062 : 정수를 입력받을 때 발생할 수 있는 예외 처리하기
public class FormatTryCatch {
	private static String title = "=> s062 : 정수를 입력받을 때 발생할 수 있는 예외 처리하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();

		String sNum="1234";
		String mNum="h";
		try {
			int a = Integer.parseInt(sNum);
			System.out.println(a);
		} catch(NumberFormatException ee) {			// catch 순서!!!
			System.out.println("int인지 확인필요!!!");
			System.err.println(ee.getMessage());
		} catch(Exception ee) {
			System.out.println("야 잘 좀 넣어!!!");
		} finally {
			System.out.println("난 수행되어야만 해~~~");
		}
	}
}
