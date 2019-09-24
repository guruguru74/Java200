package s086_빌보드차트정보를_파일로저장하기;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BillFileWriter {
	private static String title = "=> s086_빌보드차트정보를_파일로저장하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
		
		Billboard b1 =new Billboard(1,"Despacito",1,
				"https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi");
		Billboard b2 =new Billboard(2,"That's What I Like",2,
				"https://www.billboard.com/images/pref_images/q59725qvpol.jpg","bruno mars");
		Billboard b3 =new Billboard(3,"I'm The One",3,
				"https://www.billboard.com/images/pref_images/q64532pl64x.jpg","dj khaled");
		
		ArrayList<Billboard> bblist = new ArrayList<>();
		bblist.add(b1);
		bblist.add(b2);
		bblist.add(b3);
		
		File fi = new File("billboard/result");
		if(!fi.exists()) {
			fi.mkdirs();
		}
		
		//try (PrintWriter pw = new PrintWriter(new FileWriter("billboard/bill.txt", false), true)) {
		try (PrintWriter pw = new PrintWriter(new FileWriter(fi.getPath() + "/bill.txt", false), true)) {
//		try {
//			FileWriter fw = new FileWriter("billboard\\bill.txt", false);
//			PrintWriter pw = new PrintWriter(fw, true);
			for(Billboard bb : bblist) {
				//pw.println(bb);
				pw.println(bb.toString());
			}
		} catch(IOException e) {
			System.out.println(e);
		}		
	}
}
