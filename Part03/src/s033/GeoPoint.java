package s033;
// => s033 : 객체를 이용하여 위도, 경도 표현하기
public class GeoPoint {
	private static String title = "=> s033 : 객체를 이용하여 위도, 경도 표현하기";
	public static void main(String[] args) {
		System.out.println(title);
	
		// 실수변수
		double latitude1 = 37.52127220511242;	// 서울
		double longitude1 = 127.0074462899625;
		double latitude2 = 35.13787;			// 부산
		double longitude2 = 129.0454;
		
		// 위도, 경도 객체
		Geo geo1 = new Geo();
		geo1.latitude = latitude1;
		geo1.longitude = longitude1;
		System.out.println(geo1.latitude + "\t" + geo1.longitude);
		
		Geo geo2 = new Geo();
		geo2.latitude = latitude2;
		geo2.longitude = longitude2;
		
		// 객체 전달
		Geo geo = geo1;
		System.out.println(geo.latitude + "\t" + geo.longitude);
	}
}
