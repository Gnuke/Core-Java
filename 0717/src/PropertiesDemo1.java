import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties info = new Properties();
		info.load( new FileInputStream( new File("productinfo.properties") ) ); //file 이 properties로 들어감
		System.out.println( "나이 = " + info.getProperty( "age" ) ); // key 값을 이용해 찾아옴
		System.out.println( "사는 곳 = " + info.getProperty( "city" ) );
	}
}
