package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{
	
	@Test
	public void testEmptyString()
	{
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber()
	{
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testOneHugeNumber()
	{
		assertEquals(0, Calculator.add("2003"));
	}
	
	@Test
	public void testTwoNumbers()
	{
		assertEquals(6, Calculator.add("2,4"));
	}

	@Test
	public void testMultipleNumbers()
	{
		assertEquals(9, Calculator.add("1,3,5"));
	}
	
	@Test
	public void testWithNewLineAndComma()
	{
		assertEquals(5, Calculator.add("1\n3,1"));
	}

	@Test
	public void testWithNewLine()
	{
		assertEquals(14, Calculator.add("11\n3"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testWithNegative()
	{
		Calculator.add("-2, 2, -1");
	}

	@Test
	public void testWithBigNumber()
	{
		assertEquals(113, Calculator.add("11,3,1004,99"));
	}
}