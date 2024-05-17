package java_ch06_20240517;

public class Singleton {
	
//	Calculator cal1 = new Calculator();
//	Calculator cal2= new Calculator();
//	Calculator cal3 = new Calculator();

	// Singleton 싱글톤 기법
	// 정적 필드
	
	private static Singleton single1 = new Singleton();
	
	private  Singleton() {
		
	}
	
	public static Singleton getInstance()  {
		return single1;
	}

}
