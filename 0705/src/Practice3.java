
public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 ~ 100까지 자연수 중 4의 배수는 몇개인가
		
//		int i = 1;
//		int count = 0;
//		
//		for(;i<=100;) {
//			if( i%4 == 0 ) {
//				count++;
//			}
//			i++;
//		}
//		
//		System.out.printf( "갯수는 : %d개\n" , count );
		
		//윤년 계산
		// 400마다 윤년, 4로 나눴을 때 딱 떨어지지만 100으로 나눴을 때 떨어지지 않는다.
		
		int i = 0;
		int count = 0;
		
		for(;i<=2024;i++) {
			if( i%400 == 0 ) {
				count++;
			} else if( i%4==0 && i%100 > 0){
				count++;
			}
		}
		
		System.out.printf( "2024년 까지 윤년의 개수는 : %d개\n", count );
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.print( "Year : " );
//		int year = sc.nextInt();
//		
//		if(year%400 == 0 || (year%4 == 0 && year%100 != 0)) {
//			System.out.println( "윤년입니다." );
//		} else {
//			System.out.println( "윤년이 아닙니다." );
//		}
		
	}

}
