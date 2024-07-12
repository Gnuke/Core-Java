// Overshadow 변수와 Override Method는 상속되지 않는다
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Mamal m = new Mamal(); m.display(); -> 상속 아님
		
//		Horse h = new Horse(); //h.display(); // 상속
//		
//		System.out.println( h.toString() );
	}

}

//class Mammal{
//	public void display() {
//		System.out.println( "나는 포유류" );
//	}
//}
//
//class Horse extends Mammal{
//	@Override
//	public String toString() {
//		return "나는 제주말입니다";
//	}
//	
//	@Override
//	public void display() {
//		super.display(); // 부모의 display() 호출
//		System.out.println( "나는 제주말" );
//	}
//}