/*
 * Author : Gnuke
 * When : Jul, 19, 2024
 * Objective : Patient Administrate
 * Environment : Windows 11 Enterprise Ed., JDK 17.0.10, Eclipse
 * */
import java.util.List;

public class Output {
	private List<Patient> list;
	
	public Output( List<Patient> list ) {
		// TODO Auto-generated constructor stub
		this.list = list;
	}
	
	public void print() {
		labelPrint();
		for(Patient p : this.list) {
			p.setDept();
			System.out.println( p );
		}
	}

	private void labelPrint() {
		// TODO Auto-generated method stub
		System.out.println( "                   <<병원관리프로그램>>" );
		System.out.println("------------------------------------------------------------");
		System.out.println("번호\t진찰부서\t진찰비\t입원비\t진료비");
		System.out.println("------------------------------------------------------------");
	}
}
