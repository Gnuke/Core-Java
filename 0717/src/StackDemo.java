import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		String [] array = {"한지민","박지민","홍지민","한지민","박지민","홍지민","신지민", "곽지민" };
		Stack<String> stack = new Stack<String>();
		
		for( String elements : array ) {
			stack.push(elements);
		}
		
//		System.out.println( "1 " + stack.peek() );
//		System.out.println( "2 " + stack.peek() );
//		System.out.println( "3 " + stack.peek() ); // peek()은 자료를 뽑아내지 않음
		
//		System.out.println( "1 " + stack.pop() );
//		System.out.println( "2 " + stack.pop() );
//		System.out.println( "3 " + stack.pop() ); // pop()은 자료를 뽑아냄 - empty까지
		
		while( stack.empty() ) { stack.pop(); }
	}
}
