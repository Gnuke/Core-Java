
public class SunjukManagement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] array = new Student[2];
		java.util.Scanner sc = new java.util.Scanner(System.in);
		for( int i = 0; i<2; i++ ) {
			array[i] = new Student(); // 학생 객체 생성
			System.out.print( "학번 : " ); array[i].hakbun = sc.next();
			System.out.print( "국어 : " ); array[i].kor = sc.nextInt();
			System.out.print( "영어 : " ); array[i].eng = sc.nextInt();
			System.out.print( "수학 : " ); array[i].math = sc.nextInt();
			
			array[i].total = array[i].kor + array[i].eng + array[i].math;
			array[i].avg = array[i].total / 3.0;
			
		}
		for( int i = 0; i<2; i++) {
			System.out.printf( "%10s\t%5d\t%5d\t%5d\t%5d\t%.1f\n", 
					array[i].hakbun, array[i].kor, array[i].eng, array[i].math,
					array[i].total, array[i].avg );
		}
	}

}
