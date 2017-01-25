package CalculatorProject;
import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void test() {
		Calculator test = new Calculator();
		int output = test.add(5,5);
		assertEquals(10, output);
		}

}
