import java.util.Enumeration;
import java.util.Vector;

public class CollectionDemo {
	public static void main(String[] args) {
		String [] array = {"한지민","박지민","홍지민","한지민","박지민","홍지민","신지민", "곽지민" };
//		Set<String> set = new HashSet<String>();
//		
//		for( String elements : array ) {
//			set.add(elements);
//		}
//		
//		// bulk로 데이터를 추출하고자 할 때, Enumeration과 Iterator를 사용한다
//		
//		Iterator<String> iters = set.iterator(); // set 계열에서 추출할 때
//		while(iters.hasNext()) { // 언제 끝날 지 모르기 때문에 while 사용
//			System.out.print( iters.next() + "," );
//		}
		
		Vector<String> vector = new Vector<String>();
		for( String elements : array ) {
			vector.add(elements);
		}
		Enumeration<String> enums = vector.elements();
		
		while(enums.hasMoreElements()) {
			System.out.print( enums.nextElement() + "," );
		}
		
	}
}
