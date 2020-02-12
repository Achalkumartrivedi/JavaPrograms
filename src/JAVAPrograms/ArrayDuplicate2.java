package JAVAPrograms;

public class ArrayDuplicate2 {
	
	 public static void main(String[] args) 
	    {
	        int[] arr = {5,7,8,4,3,5,7,9,0,2};
	 
	        for (int i = 0; i < arr.length; i++)
	        {
	            for (int j = i+1; j < arr.length; j++)
	            {
	                if ((arr[i] == arr[j]))
	                {
	                    System.out.println("Duplicate Element are : "+arr[i]);
	                }
	            }
	        }
	    }    

}
