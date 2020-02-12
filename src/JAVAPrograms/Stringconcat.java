package JAVAPrograms;

public class Stringconcat {

public static void main(String arg[]){
	
	
	String str1 = "Achal"; //create string object containing "Achal" and assigns it a reference str1
	
	String str2 = str1.concat(" Trivedi"); //create string object containing "Trivedi" concate with reference str1 and its assigns to reference of str2
	
	System.out.println("My Name is- " +str2); //Print string using str2 reference after concating
	
	
	
    String Str = new String("String are immutable"); //Declare string using new keyword
      
    // Using replace() to replace all characters with new and print in system.out.println 
    System.out.print("After replacing all characters a with e : " ); 
    System.out.println(Str.replace('S', 'e')); 
      
 // Using replace() to replace all string with new and print in system.out.println
    System.out.print("After replacing all old String with new string: " ); 
    System.out.println(Str.replaceAll(Str, "Achal Kumar")); 
	
	
	
}
	
}
