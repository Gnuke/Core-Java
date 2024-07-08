
public class LoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A ~ Z 까지 출력하기
		
		int i = 65; // initialization
		int count = 1;
		
		for( ; i<=90;  ) {
			
			System.out.printf( "%c\t", (char)i );
			
			//int count = 1;
			
			if( count % 5 == 0 ) {
				System.out.println();
			}
			
			count++;
			i++;
			//i -= 3; // i = i-3;
		}
		
		System.out.println();
		
	}

}
