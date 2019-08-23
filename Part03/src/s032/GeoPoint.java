package s032;
// => s032 : 1,2차원 배열로 위도, 경도 표현하기
public class GeoPoint {
	private static String title = "=> s032 : 1,2차원 배열로 위도, 경도 표현하기";
	public static void main(String[] args) {
		System.out.println(title);
		
		//실수변수
		double latitude1 = 37.52127220511242;	// 서울
		double longitude1 = 127.0074462899625;
		double latitude2 = 35.13787;			// 부산
		double longitude2 = 129.0454;
		System.out.println(latitude1 + "\t" + longitude1);
		
		// 실수 1차원 배열
		double[] latlng1 = {latitude1, longitude1};
		double[] latlng2 = {latitude2, longitude2};
		System.out.println(latlng1[0] + "\t" + latlng1[1]);
		
		// 실수 2차원 배열
		double[][] latlng = {{latitude1, longitude1}, {latitude2, longitude2}};
		System.out.println(latlng[0][0] + "\t" + latlng[0][1]);		
	}
}
