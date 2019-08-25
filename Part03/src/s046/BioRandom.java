package s046;
// => s046 : while을 이용하여 서로 다른 세 정수 만들기
public class BioRandom {
	private static String title = "=> s046 : while을 이용하여 서로 다른 세 정수 만들기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
		
		int range=1000;
		int start=1;
		int a=0, b=0, c=0;
		while(true) {
			a=(int)(range*Math.random()+start);
			b=(int)(range*Math.random()+start);
			c=(int)(range*Math.random()+start);
			if(a!=b && b!=c && c!=a)
				break;
		}
		
		System.out.printf("%d\t%d\t%d",  a, b, c);
	}
}
