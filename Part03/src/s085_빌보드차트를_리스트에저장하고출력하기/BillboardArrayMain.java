package s085_빌보드차트를_리스트에저장하고출력하기;

import java.util.ArrayList;

public class BillboardArrayMain {
	private static String title = "=> s085_빌보드차트를_리스트에저장하고출력하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
	
		ArrayList<Billboard> bills=new ArrayList<Billboard>();
		bills.add(new Billboard(1,"Despacito",1,
			"https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi"));
		bills.add(new Billboard(2,"That's What I Like",2,
			"https://www.billboard.com/images/pref_images/q59725qvpol.jpg","bruno mars"));
		bills.add(new Billboard(3,"I'm The One",3,
			"https://www.billboard.com/images/pref_images/q64532pl64x.jpg","dj khaled"));
		System.out.println("bills size = " + bills.size());   // 3 
		
		showAbout(bills.get(0));  // 0번째 Billbaord 객체
		bills.remove(1);          // 1번쩨 삭제             
		System.out.println("bills size = " + bills.size());   // 2
		
		System.out.println("----------------------");
		for(Billboard bb : bills){
			showAbout(bb);
		}
	}
	
	public static void showAbout(Billboard bb ){//객체를 전달하여 출력
	 	String sf=String.format("%d, %s, %d, %s, %s",
				bb.getRank(), bb.getSong(),bb.getLastweek(),bb.getImagesrc(),bb.getArtist());
		System.out.println(sf);
	 }
}
