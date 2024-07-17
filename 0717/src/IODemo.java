import java.io.IOException;
import java.io.InputStream;

public class IODemo {
	public static void main(String[] args) {
		System.out.print( "글자 한 개를 입력하세요 : " );
		
		InputStream is = System.in;
		int code = 0;
		
		try {
			code = is.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println( "ASCII code = " + code ); 
		System.out.println( "ASCII code = " + (char)code ); // 한글자만 입력 가능, 한글은 지원 x
		
	}
}
