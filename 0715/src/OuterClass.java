// member inner class
public class OuterClass {
	public static void main(String[] args) {
		//System.out.println( a ); // 멤버변수
		//InnerClass ic = new InnerClass(); // 멤버클래스 둘 다 주소로 접근한다
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass(); // oc 라는 바깥 클래스의 주소가 먼저 필요함
		
		System.out.println( ic.c );
		System.out.println( InnerClass.d ); // static
	}
	
	private int a = 5; // outer class's member variable
	private static int b = 10; // outer class's static variable
	
	private class InnerClass{ // member inner class
		private int c = 100; // inner class's member variable
		private static int d = 500; // inner class's static variable
		
		public void display() { // inner class's member method
			System.out.println( a + "," + b + "," + c + "," + d );
		}
		
		public static void print() {
			System.out.println( b + "," + d ); // inner class's static method -> static은 멤버변수에 접근 안된다
		}
	}
}
