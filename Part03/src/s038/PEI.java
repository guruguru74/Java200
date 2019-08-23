package s038;
// => s038 : enum 값에 따라 신체, 감정, 지성값 출력하기
public enum PEI {
	PHYSICAL(23), EMOTIONAL(28), INTELLECTUAL(33);
	private final int peiValue;
	PEI(int pie) {
		this.peiValue = pie;
	}
	public int getPei() {
		return peiValue;
	}
}

enum FRUIT {
	APPLE, BANANA, MANGO
}
