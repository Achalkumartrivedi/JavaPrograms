package JAVAPrograms;

public class Pattern {

	
	public static void main(String arg[])
	{
		
		for (int i=0; i<4; i++) //initialize row
        { 
		
		   for (int j=5; j>i; j--) //initialize column for print space
           { 
               
               System.out.print(" ");  //print space
           } 
  
          
           for (int j=0; j<=i; j++ )  //initialize column for print space
           { 
                                          
        	  
               System.out.print(" *");  // printing stars 
           } 
  
           // ending line after each row and start pointer with new raw
           System.out.println(); 
        }
	}
}
     
		
		
		



