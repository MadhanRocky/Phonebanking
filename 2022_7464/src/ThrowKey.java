
public class ThrowKey {
	public static void main(String args[])
	{
		int x=10, y=0;
		try
		{
			int z= x/y;
			System.out.println("Value of X is:" +z);
			throw new ArithmeticException();
		}
		catch (ArithmeticException a)
		{
			System.out.println("Exception catch id:" +a);
		}
	}

}
