
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 값 입력(초 단위) : ex) 3601
		// 3601초는 1시간 1초입니다. -> 출력
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print( "값 입력(초 단위) : " );
		int seconds = sc.nextInt();
		System.out.printf( "%d초는 %d시간 %d분 %d초입니다.", seconds,  seconds/3600, seconds%3600/60, seconds%3600%60  );
	}

}
