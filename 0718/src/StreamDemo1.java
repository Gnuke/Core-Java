import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamDemo1 {
	public static void main(String[] args) {
		DoubleStream ds = new Random().doubles( 3L, 1.0, 10.0 );
		ds.forEach( d -> System.out.print( d + " , " ) );
		
		System.out.println( "-----------------------------");
		//IntStream.range(0, 0) 중간연산
		int result = IntStream.rangeClosed(1, 100).sum(); //최종연산
		System.out.println( result );
	}
}
