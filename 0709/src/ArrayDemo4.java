
public class ArrayDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] array = { 3.14, 89.5, 182.5, 69.2 };

		// 기존 방식
//		for( int i = 0; i< array.length; i++) {
//			System.out.printf( "%.2f\n", array[i] );
//		}
		// 기존 for 문의 장점이자 단점 : Loop 횟수를 미리 알 수 있다.
		
		// Enhanced For -> Loop 횟수를 몰라도 유효 -> 반복횟수 인지 단계가 없으므로 속도가 더 빠름
		for( double aaa : array ) {
			System.out.println(aaa);
		}
	}

}
