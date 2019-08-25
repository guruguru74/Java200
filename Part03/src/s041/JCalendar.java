package s041;
// => s041 : 논리 연산자(&&, ||)로 윤년 판별하기
public class JCalendar {
	private static String title = "=> s041 : 논리 연산자(&&, ||)로 윤년 판별하기";
	public static void main(String[] args) {
		System.out.println(title);
		
		JCalendar hc = new JCalendar();
		int year = 2012;
		System.out.printf("Year [%d] is " + hc.isLeapYear(year), year);
	}
	
	public boolean isLeapYear(int year) {
		boolean isS = false;
		/**
		 * 
역법인 태음력이나 태양력에 있어서 자연의 흐름과 생길 수 있는 오차를 보정하기 위해 삽입하는 날이나 주, 달이 들어가는 해를 말한다. 
삽입하는 달을 정하는 방법을 치윤법(置閏法)이라고 한다.
한국법에서는, "윤년"이란 그레고리력에서 여분의 하루인 2월 29일을 추가하여 1년 동안 날짜의 수가 366일이 되는 해를 말한다(천문법 제2조 제5호).
그레고리력이 현 인류 사회에서 가장 널리 쓰이기에 윤년=2월 29일이라는 인식이 절대적이나, 
다른 달력의 경우 윤년이 2월 29일이 아닐 수도 있다. 대표적으로 세계력은 윤년을 6월 31일로 설정했다.

윤년 추가 규칙은 다음과 같다.
4로 나누어 떨어지는 해는 윤년, 그 밖의 해는 평년으로 한다.

그레고리력에는 다음과 같은 추가 규칙이 있다.
4로 나누어 떨어지지만 100으로 나누어 떨어지는 해는 평년으로 한다.
단, 400으로 나누어 떨어지는 해는 윤년으로 한다.[1]

이 규칙에 의해 보통 4년에 한 번씩 하루가 추가된다. 
그리고 이 추가된 날은 날수가 가장 적은 2월에 추가된다. 이것이 바로 4년마다 2월 29일이 돌아오는 이유다.

reference : https://namu.wiki/w/%EC%9C%A4%EB%85%84
		 */
		if(((year%4==0) && (year%100!=0)) || (year%400==0)) {
			isS = true;
		}
		return isS;
	}
}
