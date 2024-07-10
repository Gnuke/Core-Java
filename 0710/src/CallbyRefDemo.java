
public class CallbyRefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallbyRefDemo d= new CallbyRefDemo();
		int money = 10000;
		String name = "한지민";
		
		System.out.printf( "before  money = %d, name = %s\n", money, name );
		d.change(money, name);
		
		System.out.printf( "after  money = %d, name = %s\n", money, name );
	}

	void change( int su, String str) {// call by value
		su *= 5;
		str = "김지민";
		
		System.out.printf( "In change su() = %d, str = %s\n", su, str );
	}
}
