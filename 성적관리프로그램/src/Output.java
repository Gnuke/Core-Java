
public class Output {
	private Student [] array;//field
	public Output(Student[] array) {
		// TODO Auto-generated constructor stub
		this.array = array;
	}

	void output() {
		for( Student std : this.array ) {
			System.out.println( std ); // std.toString();
		}
	}
	
}
