//4. 부모 생성자는 상속되지 않는다.
// 자식 생성자는 반드시 부모의 기본생성자만 호출한다.
// super()는 자식 생성자에서 임의로 부모 생성자를 호출할 때 사용한다.
// 반드시 생성자 안에서만 사용해야 하고, 생성자 안에서 반드시 첫번째 위치해야 한다.
public class InheritanceDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sonata sonata = new Sonata( "EF Sonata", 30_000_000);
	}

}

class Car{
	String name;
//	int price;	
//	public Car( String name, int price ) { 
//		this.name = name; this.price = price;
//		} 기본 생성자가 아님
	public Car( String name ) { this.name = name; }
}

class Sonata extends Car{
//	String name;
	int price;
	//public Sonata() { System.out.println( "나는 자식의 생성자" ); }
//	public Sonata( String name, int price ) { //super(name, price); } 부모의 기본 생성자가 아닌 다른 생성자를 호출할 때는 super() method를 사용
//		
//	}
	//public Sonata( int price ) { this.price = price; }
	public Sonata( String name, int price ) {
		super( name );
		this.price = price;
	}
}
