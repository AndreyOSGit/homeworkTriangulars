package convertaCiya;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConverFromDecimal {

	
	// -------------------- convert from 2 to 10
	
	
	
	@Test
	public void converFromDecimal_101_2_out_5() 
	{
		int osnova = 2;
		String value = "101";  
		int expected = 5;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	
	@Test
	public void converBinToDecimal_001_2_out_1() 
	{
		int osnova = 2;
		String value = "001";  
		int expected = 1;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	
	@Test
	public void converBinToDecimal_010_2_out_2() 
	{
		int osnova = 2;
		String value = "010";  
		int expected = 2;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	
	@Test
	public void converBinToDecimal_0_2_out_0() 
	{
		int osnova = 2;
		String value = "0";  
		int expected = 0;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	@Test
	public void converBinToDecimal_10000_2_out_10() 
	{
		int osnova = 2;
		String value = "10000";  
		int expected = 16;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	
	@Test
	public void converBinToDecimal_111111111_2_out_10() 
	{
		int osnova = 2;
		String value = "111111111";  
		int expected = 511;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
// ---------------------------- convert from 8 to 10
	
	@Test
	public void converOctToDecimal_1_8_out_1() 
	{
		int osnova = 8;
		String value = "1";  
		int expected = 1;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	
	@Test
	public void converOctToDecimal_7_8_out_7() 
	{
		int osnova = 8;
		String value = "7";  
		int expected = 7;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	
	@Test
	public void converOctToDecimal_8_8_out_8() 
	{
		int osnova = 8;
		String value = "8";  
		int expected = 8;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	
	@Test
	public void converOctToDecimal__11_out_9() 
	{
		int osnova = 8;
		String value = "11";  
		int expected = 9;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	@Test
	public void converOctToDecimal_0000000001_8_out_1() 
	{
		int osnova = 8;
		String value = "0000000001";  
		int expected = 1;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	
	@Test
	public void converOctToDecimal_00100_8_out_64() 
	{
		int osnova = 8;
		String value = "00100";  
		int expected = 64;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	
	@Test
	public void converOctToDecimal_4267465_8_out_1142581() 
	{
		int osnova = 8;
		String value = "4267465";  
		int expected = 1142581;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	// ---------------------------- convert from 16 to 10

	@Test
	public void converDecToDecimal_null_16_out_0() 
	{
		int osnova = 16;
		String value = null;  
		int expected = 0;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	
	@Test
	public void converDecToDecimal_0_16_out_0() 
	{
		int osnova = 16;
		String value = "0";  
		int expected = 0;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	
	@Test
	public void converDecToDecimal_00001_16_out_1() 
	{
		int osnova = 16;
		String value = "00001";  
		int expected = 1;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	
	@Test
	public void converDecToDecimal_0010_16_out_16() 
	{
		int osnova = 16;
		String value = "0010";  
		int expected = 16;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	
	@Test
	public void converDecToDecimal_A000_16_out_40960() 
	{
		int osnova = 16;
		String value = "A000";  
		int expected = 40960;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	@Test
	public void converDecToDecimal_000F_16_out_15() 
	{
		int osnova = 16;
		String value = "000F";  
		int expected = 15;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	
	@Test
	public void converDecToDecimal_A_16_out_10() 
	{
		int osnova = 16;
		String value = "A";  
		int expected = 10;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	
	@Test
	public void converDecToDecimal_1_16_out_1() 
	{
		int osnova = 16;
		String value = "1";  
		int expected = 1;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	
	@Test
	public void converDecToDecimal_2_16_out_2() 
	{
		int osnova = 16;
		String value = "2";  
		int expected = 2;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	@Test
	public void converDecToDecimal_B_16_out_11() 
	{
		int osnova = 16;
		String value = "B";  
		int expected = 11;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	@Test
	public void converDecToDecimal_C_16_out_12() 
	{
		int osnova = 16;
		String value = "C";  
		int expected = 12;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	@Test
	public void converDecToDecimal_D_16_out_13() 
	{
		int osnova = 16;
		String value = "D";  
		int expected = 13;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	@Test
	public void converDecToDecimal_E_16_out_14() 
	{
		int osnova = 16;
		String value = "E";  
		int expected = 14;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	@Test
	public void converDecToDecimal_F_16_out_15() 
	{
		int osnova = 16;
		String value = "F";  
		int expected = 15;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	@Test
	public void converDecToDecimal_ABC_16_out_2748() 
	{
		int osnova = 16;
		String value = "ABC";  
		int expected = 2748;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	@Test
	public void converDecToDecimal_FFF_16_out_4095() 
	{
		int osnova = 16;
		String value = "FFF";  
		int expected = 4095;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	
	@Test
	public void converDecToDecimal_FFF_16_out_1152921504606846975() 
	{
		int osnova = 16;
		String value = "FFFFFFFFFFFFFFF";  
		int expected = 1152921504606846975;
		int actual = systemConvert.converToDecimal(value, osnova);
		assertEquals(expected, actual);
	}
	
	
}
