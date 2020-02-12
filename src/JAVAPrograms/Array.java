package JAVAPrograms;

public class Array {
	
	public static void main(String arg[]){
		
		
		//Example of one D array
		int[] arr = new int[10]; //Declaring array and allocating memory to array
		  arr[0]=10;  //first elements of the array
          arr[1] = 20;  //second elements of the array
	      arr[2] = 30; //third elements of the array
	      arr[3] = 40; //fourth elements of the array
	      arr[4] = 50; //fifth elements of the array
	          
	      // accessing the elements of array using for loop 
	     for (int i = 0; i < arr.length; i++) 
	        System.out.println(" index " + i +  " : "+ arr[i]);
	
		System.out.println(); //pointer to next line
		
		
		  int arrtwo[][] = { {1,2,3,4,5,7},{4,5,6,6,7,6},{7,8,9,7,9,4} }; //Declaring 2D array
		  
	        // printing 2D array 
	        for (int i=0; i< 6 ; i++) 
	        { 
	            for (int j=0; j < 6 ; j++) 
	                System.out.print(arrtwo[i][j] + " "); 
	  
	            System.out.println(); 
	        } 
		
		
	}

}
