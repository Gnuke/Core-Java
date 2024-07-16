
public class AnonymousClassDemo {
	public static void main(String[] args) {
//		Canine ca = new Dog();
//		ca.roam();
//		ca.bark();
		Canine ca = new Canine() {

			@Override
			void bark() {
				// TODO Auto-generated method stub
				System.out.println( "으르렁 짖다" );
			}
			
			void display() {
				System.out.println( "추가 메소드" );
			}
			
		}; // anonymous 객체 - 그 객체 안에 들어있는 메서드를 재정의 함
		
		ca.bark();
		ca.roam();
		//ca.display();
	}
}
abstract class Canine{
	abstract void bark();
	void roam() {
		System.out.println( "여기저기 배회하다." );
	}
}

//class Dog extends Canine{
//	void bark() {
//		System.out.println( "으르렁 짖다" );
//	}
//}