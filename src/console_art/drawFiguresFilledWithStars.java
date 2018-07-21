package console_art;

public class drawFiguresFilledWithStars 
{
	
	public static void main(String args[])
	{
//		drawSquare1();
//		drawTriangel2();
		drawTriangel3();
		drawTriangel4();
		drawTriangel5();
		sandTimer6();
		sandTimerNaBoku7();
	}

//	*******
//	*     *
//	*     *
//	*     *
//	*     *
//	*     *
//	*******
	public static void drawSquare1()
	{

		int count = 15;
		for (int i = 1; i <= count; i++) 
		{
	        for (int k = 1; k <= count; k++)
	        {
	            // условие
	            if ( (k == 1 || k <= count ) || (i == 1 || i <= count ) )
	            {
	                System.out.print("*");
	            } else
	            {
	                System.out.print(" ");
	            }
	        }
	        // Переход на следующую строку
	        System.out.println();
	    }
	}	
		
//	*******
//	*    * 
//	*   *  
//	*  *   
//	* *    
//	**     
//	*
	public static void drawTriangel2()
	{
		
	int count = 15;
		for (int i = 1; i <= count; i++) {
	        for (int k = 1; k <= count + 1 - i ; k++) {
	            // условие
	            if (k == 1 || i == 1 || k <= count - i + 1 ) {
	                System.out.print("*");
	            } else {
	                System.out.print(" ");
	            }
	        }
	        // Переход на следующую строку
	        System.out.println();
	    }
	}
	
//	*******
//	 *    *
//	  *   *
//	   *  *
//	    * *
//	     **
//	      *
	public static void drawTriangel3()
	{
		
	int count = 7;
		for (int i = 0; i < count; i++) {
	        for (int k = 0; k < count ; k++) {
	            // условие
	            if (
	            		(k == 6) 
	            		|| (i == 0) 
	            		|| (k == i)
	            	) {
	                System.out.print("*");
	            } else {
	                System.out.print(" ");
	            }
	        }
	        // Переход на следующую строку
	        System.out.println();
	    }
	}
	
//	*   
//	**  
//	* * 
//	*  *
//	* * 
//	**  
//	*
	public static void drawTriangel4()
	{
		
	int count = 7;
		for (int i = 0; i < count; i++) {
	        for (int k = 0; k < count/2+1 ; k++) {
	            // условие
	            if (
	            	   (k == 0) 
	            		|| (k <= i)
	            		|| (k == count - i -1)
	            	) {
	                System.out.print("* ");
	            } else {
	                System.out.print("  ");
	            }
	        }
	        // Переход на следующую строку
	        System.out.println();
	    }
	}
	
//	*******
//	*     *
//	 *   * 
//	 *   * 
//	  * *  
//	  * *  
//	   *
	public static void drawTriangel5()
	{
		
	int count = 7;
		for (int i = 0; i < count; i++) 
		{
	        for (int k = 0; k < count ; k++) 
	        {
	            // условие
	            if (
	            	   (i == 0) 
	            		|| (k == i/2)
	            		|| (k == count -1 - i/2)
	            	) 
	            {
	                System.out.print("*");
	            } else {
	                System.out.print(" ");
	            }
	        }
	        // Переход на следующую строку
	        System.out.println();
	    }
	}
	
//	*******
//	 *   * 
//	  * *  
//	   *   
//	  * *  
//	 *   * 
//	*******
	public static void sandTimer6()
	{
		
	int size = 15;
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				// условие
				if ( (row <= size/2) )
				{

					if (row <= col && col <=size + 1 - row) 
					{
						System.out.print("*");
					} else 
					{
						System.out.print(" ");
					}
					
				}
				
			}
		}
	}
			//	            ||	
			//	            || (row >= size)
			//	          ||  ( k <= i ) 
			//	          ||  (k == count +1 - i )
//
//	                System.out.print("*");
//	            } else 
//	            {
//	                System.out.print(" ");
//	            }
//	        }
	        // Переход на следующую строку
//	        System.out.println();
//	    }
	
	
//	*     *
//	**   **
//	* * * *
//	*  *  *
//	* * * *
//	**   **
//	*     *
	public static void sandTimerNaBoku7()
	{
		
	int count = 15;
		for (int i = 0; i < count; i++) {
	        for (int k = 0; k < count; k++) {
	            // условие
	            if
	            ( 
	            		(k == 0) 
	            		||	(k == count -1) 
	            		||  ( k == i ) 
	            		||  (k == count - i -1 )
	            )
	            {
	                System.out.print("*");
	            } else {
	                System.out.print(" ");
	            }
	        }
	        // Переход на следующую строку
	        System.out.println();
	    }
	}

}