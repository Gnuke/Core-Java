
public class VariableDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print( "국어 점수 : " );
		String kor = sc.nextLine(); // "입력값" -> 입력값
		int ko = Integer.parseInt(kor);
		
		System.out.print( "수학 점수 : " );
		String math = sc.nextLine(); // "입력값" -> 입력값
		int mat = Integer.parseInt(math);
		
		System.out.println( ko + mat );
	}

}
