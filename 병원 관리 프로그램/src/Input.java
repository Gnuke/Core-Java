/*
 * Author : Gnuke
 * When : Jul, 19, 2024
 * Objective : Patient Administrate
 * Environment : Windows 11 Enterprise Ed., JDK 17.0.10, Eclipse
 * */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
	private List<Patient> list;
	private Scanner sc;
	
	public Input( List<Patient> list ) {
		// TODO Auto-generated constructor stub
		this.list = list;
		this.sc = new Scanner(System.in);
	}
	
	public void patientInput() {
		String i_o = null;
		//int count = 0;
		do {
			System.out.print( "번\t호 : " );
			int no = this.sc.nextInt();
			
			System.out.print( "진료코드 : " );
			String code = this.sc.next();
			
			System.out.print( "입원일수 : ");
			int days = this.sc.nextInt();
			
			System.out.print( "나이 : ");
			int age = this.sc.nextInt();
			
			Patient p = new Patient(no, code, days, age);
			
			this.list.add(p);
			
			System.out.print("입력 / 출력(I/O) ? ");
			i_o = sc.next().toLowerCase();
			
//			System.out.println( "days  " + p.getDays());
//			System.out.println( "age " + p.getAge());
			
		}while( i_o.equals("i") );
		
	}
}
