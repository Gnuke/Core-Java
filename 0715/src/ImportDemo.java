//import kr.seoul.sesac.util.libs.*;
import com.example.libs.Car;

public class ImportDemo extends Car{
	public static void main(String[] args) {
//		Finance f = new Finance();
//		HumanResource hr = new HumanResource();
//		
//		System.out.println( f.money );
//		//System.out.println( hr.sa);
		
//		com.example.libs.Car sonata = 
//				new com.example.libs.Car();
		Car sonata = new Car();
		System.out.println( sonata.name );
		
		ImportDemo id = new ImportDemo();
		System.out.println( id.name );
	}
}
