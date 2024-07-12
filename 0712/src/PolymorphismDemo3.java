
public class PolymorphismDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dog [] array = new Dog[3];
		//array[0] = new Cat[();
		
		Mammal [] array = new Mammal[4];
		array[0] = new Dog();
		array[1] = new Cat();
		array[2] = new American();
		array[3] = new Korean();
		// 부모 배열에 자식은 다 들어갈 수 있다 - Heterogeneous Collections
		
		for( Mammal m : array ) m.sayThing();
	}

}
