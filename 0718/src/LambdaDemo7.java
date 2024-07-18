/*
 * Collection Framework와 Lambda Expression
 * */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo7 {
	public static void main(String[] args) {
		//List<Integer> list = Arrays.asList(4,7,1,2,9,3,5,8);
		List<String> list = Arrays.asList( "한강", "두만강", "낙동강", "압록강", "영산강", "금강" );
		
		// 1st Way
//		Collections.sort( list, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer front, Integer back) {
//				// TODO Auto-generated method stub
//				return front - back; // 오름차순 , Ascending sort
//				//return back - front; // 내림차순 , Descending sort
//			}
//		});
		
		
		// 2nd Way
		Collections.sort( list, ( front, back) -> 
				// TODO Auto-generated method stub
				//front - back // 오름차순 , Ascending sort
				//back - front // 내림차순 , Descending sort
				
		// 문자열 배열
				front.compareTo(back)
		);
		
		System.out.println( list );
	}
}
