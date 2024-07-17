import java.util.Date;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class MapDemo {
	public static void main(String[] args) {
		Date now = new Date();
		String nowStr = now.toString(); // Wed Jul 17 15:37:16 KST 2024
		
		//문자열 Parsing 방법 3가지
		// 1. String class의 split method		String [] array = split(String regex)
		// 2. Scanner class's useDelemeter()		new Scanner(문자열).useDelemeter(String regex)
		// 3. StringTokenizer class
		
		StringTokenizer st = new StringTokenizer( nowStr ); // spacebar 기준으로 잘라줌
		String [] array = new String[st.countTokens()];
//		while( st.hasMoreTokens() ) {
//			//System.out.println( st.nextToken() );
//		}
		for( int i = 0; i<array.length; i++) {
			array[i] = st.nextToken();
		}
		System.out.print( "오늘은 " + array[5] + "년 " ); //+ array[1] + "월 " + array[2] + "일 입니다." );
		System.out.println( getMonthbyName(array[1]) + "월 " + array[2] + "일입니다." );
		
	} // main
	
	static int getMonthbyName( String month ) {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put( "Jan", 1); ht.put( "Feb", 2); ht.put( "Mar", 3); ht.put( "Apr", 4); ht.put( "May", 5);
		ht.put( "Jun", 6); ht.put( "Jul", 7); ht.put( "Aug", 8); ht.put( "Sep", 9); ht.put( "Aug", 10);
		ht.put( "Nov", 11); ht.put( "Dec", 1); // ht.put( K, V )
		
		return ht.get(month);
	}
	
}
