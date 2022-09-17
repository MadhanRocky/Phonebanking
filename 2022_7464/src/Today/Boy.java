package Today;

class Human {
	public void eat()
	{ 
		System.out.println("Human is eating");
		
	}

}

class Boy extends Human
{
	public void eat()
	{ 
		System.out.println("Boy is eating");
		
	}

public static void main ( String arg[])
{
	Boy obj= new Boy();
	obj.eat();
}
}