import java.util.Arrays;
import java.util.List;

public class LambdaDemo8 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList( "사과", "배", "딸기", "복숭아", "레몬", "망고", "수박" );
		
		// list에 저장된 각 element를 iterate해서 출력하기
		
		// 1st 방법
		for(int i = 0; i < list.size(); i++ ) {
			System.out.print( list.get(i) + "," );
		}
		System.out.println();
		
		// 2nd 방법
		for( String str : list ) System.out.print("2." + str + "," );
		System.out.println();
		
		// 3rd 방법
		list.forEach( str -> System.out.print( "3." + str + ",") );
	}
}
