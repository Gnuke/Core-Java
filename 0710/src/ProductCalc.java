
public class ProductCalc {

	void calc( Product pdt ) {
		int sellPrice = pdt.getSu() * pdt.getSell(); // 판매금액
		int buyPrice = pdt.getSell() * pdt.getBuy(); //매입금액
		
		pdt.setProfit( sellPrice - (buyPrice + pdt.getMove()) );
		pdt.setPerpro( pdt.getProfit() / pdt.getBuy() * 100 );
	}

}
