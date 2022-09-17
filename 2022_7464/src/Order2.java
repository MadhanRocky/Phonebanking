import java.util.Scanner;
public class Order2 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Each item RS 10");
		System.out.println("\n enter the name");
		String name = sc.nextLine();
		System.out.println("\n enter the OrderNo");
		int no = sc.nextInt();
		sc.nextLine();
		System.out.println("\n enter the OrderType");
		String type = sc.nextLine();
		System.out.println("\n ENter the quantity");
		int qty = sc.nextInt();
		
	    System.out.println("Hi"+ name);
	    System.out.println("\n your order is"+ type);
	    System.out.println("\n your order no is"+ no);
	     System.out.println("your have order for"+ qty);
	     int order=10;
	     int total = qty * order;
	     
	     System.out.println("\n your total value is " + total);
	     sc.nextLine();
	     if(qty > 50)
	     {
	         System.out.println("\n your order might be delayed:");
	     }
	     System.out.println("Y/N");
	     String confirm = sc.nextLine();
	     if(confirm=="y")
	     {
	         System.out.println("continue");
	     }
	     else
	     {
	      System.out.println("exit");
	     }
	}
}
