
public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 65; // i initialization
//		for(;i<=90;) {
////			int j = 0;// j initialization
////			for(; i-j == 0;) {
////				System.out.print( (char)i );
////				j++;
////			}
//			System.out.println( (char)i );
//			i++;
//		}
		int i = 1;
		for( ;i<=26; ) {
			int j = 1;
			for(;j <= i;) {
				System.out.print((char)(j+64));
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}
