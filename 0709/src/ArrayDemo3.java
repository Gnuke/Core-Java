
public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열의 주소 복사
//		int [] original = {3,4,5};
//		int [] target = original;
//		target[0] = 100;	// original[0] -> 100
		
		// 배열의 값 복사
		int [] original = {3,4,5};
//		int [] target = new int[original.length];
//		target[0] = original[0];
//		//... -> 너무 복잡함 so,
		
		int [] target = new int[10];
		System.arraycopy(original, 0, target, 3, 6); // 값 복사 메서드 : ( original을, 0번부터, target에, 3번부터, 6개 ) 복사
		// System.arraycopy(original, 0, target, 9, 3); -> IndexOutOfBound ,error : 배열의 범위를 넘어섬
	}

}
