package Today;

 class Sample1 {
public void disp(char c)
{
	System.out.println(c);
	
}
public void disp(char c, int num)
{
	System.out.println(c+""+ num);
}	
}
public class Sample

{
	public static void main (String arg[])
	{
		Sample1 obj = new Sample1();
		obj.disp('a');
		obj.disp('a', 10 );
	}
}
