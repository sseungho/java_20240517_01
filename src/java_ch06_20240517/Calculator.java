package java_ch06_20240517;

public class Calculator {
	
	public int firstNum; // 인스턴스 멤버
	int secondNum; // public 생략 가능
	
	static int thirdNum; // 정적 멤버
	
	static final double PI = 3.141592; // 처음 선언될 때 초기화되면 그 값은 변경 불가 -> final 로 선언
	
	static final double SALERATE = 0.7; // 상수 선언 -> 70% 세일
	
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calculator(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	
	public int add() {
		return  this.firstNum + this.secondNum;
	}

	public static int minus(int firstNum, int secondNum) {
		return  firstNum - secondNum;
	}
}
