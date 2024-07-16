
public class WrapperDemo {
	public static void main(String[] args) {
		// java 1.5 이전
		//int su = 5; // stack에 있는 5
		//Integer in = new Integer(su); // Heap에 있는 5 -> Wrapping, Boxing
		
		//int another = Integer. // Unwrapping, unboxing
		//---------------------------------------------------------------------------------
		int su = 5;
		Integer in = su * 100; // Auto Boxing
		int another = in; // Auto Unboxing
		
		System.out.println( another );
	}
}
