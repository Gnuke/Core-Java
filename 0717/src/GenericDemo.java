//
//public class GenericDemo {
//	public static void main(String[] args) {
////		Car carnival = new Car(40_000_000);
////		carnival.setPrice( 45_000_000 );
////		
////		System.out.println( carnival ); //carnival.toString()
//		
//		Car<Integer> car = new Car<Integer>(45_000_000);
//		System.out.printf( "price = %d%n", car.getPrice() );
//		
//		Car<String> matiz = new Car<String>("10000000");
//		System.out.printf( "price = %s%n", matiz.getPrice() );
//		
//		Car<Double> sonata = new Car<Double>( 45_000_000.0 );
//		System.out.printf( "price = %.1f%n", sonata.getPrice() );
//		
//	}
//}
//class Car<T, U, V>{ // < 대문자 한 글자 > : 정수만 받지 않음을 명시 / Generic type // generic 변수의 수 만큼 제네릭으로 생성해줘야한다.
//	private T price;
//	private U name;
//	private V maker;
//	// 생성자도 그만큼 생성
//	
//	public Car(T price) {
//		this.price = price;
//	}
//
//	public T getPrice() {
//		return price;
//	}
//
//	public void setPrice(T price) {
//		this.price = price;
//	}
//
//	@Override
//	public String toString() {
//		return String.format("Car [price=%s]", price);
//	}
//	
//}