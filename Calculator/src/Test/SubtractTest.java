
package Test;
import static org.junit.Assert.*;

import org.junit.Test;

import CalculatorProject.Calculator;

public class SubtractTest {

	@Test
	public void test() {
		Calculator test = new Calculator();
		int output = test.subtract(6, 6);
		assertEquals(0, output);
		
	}

}
