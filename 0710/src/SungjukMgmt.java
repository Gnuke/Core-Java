
public class SungjukMgmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student younghee = new Student();
		//CallbyRefDemo1 d = new CallbyRefDemo1();
		
		new Input().input(younghee);
		//System.out.println( "영희의 국어점수 : " + younghee.kor ); -> 확인
		
		new Calc().calc(younghee);
		
		new Output().output(younghee);
	}

}
