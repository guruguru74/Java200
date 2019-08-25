package s065_Class를이용하여메서드와생성자살펴보기;
// => s065 : Class를 이용하여 메서드와 생성자 살펴보기
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class UsingClass {
	private static String title = "=> s065 : Class를 이용하여 메서드와 생성자 살펴보기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();

		Object obj1 = new Object();
		Class classes = obj1.getClass();
		System.out.println(classes.getName());		// 클래스 이름
		System.out.println("----- contructor -----");
		
		Constructor[] constructor = classes.getDeclaredConstructors();
		for(Constructor con : constructor)
			System.out.println(con.getName());
	
		System.out.println("----- Method -----");
		Method[] method = classes.getMethods();
		for(Method me : method)
			System.out.println(me.getName());
	}
}
