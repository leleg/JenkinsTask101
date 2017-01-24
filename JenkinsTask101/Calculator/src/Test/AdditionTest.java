package Test;
import static org.junit.Assert.*;

import org.junit.Test;

import CalculatorProject.Calculator;

public class AdditionTest {

	@Test
	public void test() {
		Calculator test = new Calculator();
		int output = test.add(3,4);
		assertEquals(7, output);
		}

}
