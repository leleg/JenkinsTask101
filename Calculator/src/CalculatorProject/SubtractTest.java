
package CalculatorProject;
import static org.junit.Assert.*;

import org.junit.Test;

public class SubtractTest {

	@Test
	public void test() {
		Calculator test = new Calculator();
		int output = test.subtract(6, 5);
		assertEquals(1, output);
		
	}

}
