// List : 중복 허용, index로 접근

import java.util.Vector;

public class ListDemo {
	public static void main(String[] args) {
		String [] array = {"한지민","박지민","홍지민","한지민","박지민","홍지민","신지민", "곽지민" };
		
//		List<String> list = new ArrayList<String>(); // 방 10개 생성 -> default
//		//	List<String> list = new ArrayList<String>(5); -> 방 5개 생성
//		for( String elements : array ) {
//			list.add(elements);
//		}
//		System.out.println( "현재 방의 개수는 : " + list.size() );
//		System.out.println( list );
//		list.remove(0);
//		System.out.println("remove 이후 : " + list );
//		System.out.println( "1번은 누구 ? : " + list.get(1) ); // index로 접근
		
		//Vector<String> vector = new Vector<String>(); // 증가량도 지정할 수 있다.
		//Vector<String> vector = new Vector<String>(5,3); // 6번째 방으로 들어갈 때 공간을 +3 (8번방까지 생성)
		Vector<String> vector = new Vector<String>(1,1);
	}
}
