/* 파일의 이름은 반드시 클래스 이름으로, 한 파일에는 하나의 클래스만 넣고 퍼블릭으로 */
public class HelloWorld {
	public static void /* return type, 정적변수 선언,ㅅ void -> 무치형 */ main( String [] args ){
		java.util.Scanner sc = new java.util.Scanner(System.in); // 초기화
		System.out.print( "당신의 이름은? : " );
		String name = sc.nextLine();
		System.out.printf( "이름은 %s 입니다. \n", name );
	}	// main 함수
}