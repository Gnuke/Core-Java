
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car sonata = new Car();
//		System.out.println( sonata.name);
//		System.out.println( sonata.price);
		
		//Product p = new Product(); 
		// -> error : 기본생성자는 다른 생성자가 있다면 자동으로 만들어지지 않는다.
		Product pencil = new Product( "모나미 연필", 1_000, "모나미社" );
		Product computer = new Product( "노트북", 2_500_000, "LG Gram");
		Product tv = new Product( "텔레비전", 30_000_000,"삼성전자" );
	}

}
