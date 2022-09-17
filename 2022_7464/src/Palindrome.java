import java.util.Scanner;

public class Palindrome {
	
		   public static void main(String args[]) {
			   String a;
				Scanner scr= new Scanner(System.in);
				System.out.println("Enter the Palindrome word");
				a=  scr.nextLine();
				
			StringBuffer buffer = new StringBuffer(a);
		      buffer.reverse();
		      String data = buffer.toString();
		      if(a.equals(data)){
		         System.out.println("Given String  palindrome is" +a);
		      } else {
		         System.out.println("Given String not palindrome :" +a);
		      }
		      System.out.println();
		   }
		

}
