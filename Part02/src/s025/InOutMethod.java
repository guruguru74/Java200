package s025;

import java.util.Scanner;

// s025 : 키보드로 입력받아 콘솔에 출력하기
public class InOutMethod {
	private static String title = "=> s025 : 키보드로 입력받아 콘솔에 출력하기";
	public static void main(String[] args) {
		System.out.println(title);
		
		Scanner scann = new Scanner(System.in);		// 키보드
		
		System.out.println("정수를 입력하세요.");
		int choice = scann.nextInt();		// 키보드로 정수 입력
		System.out.println(choice);
		
		System.out.println("실수를 입력하세요.");
		double rchoice = scann.nextDouble();
		System.out.println(rchoice);
		
		System.out.println("문자열을 입력하세요.");
		String schoice = scann.next();
		System.out.println(schoice);
		
		System.out.println("종료합니다.");
	}
}
