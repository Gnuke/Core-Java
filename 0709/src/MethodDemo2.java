/*
 * Method를 호출하는 방법 3가지
 * 3) Call( Pass ) by Reference
 *  
 */

class Product{
	int price;
}

public class MethodDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo2 md = new MethodDemo2();
		Product ballpen = new Product(); ballpen.price = 100;
		System.out.println( "before = " + ballpen.price );
		//md.change(ballpen.price); -> price는 정수형 => 주소가 아님
		md.change(ballpen); // Call by Reference
		//int original = 100;
		//md.print(original); 
		// 값 복사 --> original과 target의 저장공간이 다르기 때문에 값복사로는 바뀌지 않는다.
		System.out.println( "after = " + ballpen.price );
	}
	void change( Product pencil ) { // pencil = ballpen
		pencil.price = 50000;
	}
//	void print(int target){ // target = original 
//		System.out.println( "target1 = " + target );
//		target = 50000;
//		System.out.println( "target2 = " + target );
//	}
}
 