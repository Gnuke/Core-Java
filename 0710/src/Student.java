
public class Student {

	// Field, 객체지향 -> 속성(Attribute, Property, State)
	private String hakbun, name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private char grade;
	
	public void print() {
		System.out.println("학번\t국어\t수학\t영어\t총점\t평균\t평점");
		System.out.println("---------------------------------------------------------");
		System.out.printf("%-10s%5d%5d%5d%5d%7.1f%3c%n", 
				hakbun, kor, eng, math, total, avg, grade );
	}
	
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}

}
