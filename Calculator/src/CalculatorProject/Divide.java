package CalculatorProject;
import static org.junit.Assert.*;

import org.junit.Test;

public class Divide {

	@Test
	public void test() {
		Calculator test = new Calculator();
		int output = test.divide(6,6);
		assertEquals(1, output);
	}

}
