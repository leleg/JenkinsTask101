package Test;
import static org.junit.Assert.*;

import org.junit.Test;

import CalculatorProject.Calculator;

public class Divide {

	@Test
	public void test() {
		Calculator test = new Calculator();
		int output = test.divide(16,8);
		assertEquals(2, output);
	}

}
