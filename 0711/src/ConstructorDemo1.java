
public class ConstructorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate today =  new MyDate();
		
		System.out.println( today.year );
	}

}

class MyDate {
	int year, month, date;
	public MyDate() { // default constructor's overriding
		this.year = 2024; this.month = 7; this.date = 11;
	}
}