
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int age; // Declaration
		//age = 28; // Assignment
		//int age = 28; // Declaration + Assignment = Initialization
		
//		int [] age; // Declaration, int age [] 가능, 8byte
//		age = new int [4]; // Creation
//		age[0] = 6; age[1] = 7; age[2] = 8; age[3] = 9; // Assignment
//		
//		//char[] array = {'a','b','c','d'}; // Initialization -> 선언 +  할당
//		
//		// char[] array = null;
//		// array = {'a','b','c','d'}; -> 불가
//		
////		char[] array = null;
////		array = new char[] {'a','b','c','d'}; // -> 가능
//		
//		// 참조 배열 -> 주소를 저장 => 8byte 씩 차지...
//		String [] array = { "Hello", "World", "Good", "JAVA", "A" };
		
//		int [] array; // declaration
//		array = new int[4]; // creation
//		array[0] = 5; array[1] = 6; array[2] = 7; array[3] = 8;// assignment
//		
//		for( int i = 0; i<4 ; i++ ) {
//			System.out.print( "array["+i+"] = " + array[i] + "\t" );
//		}
//		System.out.println();
		
		String [] array = { "Hello", "World", "Good", "JAVA", "A" }; // initialization
		array[3] = "Python"; // -> index만 알면 바꿀 수 있다
		for( int i = 0; i<5; i++ ) {
			System.out.print( "array[" + i + "] = " + array[i] + "\n" );
		}
		System.out.println();
	}

}
