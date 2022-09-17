package Today;

class MethodOverloadingex {
public void disp(char c)
{
	System.out.println(c);
	
}
public void disp(char c, int num)
{
	System.out.println(c+"     "+ num);
}	
}
public class Sample123

{
	public static void main(String arg[])
	{
		MethodOverloadingex mo = new MethodOverloadingex();
		mo.disp('H');
      mo.disp('J', 34 );
	}
}

