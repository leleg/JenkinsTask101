package CalculatorProject;
import static org.junit.Assert.*;

import org.junit.Test;

public class Multiply {

	@Test
	public void test() {
		Calculator test = new Calculator();
		int output = test.multiply(6,7);
		assertEquals(42, output);
	}

}
