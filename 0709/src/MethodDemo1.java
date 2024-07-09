/*
 * Method를 호출하는 방법 3가지
 * 2) Call( Pass ) by Value
 *  
 */

public class MethodDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo1 md = new MethodDemo1();
		md.calcHap( 10, 50 );
		md.calcHap( 1, 50 );
		md.calcHap( 10, 500 );
	}
	
	void calcHap( int start, int end ){ // member method -> 주소로 접근
		int hap = 0;
		
		for( int i = start; i <= end; i++ ) hap += i;
		
		System.out.printf( "%d부터 %d까지의 합은 %d입니다\n", start, end, hap );
	}
}
 