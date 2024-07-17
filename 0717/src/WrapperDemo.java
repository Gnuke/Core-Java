
public class WrapperDemo {
	public static void main(String[] args) {
//		int su = 5;
//		Integer in = new Integer(su); // Wrapping, Boxing
//		int another = in.intValue(); // Unwrapping, Unboxing
//		System.out.println( another );
		
		// After JDK 1.5
		int su = 5;
		Integer in = su * 100; // Autoboxing
		
		int another = in;	// in.intValue() 생략 되어 있는 것, Autounboxing
		System.out.println( another );
	}
}
