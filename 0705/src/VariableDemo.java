
public class VariableDemo {

	int eng = 100; // method 밖, static X -> instance variable
	static int math = 80; // static O -> class variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 3가지 이유 - 목적과 생성 위치가 다르기 때문
		int kor = 90; // local variable -> main이 실행되며 생성
		System.out.printf( "수학 점수 = %d\n", math);
		System.out.printf( "국어 점수 = %d\n", kor);
		//System.out.printf( "영어 점수 = %d\n", eng);
		
		VariableDemo vd = new VariableDemo();
		System.out.printf( "영어 점수 = %d\n", vd.eng);
		
		Demo d = new Demo();
		System.out.printf( "Demo 영어점수 = %d\n", d.eng );
	}

}

class Demo{
	static int math = 70; //class variable
	int eng = 50;
}