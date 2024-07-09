import java.io.File;

public class SungjukMgmt1 {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		Student [] stdArray = new Student[3]; // 앞으로 학생들의 정보가 저장될 공간 확보
		java.util.Scanner sc = new java.util.Scanner( new java.io.File("sungjuk.dat") );
		for( int i = 0; i<3; i++) {
			stdArray[i] = new Student(); // 여기서 학생 주소 생성
			
			String line = sc.nextLine(); // 2024-001	한지민	100	80	70
			
			// Parsing
			//	String [] array = line.split( "\s+" ); // \s+ -> 정규식 종류
			String [] array = line.split( "\\s+" ); // \s만 사용하면 특정 문자로 오해할 수 있으므로 \\s 사용
			// "2024-001"	"한지민"	"100" 	"80"	"70"
			
			stdArray[i].hakbun = array[0].trim(); // 학번 .trim( ): 공백제거
			stdArray[i].name = array[1].trim(); // 이름
			
			stdArray[i].kor = Integer.parseInt( array[2].trim() ); // 국어
			stdArray[i].eng = Integer.parseInt( array[3].trim() ); // 영어
			stdArray[i].math = Integer.parseInt( array[4].trim() ); // 수학
		}
		int j = 0;
		while( j<3 ) {
			System.out.printf( "%10s\t%10s\t%5d\t%5d\t%5d%n" , 
					stdArray[j].hakbun, stdArray[j].name, stdArray[j].kor,
					stdArray[j].eng, stdArray[j].math );
			j++;
		};

		sc.close();
	}

}
