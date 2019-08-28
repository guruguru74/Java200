package s073_수학관련메서드사용하기;

public class MathTestMain {
	private static String title = "=> s073_수학관련메서드사용하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();
	
		// constant
		System.out.println("Math.E" + Math.E);
		System.out.println("Math.PI" + Math.PI);
				
		// method
		double DVAL = 4.34;
		System.out.println("Math.abs(-5) 절대값 : " + Math.abs(-5));
		System.out.println("Math.ceil(4.34) 올림 : " + Math.ceil(DVAL));
		System.out.println("Math.round(4.34) 반올림 : " + Math.round(DVAL));
		System.out.println("Math.floor(4.34) 버림 : " + Math.floor(DVAL));
		System.out.println("Math.rint(4.34) 반올림 : " + Math.rint(DVAL));
		System.out.println("Math.max(45,78) 최대값 : " + Math.max(45,78));
		System.out.println("Math.min(45,78) 최소값 : " + Math.min(45,78));
		System.out.println("Math.pow(2,4) : " + Math.pow(2,4));
		System.out.println("Math.log(30) : " + Math.log(30));
		System.out.println("Math.exp(3) : " + Math.exp(3));
		System.out.println("Math.sqrt(10) : " + Math.sqrt(10));
		
		// random
		double dRan = Math.random();	// 0<== dRan <1 실수
		System.out.println("Math.random() => " + dRan);
	}
}
