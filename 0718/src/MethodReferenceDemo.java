// Method Reference

@FunctionalInterface
interface MyPolygon{
	double radianToDegree( double value );
}

public class MethodReferenceDemo {
	public static void main(String[] args) {
		MyPolygon mp = (radian) -> Math.toDegrees(radian); // lambda expression
		
		double result = mp.radianToDegree(1);
		System.out.println( result );
		
		MyPolygon mp1 = Math::toDegrees; // 메소드 참조
		// lambda expression에서 사용하는 메소드의 구현부가 특정 클래스에서 단 하나의 메소드만 사용한다는 것을 보장한다면 
		// 메소드 참조 사용 가능 -> 클래스명 :: 메소드명;
		double result1 = mp.radianToDegree(1);
		System.out.println(result1);
	}
}
