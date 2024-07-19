/*
 * Author : Gnuke
 * When : Jul, 19, 2024
 * Objective : Patient Administrate
 * Environment : Windows 11 Enterprise Ed., JDK 17.0.10, Eclipse
 * */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
	private List<Patient> list;
	
	public Sort(List<Patient> list) {
		this.list = list;
	}
	
	public void quickSort() {
		Collections.sort( this.list, new Comparator<Patient>() {

			@Override
			public int compare(Patient front, Patient back) {
				// TODO Auto-generated method stub
				return front.getNo() - back.getNo();
			}
			
		});
	}
}
