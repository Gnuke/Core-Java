
public class NestedLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int dan = 5;
//		int i = 1;
//		
//		while( i<=9 ) {
//			System.out.printf( "%d X %d = %d\n", dan, i, dan*i );
//			i++;
//		}
		
//		int i = 1; // i 초기화
//		while( i<= 9 ) { // i 조건
//			int dan = 2; // dan 초기화
//			while( dan <= 9 ) {
//				System.out.printf( "%d X %d = %d\t" , dan, i, dan*i );
//				dan++;// dan 증감식
//			}
//			System.out.println();
//			i++;
//		}
		
		int dan = 2; // dan 초기화
		while( dan <= 9 ) { // dan 조건
			int su = 1; // su 초기화 
			while( su <= 9 ) {
				System.out.printf( "%d X %d = %d\n", dan, su, dan*su );
				su++;
			}
			dan++;
			System.out.println();
		}
	}
}
