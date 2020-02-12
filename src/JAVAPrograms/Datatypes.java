package JAVAPrograms;

public class Datatypes {
	
	
	public static void main(String args[]){
		
		
    
	// Assignment  on DATATYPES and OPERATORS :  
	//Reported to : Manas Lenka	
	// 	1) Create a Java program to use variables of all datatypes
	
		
        byte b = 120; 

    	char a = 'A'; 
		 
          int i = 89; 
        
 
         short s = 56;
         
         long l = 100000L;
        		 
         double d = 4.355453532; 
         
         float f = 4.7333434f;  		 
         String str = "AchalTrivedi";

  
         
         System.out.println("My Name is :  " + str); 
         System.out.println("char: " + a); 
        System.out.println("integer: " + i); 
        System.out.println("byte: " + b); 
        System.out.println("Long " + l);
        System.out.println("short: " + s); 
        System.out.println("float: " + f); 
        System.out.println("double: " + d); 
        
		
		 
				
				 boolean bul = true; 
			        if (bul == false) 
			            System.out.println("Hi!! vishal"); 
			        
			        boolean bul2 = true;
			        boolean bul3 = false; // Assigning Value
			        bul3 = bul2;    // Assigning Variable
			        

			        System.out.println("Boolean 2nd Example :--"  + bul2);
			        
			        
			// 5) Difference between == operator And .equals() explain with example using string	
				    String s1 = "A"; 
			        String s2 = "A"; 
			        String s3 = "a"; 
			        String s4 = new String("A"); 
	
			        System.out.println(s1 + " .equals " + s2 
	                         + ": " + s1.equals(s2));
			        System.out.println(s1 + " .equals " + s3 
	                         + ": " + s1.equals(s3)); 
			        System.out.println(s2 + " .equals " + s3 
	                         + ": " + s2.equals(s3)); 
			        System.out.println(s1 + " .equals " + s4 
	                         + ": " + s1.equals(s4)); 
			        
			        
			        
			        System.out.println(s1 + " == " + s2 
	                         + ": " + (s1 == s2)); 
			        System.out.println(s1 + " == " + s3 
	                         + ": " + (s1 == s3)); 
			        System.out.println(s2 + " == " + s3 
	                         + ": " + (s2 == s3)); 
			        System.out.println(s1 + " == " + s4 
	                         + ": " + (s1 == s4)); 
			        
			// 4) WAP for Conditional operator.(Ternary) (? :).        
			 
			        
			       int p, q;
			        p = 10;
			        q = (a == 1) ? 20: 30;
			        System.out.println( "Value of q is : " +  q );

			        q = (p == 10) ? 20: 30;
			        System.out.println( "Value of q is : " + q );

			     
			        int x = 10;
			        int y = 20;

			        System.out.println("x == y = " + (x == y) );
			        System.out.println("x != y = " + (a != y) );
			        System.out.println("x > y = " + (x > y) );
			        System.out.println("x < y = " + (x < y) );
			        System.out.println("y >= x = " + (y >= x) );
			        System.out.println("y <= x = " + (y <= x) );        
			        
			        
			        
			  //   3)  Explain Assignment operators  with example      
			        
			        double number1 = 12.5;
			        double number2 = 3.5, result;
			    	
			  
			    	// used '+' operator for addition of two number
			    	result = number1 + number2;
			    	System.out.println("number1 + number2 = " + result);
			    

			    	// used '-' operator for substraction of two number
			    	result = number1 - number2;
			    	System.out.println("number1 - number2 = " + result);
			    	

			    	// used '*' operator for multiplication of two number
			    	result = number1 * number2;
			    	System.out.println("number1 * number2 = " + result);
			    	
			    	

			    	// use '/' operator for divison of two number
			    	double result1 = number1 / number2;
			    	double result2 = number2 / number1;
			         System.out.println("number1 / number2 = " + result1);
			         System.out.println("number2 / number1 = " + result2);
			    	
			    	

			    	// use '%' operator for modulus of two number
			    	result = number1 % number2;
			    	System.out.println("number1 % number2 = " + result);

			        
			        
			       
	    } 

}
