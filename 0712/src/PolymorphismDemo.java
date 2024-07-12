/*
 * 다형성 
 * 1. 객체 형변환
 * 		1) 자동 형변환 Implicit conversion, promotion
 * 		-> 자식 객체가 부모 객체로 형변환 할 때
 * 		2) 강제형변환 Explicit conversion, demotion
 * 		-> 부모 객체가 자식 객체로 형변환 할 때, 단 Instanceof 연산자가 true를 리턴할 때에만
 * 2. Override method
 */
public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int su = 5;
//		long lo = su; // 자동 형변환
//		double avg = su; // 자동 형변환 Implicit conversion, promotion
//		
//		short sh = (short)avg; // 강제형변환 Explicit conversion, demotion
		
		Test t = new Test();
		Demo d = new Demo();
		
		//t = (Test)d;
		if( t instanceof Demo  ) {
			d = (Demo)t; // 부모는 자식으로 형변환 되지 않음
			System.out.println( "변형O" );
		} else {
			System.out.println( "변형X" );
		}
	}

}

class Test{}
class Demo extends Test{}