
public class PolymorphismDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismDemo2 pd = new PolymorphismDemo2();
		Mammal m = null; // 접근주소
		
		for( int i = 0; i<3; i++) {
			int choice = pd.choose();
			
			switch(choice) {
				case 1: m = new Dog(); break;
				case 2: m = new Cat(); break;
				case 3: m = new American(); break;
				case 4: m = new Korean(); break;
			}
			m.sayThing(); 
		}
		
	}

	int choose() {
		System.out.println("*************Menu*************");
		System.out.println( "1.Dog" );
		System.out.println( "2.Cat" );
		System.out.println( "3.American" );
		System.out.println( "4.Korean" );
		
		java.util.Scanner sc = new java.util.Scanner( System.in );
		System.out.print( "당신은 어느 종족입니까( 1~4 ) ? : " );
		
		return sc.nextInt();
	}
}
