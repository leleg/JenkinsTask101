package CalculatorProject;
import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void test() {
		Calculator test = new Calculator();
		int output = test.add(6,5);
		assertEquals(11, output);
		}

}
