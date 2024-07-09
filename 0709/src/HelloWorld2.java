// 동일 클래스에 있는 멤버 변수는 반드시 해당 클래스를 생성해서 그 주소로 접근해야 한다.
public class HelloWorld2 {
	String str = "Hello, World"; // member | instance
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "Hello, World"; // local | stack | temporary | auto variable
		//HelloWorld2 hw = str;
	}

}
