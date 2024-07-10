
public class Calc {
	void calc( Student std ) {
		int total = std.getKor() + std.getEng() + std.getMath();
		std.setTotal(total);
		
		std.setAvg(std.getTotal()/3.);
		
		std.setGrade(
				(std.getAvg() >= 90) ? 'A' : (std.getAvg() >= 80) ? 'B' :
				(std.getAvg() >= 70) ? 'C' : (std.getAvg() >= 60) ? 'D' : 'F'
			);
	}
}
