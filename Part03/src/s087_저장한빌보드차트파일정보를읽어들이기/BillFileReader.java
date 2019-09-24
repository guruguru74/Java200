package s087_저장한빌보드차트파일정보를읽어들이기;

import java.io.BufferedReader;
import java.io.FileReader;

public class BillFileReader {
	private static String title = "=> s087_저장한빌보드차트파일정보를읽어들이기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
		
//		BufferedReader br = null;
//		try { 
//			br = new BufferedReader(
//				new FileReader("billboard/result/bill.txt"));
		try (BufferedReader br = new BufferedReader(
				new FileReader("billboard/result/bill.txt"))) {
			String msg = "";
			while((msg=br.readLine()) != null) {
				System.out.println(msg);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
