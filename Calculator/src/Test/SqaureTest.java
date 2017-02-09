package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import CalculatorProject.Calculator;

public class SqaureTest {

	@Test
	public void test() {
		Calculator stest = new Calculator();
		int actual = stest.squareRoot(5);
		assertEquals(25, actual);
	}

}
