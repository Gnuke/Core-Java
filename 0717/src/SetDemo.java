// Set은 중복을 허용하지 않는다.

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		String [] array = {"한지민","박지민","홍지민","한지민","박지민","홍지민","신지민", "곽지민" };
		Set<String> hashset = new HashSet<String>();
		Set<String> treeset = new TreeSet<String>();
		
		for(String elements : array) {
			hashset.add(elements); treeset.add(elements);
		}
		
		System.out.println( hashset );
		System.out.println( "나는 treeset : " + treeset );
	}
}
