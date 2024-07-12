
public class ProductOutput {

	void output( Product [] array ) {
		// print method
			System.out.println( "\t\t<<상품별 판매 이익금 및 이익율표>>" );
			System.out.println("-------------------------------------------------------------");
			System.out.println("상품명\t수량\t판매단가\t매입단가\t운송료\t이익금\t이익율");
			System.out.println("-------------------------------------------------------------");
			for( Product p : array ) {
				System.out.printf("%-5s%5d%5d%5d%5d%5d%.2f\n",
						p.getName(), p.getSu(), p.getSell(), p.getBuy(),p.getMove(),p.getProfit(),p.getPerpro());
		}
	}
}
