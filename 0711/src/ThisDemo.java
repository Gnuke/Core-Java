// this의 3가지 용법
/*
 * 1. this. :나의 주소
 * 2. this : 나
 * 3. this() : 나의 생성자
 */
public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this ->  객체 자기 자신을 가리킴
		
		Car sonata = new Car();
		sonata.setName( "현대 소나타" );
		sonata.setPrice( 30_000_000 );
		
		System.out.println( "이름은 : " + sonata.getName() );
		
		Car matiz = sonata.clone(); // 주소 복사
		
		System.out.println( matiz.getName() );
	}

}
