package JAVAPrograms;

public class ThreeMethods {
	
//'Onemethod'Method value x and y for addition ,that without return value
	
	int x,y ;
	void Onemethod(int x,int y){
	
		int result = x+y;
		System.out.print("First method called: " +result + "\n");
	}			

	
	//'Secondmethod'Method value x and y for addition ,that return a value	
	int Secondmethod(int x ,int y){
			
			
			return x+y;
		}	
		
		
			
	public static void main(String arg[])
	{
	
		ThreeMethods obj = new ThreeMethods();
		
		obj.Onemethod(20, 30);
		int sum = obj.Secondmethod(5, 6);
		System.out.print("Second method called: " +sum +"\n");
	
	
		
	}
	
		
	}


