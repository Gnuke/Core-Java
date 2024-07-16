
public class ExceptionDemo3 {
	public static void main(String[] args) /* throws HistoryException */ {
		Student chulsu = new Student(); 
		chulsu.setKor(80); // Exception이 발생하면 바로 catch로 넘어가기 때문에 try block 안의 나머지 라인은 실행하지 않음
		try {
			chulsu.setHistory(110);
		} catch (HistoryException e) {
			// TODO Auto-generated catch block
			System.out.println( e.getMessage() );  
		}
		System.out.println( chulsu ); // shulsu.toString()
		
	}

}

class HistoryException extends Exception{ // Checked Exception
	public HistoryException( String msg ) {
		super(msg);
	}
}

class KoreanException extends RuntimeException{ // 직접 만든 RuntimeException, Unchecked Exception
	public KoreanException( String msg ) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}

class Student{
	private int kor;
	private int history;
	
	public void setHistory( int history ) throws HistoryException{
		if( history >= 0 && history <= 100 ) this.history = history;
		else throw new HistoryException( "역사점수는 0 부터 100점까지의 범위만 인정합니다." );
	}
	
	public void setKor( int kor ) throws KoreanException{
		if( kor >= 0 && kor <= 100 ) this.kor = kor;
		else throw new KoreanException( "국어점수는 0 부터 100점까지의 범위만 인정합니다." );
	}
	
	@Override
	public String toString() {
		return "kor = " + this.kor + " , history = " + this.history;
	}
}