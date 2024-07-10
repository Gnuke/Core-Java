
public class ProductMgmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product info = new Product();
		
		new ProductInput().input(info);
		
		new ProductCalc().calc(info);
	}

}
