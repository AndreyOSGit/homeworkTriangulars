package convertaCiya;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConverTest {

	@Test
	public void converToDecimal_101_2_out_5() 
	{
		int osnova = 2;
		String value = "101";  
		int expected = 5;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	
	@Test
	public void converToDecimal_001_2_out_1() 
	{
		int osnova = 2;
		String value = "001";  
		int expected = 1;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	
	@Test
	public void converToDecimal_010_2_out_2() 
	{
		int osnova = 2;
		String value = "010";  
		int expected = 2;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	
	@Test
	public void converToDecimal_0_2_out_0() 
	{
		int osnova = 2;
		String value = "0";  
		int expected = 0;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	@Test
	public void converToDecimal_10000_2_out_10() 
	{
		int osnova = 2;
		String value = "10000";  
		int expected = 10;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}

}
