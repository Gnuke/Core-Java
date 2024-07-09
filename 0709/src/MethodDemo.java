/*
 * Method를 호출하는 방법 3가지
 * 1) Call( Pass ) by Name
 *  
 */

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo md = new MethodDemo();
		md.calcHap();
	}
	
	void calcHap(){ // void - 무치형 // member method -> 주소로 접근
		int hap = 0;
		
		for( int i = 1; i<=100; i++ ) hap += i;
		
		System.out.printf( "1부터 100까지의 합은 %d입니다", hap );
	}
}

// Naming Convention
/*
 * 1. PascalCasing : Class, Interface, Enum
 * 2. camelCasing : variable, method, variableMethod
 * 3. Snake_Casing : 대소문자를 구별하지 않는 곳에 사용
 * 4. Kebbab-Casing
 */
 