package Test;
import static org.junit.Assert.*;

import org.junit.Test;

import CalculatorProject.Calculator;

public class Divide {

	@Test
	public void test() {
		Calculator test = new Calculator();
		int output = test.divide(9,9);
		assertEquals(1, output);
	}

}
