
public class InitializationBlock {
	private double weight; // member variable
	private char grade; // member variable
	{
		this.weight = 100.0;
		this.grade = 'F';
		System.out.println( "Initialization Block");
	}// Initialization Block
	
	public InitializationBlock() { // default constructor's overriding
		this.weight = 62.4;
		this.grade = 'C';
	}
	
	public static void main(String[] args) {
		InitializationBlock jimin = new InitializationBlock();
		System.out.println("Constructor");
		System.out.println( jimin.weight + "kg" );
		System.out.println( jimin.grade );
	}
}
