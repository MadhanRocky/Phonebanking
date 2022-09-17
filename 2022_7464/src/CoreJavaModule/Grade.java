package CoreJavaModule;

public class Grade {
public static void main (String arg[])
{
	int i  =37;
	int j = 40;
	int k = 67;
	float  Total , Percentage;
	Total = (i + j + k);
	Percentage =( Total/300 * 100);
	
	  System.out.println(" Total Marks =  " + Total);
	    System.out.println(" Marks Percentage =  " + Percentage);
	    
	    if(Percentage > 80)
	    {
			System.out.println("\n Grade A");
		}
		else if(Percentage <  70)
	    {
			System.out.println("\n Grade B");
		}
		else if ( Percentage  <35)	
		{
			System.out.println("\n Fail");
		}
	    else 
	    {
	    	System.out.println("enter valid marks ");
	    }
}

}
