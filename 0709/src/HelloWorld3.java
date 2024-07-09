// 다른 클래스에 있는 스태틱 변수는 속해있는 클래스 이름으로 접근한다.
public class HelloWorld3 {
	String str = "Hello, World"; // member | instance
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "Hello, World"; // local | stack | temporary | auto variable
		System.out.println( Demo.str );
	}

}

class Demo{
	static String str = "Hello, World"; // class | static variable
}
