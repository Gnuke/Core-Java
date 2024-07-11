
public class Employee {
	String sabun;
	double salary;
	
	public Employee() {
		//this.sabun = null; this.salary = 0.0;
		//System.out.println("");
		this( "UnsettedSabun", 10_000_000 );
	}
	
	public Employee(String sabun) {
		//this.sabun = sabun;
		this( sabun, 10_000_000 );
	}
	
	public Employee(double salary) {
		//this.salary = salary;
		this( "UnsettedSabun", salary );
	}
	
	public Employee(String sabun, double salary) {
		this.sabun = sabun;
		this.salary = salary;
	}
}
