/*
 * Method를 호출하는 방법 3가지
 * 2) Call( Pass ) by Value
 *  
 */

public class MethodDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo4 md = new MethodDemo4();
		int result = md.calcHap( 10, 50 );
		System.out.println( result );
		
		result = md.calcHap( 1, 50 );
		System.out.println( result );
		
		result = md.calcHap( 10, 500 );
		System.out.println( result );
	}
	
	int calcHap( int start, int end ){ // member method -> 주소로 접근
		int hap = 0;
		
		for( int i = start; i <= end; i++ ) hap += i;
		
		return hap;
	}
}
 