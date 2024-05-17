package java_ch06_20240517;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal1 = new Calculator(10,20);
		Calculator cal2 = new Calculator(10,20);

		int a = cal1.add();
		System.out.println(a);
		System.out.print(cal1.firstNum);
		
		Calculator.thirdNum = 10;
		cal1.thirdNum = 10;
		Calculator.minus(100, 10);
		
//		Singleton test1 = new Singleton(); new 연산자로 객체 생성 불가 (private 이기 때문)
		
		Singleton test1 = Singleton.getInstance();
		Singleton test2 = Singleton.getInstance();

//		Calculator.PI = 3.6; final 로 선언되어 수정이 불가
		
	}
	

}
