package convertaCiya;

public class systemConvert 
{
	public static String convert(String value, int from, int to)
	
	{
		String result = "";
		return result;
	}
	
 
	public int powerInt(String value, int osnova)
	{
		int out = value.;
		return  
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
					out +=  ( (int)number[number.length - i] ) * (int) );					
				}
 
			}
		}
		
		return out;
	}

	public static void main(String[] args)
	{
		System.out.println(  converToDecimal("111", 2) );
	}
	
	
	
	public int convertSymbol(char val)
	{
		int out = 0;
		switch (val)
		{
		case 'a': out = 10;
		case 'b': out = 11;
		case 'c': out = 12;
		case 'd': out = 13;
		case 'e': out = 14;
		case 'f': out = 15;
		
		}

		return out;
		
	}
}

