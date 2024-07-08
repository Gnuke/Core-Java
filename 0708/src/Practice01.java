
public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int line = 1;
		int i = 65;
//		for(  ; i<=90 ; ) {
//			if( line %2 ==0 ) {
//				System.out.printf( "%c\t", (char)(i+32) );
//			} else {
//				System.out.printf( "%c\t", (char)i );
//			}
//			
//			count++;
//			
//			if( count % 5 == 0 ) {
//				System.out.println(); line++;
//			}
//			
//			i++;
//		}
		
		// while문
		while(i <= 90) {
			if( line %2 ==0 ) {
				System.out.printf( "%c\t", (char)(i+32) );
			} else {
				System.out.printf( "%c\t", (char)i );
			}
			
			count++;
			
			if( count % 5 == 0 ) {
				System.out.println(); line++;
			}
			
			i++;
		}
	}

}
