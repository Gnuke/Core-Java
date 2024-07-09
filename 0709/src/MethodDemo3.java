
public class MethodDemo3 {

	public static void main(String[] args) {
		MethodDemo3 md = new MethodDemo3();
		md.print();
	}
	
	String print() { // member method
//		System.out.println( "Hello" );
//		return "aa"; // return으로 method가 완료됐기 때문에
//		System.out.println( "Hello" ); // unreachable error 발생
		// 사용하려면
		int su = 5;
		System.out.println( "hello" );
		if( su % 2 ==0 ) return "aaa";
		else {
			System.out.println("Hello, World");
			return "bbb";
		}// 가능
	}
}
 