package console_art;

public class drawFiguresFilledWithStars 
{
	
	public static void main(String args[])
	{
		drawSquare1();
		drawTriangel2();
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

		int size = 11;
		for (int row = 1; row <= size; row++) 
		{
	        for (int col = 1; col <= size; col++)
	        {
	            // условие
	            if ( (col == 1 || col <= size ) || (row == 1 || row <= size ) )
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
		
	int size = 21;
		for (int row = 1; row <= size; row++) {
	        for (int col = 1; col <= size + 1 - row ; col++) {
	            // условие
	            if (col == 1 || row == 1 || col <= size - row + 1 ) {
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
		
	int size = 15;
		for (int row = 1; row <= size; row++) {
	        for (int col = 1; col <= size ; col++) {
	            // условие
	            if (
	            		(col == size) 
	            		|| (col >= row)
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
		
	int size = 15;
		for (int row = 1; row <= size; row++) {
	        for (int col = 1; col <= size/2+1 ; col++) {
	            // условие
	            if (
	            		(col <= row)
	            		&& (col <= size - row +1)
	            	)  
	            {
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
		
	int size = 11;
		for (int row = 1; row <= size; row++) 
		{
	        for (int col = 1; col <= size ; col++) 
	        {
	            // условие
	            if (
	            		(col >= row/2 +1 )
	            		&& (col <= size - row/2  )
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
		
	int size = 9;
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
	            // условие
	            if
	         ( 
	            	 (col >= row) && (col <= size - row +1) 
	            ||   (col <= row) && (col >= size - row +1) 
	            
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
	} //end  sandTimer6


	
	
//	*     *
//	**   **
//	* * * *
//	*  *  *
//	* * * *
//	**   **
//	*     *
	public static void sandTimerNaBoku7()
	{
		
	int size = 21;
		for (int row = 1; row <= size; row++) {
	        for (int col = 1; col <= size; col++) {
	            // условие
	            if
	         ( 
	              ( (col >= row) && (row >= size - col +1) )// right part
	          ||  ( (row >= col) && (row <= size - col +1) )  // left part
	            
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