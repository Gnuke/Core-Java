
public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10 까지의 랜덤 넘버 추출
		int rand = (int)/* Math.random() 은 double을 반환 */(Math.random() * 10 + 1);
		System.out.println( "rand = " + rand );
		switch(rand) {
			// default: System.out.println( "Nuts" ); break;
			case 1: System.out.println( "Bananas" ); break;
			case 2: System.out.println( "Oranges" ); break;
			case 3: System.out.println( "Peach" );
			case 4: System.out.println( "Apples" );
			case 5: System.out.println( "Plums" ); break; // Switch의 OR 처리
			case 6: System.out.println( "Pineapples" ); break;
			case 7: System.out.println(); break;
			default: System.out.println( "Nuts" );
		}
	}

}
