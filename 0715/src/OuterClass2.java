
public class OuterClass2 {
	public static void main(String[] args) {
		OuterClass2 oc = new OuterClass2();
		oc.display();
	}
	
	void display() { // 지역변수, 클래스에 public , static 사용 불가
		int a = 5; // local variable
		class InnerClass2{ // local class
			int b = 100; // local inner class's member variable
			static int c = 500; // local inner class's static variable
			void print() {
				
			}
		}
		InnerClass2 ic = new InnerClass2(); // method 안에서는 순차적으로 진행된다.
		System.out.println( InnerClass2.c ); // static
		System.out.println( ic.b ); // member
	}
}
