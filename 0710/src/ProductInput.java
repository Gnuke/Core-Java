
public class ProductInput {

	void input( Product pdt ) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String y_n=null;
		
		do {
			System.out.print( "상품명 : " ); pdt.setName( sc.next() );
			System.out.print( "수량 : " ); pdt.setSu( sc.nextInt() );
			System.out.print( "판매단가 : " ); pdt.setSell( sc.nextInt() );
			System.out.print( "매입단가 : " ); pdt.setBuy( sc.nextInt() );
			System.out.print( "운송료 : " ); pdt.setMove( sc.nextInt() );
			
			System.out.print( "Again(y/n) ? :" ); y_n = sc.next();
			y_n = y_n.toLowerCase();
		}while( y_n.equals("y") );
			
		sc.close();
	}

}
