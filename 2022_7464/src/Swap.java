
public class Swap {

	public static void main (String arg[])
	{
		
	
	int x= 20;
	int y = 10;
	
	System.out.println("Before swapping: X=" +x+" Y="+y);
	
	x = x + y;   //30
    y = x - y;   //30-10= 20
    x = x - y;   //30-20= 10
    
    System.out.println("After swapping: X=" +x+" Y="+y); 
	}
	
}
