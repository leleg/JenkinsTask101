package CalculatorProject;
import static org.junit.Assert.*;

import org.junit.Test;

public class Multiply {

	@Test
	public void test() {
		Calculator test = new Calculator();
		int output = test.multiply(5,4);
		assertEquals(16, output);
	}

}
