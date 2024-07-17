import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		String [] array = {"한지민","박지민","홍지민","한지민","박지민","홍지민","신지민", "곽지민" };
		Queue<String> queue = new LinkedList<String>();
		for( String elements : array ) {
			queue.add(elements);
		}
		System.out.println( queue );
	}
}
