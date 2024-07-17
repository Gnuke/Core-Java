/*
 * Override 하지 않은 오리지날 equals()는 객체의 주소를 비교한다.
 * */
public class EqualsDemo {
	public static void main(String[] args) {
		Point original = new Point(30, 100);
		Point target = new Point(30, 100);
		
		//original == target; 주소 비교이기 때문에 불가
		original.equals(target); // equals 메소드로 비교
		System.out.println( original.equals(target) );
	}
}
class Point{
	private int x, y;
	
	public Point( int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x; this.y = y;
	}
	
	@Override
	public String toString() {
		return String.format( "(x, y) = (%d, %d)%n" , this.x , this.y );
	}
	
	@Override
	public boolean equals(Object obj) { // equals method 재정의해서 사용
		Point p = (Point)obj;
		if( this.x == p.x && this.y == p.y ) return true;
		else return false;
	}
}