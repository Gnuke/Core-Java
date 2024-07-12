
public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base parent = new Derived(); parent.display();
	}

}

//public > protected > (default) > private
/* 
 * Override 된 자식 메소드의 접근 범위는 부모 메소드보다 같거나 더 넓어야 한다. 
 */
class Base{
	public void display() { System.out.println( "나는 부모 메서드" ); }
}

class Derived extends Base{
	@Override
	 //void display() { System.out.println( "나는 자식 메서드" ); }
	public void display() { System.out.println( "나는 자식 메서드" ); }
}