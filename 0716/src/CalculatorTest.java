import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.BeforeEach;

class CalculatorTest {
	private Calculator cal;
	
	@BeforeEach
	void init() {
		this.cal = new Calculator();
	}
	
	@Test
	void test() {
		assertNotNull(this.cal);
	}
	
	@Test
	void testAdd() {
		assertEquals( 8, this.cal.add(3, 5) ); // 계산 값이 ~임을 보장한다
	}

	@Test
	void testSubtract() {
		assertEquals(5, this.cal.subtract(8, 3));
	}

	@Test
	void testMultiple() {
		assertEquals(24, this.cal.multiple(6, 4));
	}

	@Test
	void testDivide() {
		assertEquals(4.1, this.cal.subtract(25, 6));
	}

}
