package Test;
import static org.junit.Assert.*;

import org.junit.Test;

import CalculatorProject.Calculator;

public class Multiply {

	@Test
	public void test() {
		Calculator test = new Calculator();
		int output = test.multiply(6,6);
		assertEquals(36, output);
	}

}
