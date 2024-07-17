//import java.util.Vector;
//public class GenericDemo1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		Object obj = "Hello";
////		java.util.Vector<Object> v1 = new java.util.Vector<String>(); // Generic 끼리는 형변환이 안됨
//		
//		//java.util.Vector v1 = new java.util.Vector(); // Type Eraser -> <>를 사용하지 않아도 error가 발생하지 않는다. raw type
//	
////		Vector<String> v1 = new Vector<String>();
////		v1.add(5); // error 발생
//		
////		Vector<?> v1 = new Vector<?>(); // wildcard type 상한선 하한선 설정 위한 super와 extend 필요
////		v1.add(5);
//		
////		Product<Integer> pencil = new Product<Integer>(1000);
////		Product<Double> ballpen = new Product<Double>(100.0);
////		Product<Object> obj = new Product<Object>( new Car() );
//		
//		//Car<Object> car1 = new Car<Integer>(1000); // -> 안됨
//		Car<?> car = new Car<Integer>(1000); // <?>를 Object로 판단 -> 가능
//		//Object obj = car.getPrice(); 너무 권한이 넓으니
//		//Car<? extends Number> car1 = new Car<Double>(10.0); -> 하한선
//		Car<? super Number> car2 = new Car<Object>(1000); // -> 상한선
//		//Car<? super Number> car3 = new Car<Integer>(1000); // -> 불가
//		
//		//car2.getP
//		//super인 경우에는 실체형을 따라가고, extends인 경우에는 선언형을 따라간다. ?는 Object형을 따라간다.
//	}
//
//}
////class Product<T extends Number>{
////class Product<T extends Number>{
////	private T price;
////	
////	public Product(T price) {
////		this.price = price;
////	}
////	@Override
////	public String toString() {
////		return String.valueOf(price);
////	}
////}