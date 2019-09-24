package s088_빌보드차트파일을_저장한디렉토리찾기;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;

public class BillFiles {
	private static String title = "=> s088_빌보드차트파일을_저장한디렉토리찾기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
		
		//org.apache.commons.io.FileUtils;
		
		File fi = new File("billboard");
		File[] fd = fi.listFiles();
		System.out.println("file count=" + fd.length);
		
		for(File ff : fd) {
			String fname = ff.getName();	// 파일명
			String post = fname.substring(fname.lastIndexOf(".")+1);
			System.out.println("이름, 확장자 : " + fname + "." + post);			// 이름, 확장자
			System.out.println("전체경로 : " + ff.getAbsolutePath());		// 전체 경로
			System.out.println("수정일 : " + new Date(ff.lastModified()));	// 수정일
			
			try(BufferedReader br = new BufferedReader(
					new FileReader(ff.getAbsolutePath()))) {
				String msg = "";
				while((msg=br.readLine()) != null) {
					System.out.println(msg);
				}
			} catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("------------------------------");
		}
	}
}
