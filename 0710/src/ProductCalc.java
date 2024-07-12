
public class ProductCalc {

	public void calc( Product[] array ) {
		for( Product p : array ) {
			int sellPrice = p.getSu() * p.getSell(); // 판매금액
			//System.out.println( "sellPrice : " + sellPrice );
			int buyPrice = p.getSell() * p.getBuy(); //매입금액
			
			p.setProfit( sellPrice - (buyPrice + p.getMove()) );
			p.setPerpro( p.getProfit() / p.getBuy() * 100 );
		}
	}

}
