//import kr.seoul.sesac.util.libs.Finance;
//import kr.seoul.sesac.util.libs.HumanResource;
//FQN : Fully Qualified Name( 전체 경로 )
import kr.seoul.sesac.util.libs.*;

public class Main{
	public static void main( String [] args ){
		Finance f = new Finance();
		HumanResource hr = new HumanResource();
		System.out.println( f.money );
		System.out.println( hr.salary );
	}	
}
