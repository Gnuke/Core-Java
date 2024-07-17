import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateTimeDemo {
	public static void main(String[] args) {
//		Date now = new Date();
//		System.out.println( now ); // now.toString();
		
		//Calendar cal = new Calendar(); // Calendar는 추상클래스이기 때문에 new를 사용할 수 없다.
//		Calendar cal = Calendar.getInstance();
//		System.out.printf( "오늘은 %d년 %d월 %d일입니다. %n",
//				cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, 
//				//cal.get(Calendar.DATE));
//				cal.get(Calendar.DAY_OF_MONTH));
		
//		Calendar cal = new GregorianCalendar( 2024, 11, 25 );
//		System.out.printf( "금년은 %d년%n", cal.get(Calendar.YEAR) );
		
//		DateFormat df = DateFormat.getDateTimeInstance( 
//				DateFormat.FULL, DateFormat.MEDIUM, Locale.FRENCH ); // 날짜와 시간 모두 가져옴
//		System.out.println( df.format( new Date() ) );
		
//		String pattern = "오늘은 yyyy년 MM월 dd일입니다.";
//		DateFormat df = new SimpleDateFormat( pattern ); // pattern을 넣을 수 있음
//		System.out.println( df.format( new Date() ) );
		
		String pattern = String.format( "오늘은 %1$tY년 %1$tm월 %1$td일입니다." , new Date() ); //1$ 첫 번째 값을 가져다 씀 두 번째는 2$ ...
		System.out.println( pattern );
		System.out.printf( "오늘은 %1$tY년 %1$tm월 %1$td일입니다.2" , new Date() );
	}
}
