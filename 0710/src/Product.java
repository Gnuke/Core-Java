
public class Product {
	private String name; // 상품명
	private int su; // 수량
	private int sell; // 판매단가
	private int buy; // 매입단가
	private int move; // 운송료
	private int profit; // 이익금
	private double perpro; // 이익율, 소수점 이하 셋째 자리에서 반올림
	
	public void print() {
		System.out.println( "\t\t<<상품별 판매 이익금 및 이익율표>>" );
		System.out.println("-------------------------------------------------------------");
		System.out.println("상품명\t수량\t판매단가\t매입단가\t운송료\t이익금\t이익율");
		System.out.println("-------------------------------------------------------------");
		System.out.printf("%-5s%5d%5d%5d%5d%5d%.2f\n");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public int getSell() {
		return sell;
	}
	public void setSell(int sell) {
		this.sell = sell;
	}
	public int getBuy() {
		return buy;
	}
	public void setBuy(int buy) {
		this.buy = buy;
	}
	public int getMove() {
		return move;
	}
	public void setMove(int move) {
		this.move = move;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	public double getPerpro() {
		return perpro;
	}
	public void setPerpro(int perpro) {
		this.perpro = perpro;
	}
	
}
