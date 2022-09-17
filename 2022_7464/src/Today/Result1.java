package Today;
class Cal{
int a, b;
void getdata( int x, int y)
{
	a = x;
	b= y;
	}
}
class Marks extends Cal{
	int add()
			{
		int sum = a+b;
		return sum;
		
			}
	}
public class Result1{
	public static void main (String arg[]) 

	
	{
		Marks m = new Marks();
		System.out.print( "A= +a");
		System.out.print( "B= +b");
		System.out.print( "Sum= +Sum");
	}
}