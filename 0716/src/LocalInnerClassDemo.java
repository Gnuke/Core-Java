
public class LocalInnerClassDemo {
	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		out.display();
	}
}
class OuterClass{
	private int a = 5; // OuterClass's member variable
	private static int b = 10; // Outer class's static variable
	
	public void display() {
		int c = 100; // local variable
		class InnerClass{
			public void print() {
				System.out.println(c);
				//c = 1000; // InnerClass가 사라지지
			}
		}
		InnerClass ic = new InnerClass();	ic.print();
	}
}