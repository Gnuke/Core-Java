
public class ProductInput {

	public void input( Product[] array ) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			//String y_n=null;
			int i = 0;
			
			for( ; i<array.length; i++) {
				//String line = sc.nextLine();
				array[i] = new Product();
				System.out.print( "상품명 : " ); array[i].setName( sc.next() );
				System.out.print( "수량 : " ); array[i].setSu( sc.nextInt() );
				System.out.print( "판매단가 : " ); array[i].setSell( sc.nextInt() );
				System.out.print( "매입단가 : " ); array[i].setBuy( sc.nextInt() );
				System.out.print( "운송료 : " ); array[i].setMove( sc.nextInt() );
				
//			System.out.print( "Again(y/n) ? :" ); y_n = sc.next();
//			y_n = y_n.toLowerCase();
				
				if( i>7)  System.out.println( "더 이상 입력하실 수 없습니다." );
			}
			
		for( int j = 0; j<array.length; j++) {
			System.out.println( "InputArray 매입가 : " + array[j].getBuy() );
		} // 입력 되는 지 검사
			
		sc.close();
		}
	}

}
