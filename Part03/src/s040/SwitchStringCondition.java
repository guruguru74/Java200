package s040;
// => s040 : switch~case로 환율 구하기
public class SwitchStringCondition {
	private static String title = "=> s040 : switch~case로 환율 구하기";
	
	public static double toMoney(String c) {
		double tot = 0.0;
		switch(c) {
			case "USD":	tot=1126.5;	break;
			case "JPY":	tot=110.6;	break;
			case "CNY":	tot=10.5;	break;
			default:	tot=1;	break;
		}
		return tot;
	}
	
	public static void main(String[] args) {
		System.out.println(title);
	
		String money = "USD";
		double result = toMoney(money);
		System.out.printf("%s => %f\n",  money, result);
	}
}
