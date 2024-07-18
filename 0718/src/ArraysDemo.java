import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
	public static void main(String[] args) {
		//List<Integer> list = Arrays.asList(4,5,6,7,8,1,2);
		//Arrays.asList( "한지민", "박지민", "홍지민", "김지민" );
		
		int [] array = {1,8,3,1,5,9,5,7,0};
		Arrays.sort(array);
		
		for( int a : array ) System.out.print( a + "," );
	}
}
