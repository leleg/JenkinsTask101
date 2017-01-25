package CalculatorProject;
import static org.junit.Assert.*;

import org.junit.Test;

public class Multiply {

	@Test
	public void test() {
		Calculator test = new Calculator();
		int output = test.multiply(5,5);
		assertEquals(25, output);
	}

}
