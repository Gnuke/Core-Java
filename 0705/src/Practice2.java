
public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BMI 지수 계산 ( 입력 - 이름 : , 신장(cm) : , 몸무게(kg) : )
		// ex) ~님은 BMI지수 23.1이고 비만 전단계 입니다.
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print( "이름 : " );
		String name = sc.nextLine();
		
		System.out.print( "신장(cm) : " );
		double height = sc.nextDouble();
		
		System.out.print( "몸무게(kg) : " );
		double weight = sc.nextDouble();
		
		double heightMeters = height / 100.0; // cm를 m로 변환
		
		double bmi = weight/(heightMeters*heightMeters);
		
		if( bmi < 18.5 ) {
			System.out.printf( "%s님은 BMI 지수 %.1f이고 저체중입니다." , name, bmi );
		} else if( bmi >= 18.5 && bmi <= 22.9 ) {
			System.out.printf( "%s님은 BMI 지수 %.1f이고 정상입니다." , name, bmi  );
		} else if( bmi >= 23 && bmi <= 24.9 ) {
			System.out.printf( "%s님은 BMI 지수 %.1f이고 비만전단계입니다." , name, bmi  );
		} else if( bmi >= 25 && bmi <= 29.9 ) {
			System.out.printf( "%s님은 BMI 지수 %.1f이고 1단계 비만입니다." , name, bmi  );
		} else if( bmi >= 30 && bmi <= 34.9 ) {
			System.out.printf( "%s님은 BMI 지수 %.1f이고 2단계 비만입니다." , name, bmi  );
		} else {
			System.out.printf( "%s님은 BMI 지수 %.1f이고 3단계 비만입니다." , name, bmi  );
		}
		
		sc.close();
	}

}
