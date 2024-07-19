/*
 * Author : Gnuke
 * When : Jul, 19, 2024
 * Objective : Patient Administrate
 * Environment : Windows 11 Enterprise Ed., JDK 17.0.10, Eclipse
 * */
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class InputTest {

	@Test
	void testInput() {
		List<Patient> list = new ArrayList<Patient>();
		Input input = new Input(list);
		input.patientInput();
		
		assertEquals( "code", list.get(3).getCode() );
	}

}
