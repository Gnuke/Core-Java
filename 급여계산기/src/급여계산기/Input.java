package 급여계산기;

public class Input {
	private java.util.Scanner sc;
	private java.util.Scanner sc1;
	private Person [] array;
	
	public Input(Person[] array) {
		this.array = array;
		this.sc = new java.util.Scanner(System.in);
		this.sc1 = new java.util.Scanner(System.in);
	}
	
	void input() {
		int i = 0;
		int count = 0;
		for( ; i < array.length; i++ ) {
			System.out.println( "사원번호 : " ); int id = this.sc.nextInt();
			System.out.println( "급 : " ); int grade = this.sc.nextInt();
			System.out.println( "호 : " ); int ho = this.sc.nextInt();
			System.out.println( "수당 : " ); int money = this.sc.nextInt();
			this.array[i] = new Person(id, grade, ho, money);
			
			count++;
			
			// 입력 출력 더 하는지 안하는지
			System.out.println( "입력/출력(I/O)? : " ); String i_o = sc1.next().toLowerCase();
			if( i_o.equals("i") ) {
				continue;
			} else if( count > 4 ) {
				System.out.println( "5명 이상의 정보를 넣을 수 없습니다" );
			}
		}
		
		//검사
		for( ; i<array.length; i++) {
			System.out.println( array[i].toString() );
		}
	}
}
