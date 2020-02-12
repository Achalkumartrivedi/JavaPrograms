package JAVAPrograms;

public class Largest {
	
	 public static void main(String[] args) {
	        int a = 42, b = 89, c = 56;
	        
	        if( a >= b && a >= c)
	            System.out.println(a + " is largest than B and C.");
	        else if (b >= a && b >= c)
	            System.out.println(b + " is largest than A and C.");
	        else
	            System.out.println(c + " is largest than A and B.");
	    }

}
