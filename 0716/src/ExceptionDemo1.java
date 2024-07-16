
public class ExceptionDemo1 {
	public static void main(String[] args) {
		Car matiz = new Car();
		matiz.name = "대우 마티즈";
		System.out.println( matiz.name );
		matiz = null;
		try {
			System.out.println( matiz.name );
		}catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println( e.getMessage() ); // 에러 메세지만
			//System.out.println(e); // e.toString // 에러 메세지와 Exception Type
			//e.printStackTrace(); // 가장 자세함
			System.out.println( "배열의 범위를 벗어났음.");
		}catch(NegativeArraySizeException e) {
			System.out.println( "배열의 크기는 음수이면 안됩니다." );
		}catch( RuntimeException e ) { //NullPointerException e, 부모 exception인 RuntimeExc를 사용할 수 있음
			// 단, 부모 Exception인 RuntimeExc가 자식 Exc보다 위에서 catch를 하면 에러가 발생한다 -> catch도 순서가 있음
			System.out.println( "catch!" );
		}// Multiple Catch Block
	}
}
