
public class SungjukManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student chulsu = new Student(); // 참조형 = 8byte
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String y_n = null;
		
		do {
			System.out.print( "학번 : " );
			chulsu.hakbun = sc.next(); //nextLine()은 입력 시 enter가 따라 입력됨
			
			System.out.print( "국어 : " );
			chulsu.kor = sc.nextInt();
			System.out.print( "영어 : " );
			chulsu.eng = sc.nextInt();
			System.out.print( "수학 : " );
			chulsu.math = sc.nextInt();
			
			// 총점
			chulsu.total = chulsu.kor + chulsu.eng + chulsu.math;
			
			// 평균
			chulsu.avg = chulsu.total / 3.0;
			
			// 평점
			chulsu.grade = '\0'; // NULL 값
			switch( (int)(chulsu.avg/10) ) {
				case 10: case 9: chulsu.grade = 'A'; break;
				case 8: chulsu.grade = 'B'; break;
				case 7: chulsu.grade = 'C'; break;
				case 6: chulsu.grade = 'D'; break;
				default:	chulsu.grade = 'F';
			}
			
			System.out.printf( "%10s\t%5d\t%5d\t%5d\t%5d\t%.1f\t%3c\n", chulsu.hakbun, chulsu.kor, chulsu.eng, 
					chulsu.math, chulsu.total, chulsu.avg, chulsu.grade );
			
			System.out.print( "Again(Y/N) : " );
			y_n = sc.next();
		}while( y_n.equals( "Y" ) || y_n.equals( "y" ) );
		
		System.out.println( "Program is over" );
		sc.close();
	}

}
