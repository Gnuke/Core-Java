
public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [][] array; // 2차원 배열 선언
		//array = new int[4][3]; // 2차원 배열의 생성, Rectangular Array
		//array = new int[4][]; // 열을 정하지 않는 것도 가능 -> 각 층의 열의 개수가 달라질 수 있다. Jagged(Ragged) Array
		//array[0][0] = 5; // 할당

//		int [][] array = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9},
//				{10,11,12}
//		} ; //  초기화
		
//		int [][]array; // 선언
//		array = new int [4][3]; // 생성
//		array[0] = new int[] {1,2,3};
//		array[1] = new int[] {4,5,6};
//		array[2] = new int[] {7,8,9};
//		array[3] = new int[] {10,11,12};
		
		int [][]array; // 선언
		array = new int[4][]; // Jagged Array
//		array[0] = new int[4] {1,2,3,4};
//		array[1] = new int[2] {5,6};
//		array[2] = new int[1] {7};
//		array[3] = new int[5] {8,9,10,11,12}; -> error
		array[0] = new int[] {1,2,3,4};
		array[1] = new int[] {5,6};
		array[2] = new int[] {7};
		array[3] = new int[] {8,9,10,11,12};
		
//		System.out.println(array.length); //4
//		System.out.println(array[3].length); //5
		
		for(int i=0; i<array.length; i++) {
			for( int j=0; j<array[i].length; j++) {
				System.out.printf( "array[%d][%d] = %d\t", i, j, array[i][j]);
			}
			System.out.println();
		}
		
	}

}
