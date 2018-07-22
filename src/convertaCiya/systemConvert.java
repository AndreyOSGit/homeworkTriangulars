package convertaCiya;

import java.util.Iterator;

import com.sun.javafx.css.Size;

public class systemConvert 
{
	public static String convert(String value, int from, int to)
	
	{
		String result = "";
		return result;
	}
	
 
	public static int powerInt(int number, int stepeny)
	{
		int out = 1;
		for (int i = 0; i < stepeny ; i++)
		{
			out *= number;
		}
		
		return out;  
	}
 
 
	
	public static int converToDecimal(String value, int osnova)
	{
		value = value.toLowerCase();
		int out = 0;
		
		switch (osnova)
		{
		case 2:	
		{
			char[] number = value.toCharArray();
			for (int i = 0; i < number.length; i++) 
			{
				out +=   Character.getNumericValue( number[number.length -1 -i] )  // Integer.parseInt(String.valueOf(c));
						* powerInt(osnova, i) ;					
			}

		} break;
		case 8:	
		{
			char[] number = value.toCharArray();
			for (int i = 0; i < number.length; i++) 
			{
				out +=   Character.getNumericValue( number[number.length -1 -i] )  // Integer.parseInt(String.valueOf(c));
						* powerInt(osnova, i) ;					
			}

		} break;

		case 16:	
		{
			char[] number = value.toCharArray();

			for (int i = 0; i < number.length; i++) 
			{

				out +=   Integer.parseInt(
												String.valueOf( 
												convertSymbol(  number[number.length -1 -i]) 
												) 
						) 
						* powerInt(osnova, i) ;					
			}

		} break;

		}
		
		return out;
	}

	
	public static int numberOfDigits(int number)
	{
		int out = 0;
		int k = 1;
		while(number % k != number )
		{
			out++; 
			k *= 10;
		}
		return out;
	}
	
	public static String converFromDecimal(int value, int osnova)
	{
		String out = "";
		String digitsOut = ""; 
		int ostatok = value;
		
		if (value == 0) { ostatok = 0; digitsOut = "0"; }

				int i = 0;
				while ( ostatok >= 1  )
				{
					digitsOut += convertNumberToString ( ( ostatok - Math.floorDiv(ostatok, osnova) * osnova  ) ); // номер разряда
					ostatok = Math.floorDiv(ostatok, osnova);  //переписать остаток
					i++;
				} 
			
		char[] outArray = digitsOut.toCharArray();
		
		for (int k = outArray.length-1; k >= 0 ; --k) 
		{
			out += outArray[k];
		}
		
		
		return out;
	}
	
	
	public static String convertNumberToString(int val)
	{
		String out = "";
		if (val >= 10)
		{
			switch (val)
			{

				case 10: out = "A"; break;
				case 11: out = "B"; break;
				case 12: out = "C"; break;
				case 13: out = "D"; break;
				case 14: out = "E"; break;
				case 15: out = "F"; break;

			}
		} else 
		{
			out = String.valueOf(val);
		}
		
		return out;

	}
	
	
	public static int convertSymbol(char val)
	{
		int out = Character.getNumericValue(val);
		switch (val)
		{
		
			case 'a': out = 10; break;
			case 'b': out = 11; break;
			case 'c': out = 12; break;
			case 'd': out = 13; break;
			case 'e': out = 14; break;
			case 'f': out = 15; break;
		
		}

		return out;
		
	}
	
	public static void main(String[] args)
	{
//		System.out.println(  converToDecimal("1", 16) );
		System.out.println( Math.floorDiv(111, 2)	 );
		System.out.println( converFromDecimal(0,16) );
		
//		System.out.println( numberOfDigits(00000100) );
	}
	
	
}

