package CalculatorProject;
import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void test() {
		Calculator test = new Calculator();
		int output = test.add(5,4);
		assertEquals(7, output);
		}

}
