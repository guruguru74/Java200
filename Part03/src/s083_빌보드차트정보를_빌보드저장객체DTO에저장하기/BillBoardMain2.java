package s083_빌보드차트정보를_빌보드저장객체DTO에저장하기;

public class BillBoardMain2 {
	private static String title = "=> s083_빌보드차트정보를_빌보드저장객체DTO에저장하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
		
		// Data를 객체로 저장
		Billboard b1 = new Billboard(1, "Despacito", 1, 
				"https://www.billboard.com/images/pref_images/q61808osztw.jpg", 
				"luis fonsi", "luis fonsi2");
		
		// 객체 출력
		showAbout(b1);
		
		// 객체로 전달
		Billboard b = b1; 	// 주소 복사
		showAbout(b);		// 객체 내용 출력
	}
	
	public static void showAbout(Billboard bb) {
		String sf = String.format("%d, %s, %d, %s, %s, %s", 
			bb.getRank(), bb.getSong(), bb.getLastweek(), 
			bb.getImagesrc(), bb.getArtistsrc(), bb.getArtist());
		System.out.println(sf);
	}
}
