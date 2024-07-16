
public class EnumDemo {
	public static void main(String[] args) {
		//Season season = new Season(); // 앞에 public static final이 생략, 나열형은 숫자형으로 바뀌지 않는다.
		Season season = Season.fall;
		//System.out.println( season );
		//System.out.println( season.ordinal() );
		System.out.println( season.getValue() );
	}
}
