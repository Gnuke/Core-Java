
public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	void change() {}
//	void change( int a ) {}
//	void change( double a ) {}
//	void change( short a ) {} // return type은 영향을 주지않는다. 오직 parameter로만 구별
	
	//void change( int a ) {}
	//void change( int b ) {}
	//void change( int c ) {} -> overloading이 아님
	
	void change() {}
	void change( int a ) {}
	void change( int a, short b ) {}
	void change( int a, short b, char c) {} // parameter 개수가 달라도 됨
}
