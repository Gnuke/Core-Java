
public class VariableArgumentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableArgumentDemo vad = new VariableArgumentDemo();
		
		//int a = 5, b = 10, c = 20; method에서 int A, B, C로 받음
		//int [] array = { 3,4,5 }; method에서 int [] A로 받음
		int a = 5; char b = 'B'; boolean c = true;
		double avg = 89.5; String name = "한지민";
		
		vad.change( a,b,c,avg,name ); // argument : 인자(수)
	}
	
	void change( Object ... A ) { // parameter : 매개변수 int ... A -> 반드시 . 3개 사용
		System.out.println( A.length );
//		for( Object su : A ) {
//			System.out.println( su );
//		}
		
	}
	
}
