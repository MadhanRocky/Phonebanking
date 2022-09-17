
import java.util.Scanner;
 
class Order_details
{
	int quatity,no;
	String name,c;
	public void details()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("hiii<<user name>>");
	name=s.nextLine();
	
	}
}
class Order_type extends Order_details
{
	int quantity,cn,Total_value_o,Total_value_m,Total_value_s,Total_value_f1,Total_value_f2,Total_value_f3,quantityc1,quantityc2,quantityc3,quantityf1,quantityf2,quantityf3;
	int Total_value_e1,Total_value_e2,Total_value_e3,Total_value_c1,Total_value_c2,Total_value_c3,Total_value_m1,Total_value_m2,Total_value_m3;
	int quantity1,quantity2,quantity3,quantity4,quantity5,quantityg1,quantityg2,quantityg3,quantitye1,quantitye2,quantitye3,quantitym1,quantitym2,quantitym3;
	String search;
	double Total_value1,Total_value2,Total_value3,Total_value4,Total_value5;
	public void type()
	{
	
			System.out.println("A.Groceries\n B.Electronics \n C.Clothes \n D.Makeupkits \n E. Footwear \n F.exit");
		   Scanner K=new Scanner(System.in);
		   c=K.next();
		   switch(c)
		   {
		   case "A":
			 yes:  for(int i=1;i<=3;i++)
			   {
			   System.out.println("Enter to groceries section");
			   System.out.println("search your items here");
			   search=K.nextLine();
			   if(search.equals("oil packets"))
			   {
				  int value=180;
				  System.out.println("enter your quantity");
				  quantityg1=K.nextInt();
				   Total_value_o=(quantityg1*value);
				  System.out.println("Item=Oil packets\n"+"Total quantity="+quantityg1+" Total value="+Total_value_o);
				  
			   }
			   else if(search.equals("mirchi packets"))
			   {
				   int value=40;
				   System.out.println("enter your quantity");
				   quantityg2=K.nextInt();
				   Total_value_m=(quantityg2*value);
				 System.out.println("Item=Oil packets\n"+"Total quantity="+quantityg2+" Total value="+Total_value_m);
				 
			   }
			   else if(search.equals("sugar"))
			   {
				   int value=38;
				   System.out.println("enter your quantity in Kg");
				  quantityg3=K.nextInt();
				  Total_value_s=(quantityg3*value);
				  System.out.println("Item=Oil packets\n"+"Total quantity="+quantityg3+" Total value="+Total_value_s);
					  
			   }
			   else
			   {
				   System.out.println("Try again");
			   }
			   System.out.println("Do you wish to continue for yes enter 1 and exit 2");
			   cn=K.nextInt();
			   if(cn==2)
			   {
				   break;
			   }
			   else
			   {
				   continue yes;
			   }
			 
			  
		   }
			 break;
			 
		   case "B":
			   yes1:  for(int i=1;i<=3;i++)
			   {
			   System.out.println("Enter to Electronics section");
			   System.out.println("search your items here");
			   search=K.nextLine();
			   if(search.equals("mobile"))
			   {
				  int value=18000;
				  System.out.println("enter your quantity");
				  quantitye1=K.nextInt();
				  Total_value_e1=(quantitye1*value);
				  System.out.println("Item=mobile\n"+"Total quantity="+quantitye1+" Total value="+Total_value_e1);
				  
			   }
			   else if(search.equals("laptop"))
			   {
				   int value=30000;
				   System.out.println("enter your quantity");
				   quantitye2=K.nextInt();
				    Total_value_e2=(quantitye2*value);
				 System.out.println("Item=laptop\n"+"Total quantity="+quantitye2+" Total value="+Total_value_e2);
				 
			   }
			   else if(search.equals("mouse"))
			   {
				   int value=200;
				   System.out.println("enter your quantity in Kg");
				  quantitye3=K.nextInt();
				  Total_value_e3=(quantitye3*value);
				  System.out.println("Item=mouse\n"+"Total quantity="+quantitye3+" Total value="+Total_value_e3);
					  
			   }
			   else
			   {
				   System.out.println("Try again");
			   }
			   System.out.println("Do you wish to continue for yes enter 1 and exit 2");
			   cn=K.nextInt();
			   if(cn==2)
			   {
				   break;
			   }
			   else
			   {
				   continue yes1;
			   }
			
		   }
			   break;
			   
		   case "C":
			   yes3:  for(int i=1;i<=3;i++)
			   {
			   System.out.println("Enter to CLOTHES section");
			   System.out.println("search your items here");
			   search=K.nextLine();
			   if(search.equals("pant"))
			   {
				  int value=450;
				  System.out.println("enter your quantity");
				  quantityc1=K.nextInt();
				   Total_value_c1=(quantityc1*value);
				  System.out.println("Item=pant\n"+"Total quantity="+quantityc1+" Total value="+Total_value_c1);
				  
			   }
			   else if(search.equals("shirt"))
			   {
				   int value=500;
				   System.out.println("enter your quantity");
				   quantityc2=K.nextInt();
				    Total_value_c2=(quantityc2*value);
				 System.out.println("Item=shirt\n"+"Total quantity="+quantityc2+" Total value="+Total_value_c2);
				 
			   }
			   else if(search.equals("hoodie"))
			   {
				   int value=700;
				   System.out.println("enter your quantity in Kg");
				  quantityc3=K.nextInt();
				  Total_value_c3=(quantityc3*value);
				  System.out.println("Item=Oil packets\n"+"Total quantity="+quantityc3+" Total value="+Total_value_c3);
					  
			   }
			   else
			   {
				   System.out.println("Try again");
			   }
			   System.out.println("Do you wish to continue for yes enter 1 and exit 2");
			   cn=K.nextInt();
			   if(cn==2)
			   {
				   break;
			   }
			   else
			   {
				   continue yes3;
			   }
			   
			   
	        }
			   break;
			   
		   case "D" :
			   
			   yes4:  for(int i=1;i<=3;i++)
			   {
			   System.out.println("Enter to makeup section");
			   System.out.println("search your items here");
			   search=K.nextLine();
			   if(search.equals("makeup powder"))
			   {
				  int value=180;
				  System.out.println("enter your quantity");
				  quantitym1=K.nextInt();
				  Total_value_m1=(quantitym1*value);
				  System.out.println("Item=Oil packets\n"+"Total quantity="+quantitym1+" Total value="+Total_value_m1);
				  
			   }
			   else if(search.equals("lipstick"))
			   {
				   int value=100;
				   System.out.println("enter your quantity");
				   quantitym2=K.nextInt();
				   Total_value_m2=(quantitym2*value);
				 System.out.println("Item=Oil packets\n"+"Total quantity="+quantitym2+" Total value="+Total_value_m2);
				 
			   }
			   else if(search.equals("eye liner"))
			   {
				   int value=20;
				   System.out.println("enter your quantity in Kg");
				  quantitym3=K.nextInt();
				  Total_value_m3=(quantitym3*value);
				  System.out.println("Item=Oil packets\n"+"Total quantity="+quantitym3+" Total value="+Total_value_m3);
					  
			   }
			   else
			   {
				   System.out.println("Try again");
			   }
			   System.out.println("Do you wish to continue for yes enter 1 and exit 2");
			   cn=K.nextInt();
			   if(cn==2)
			   {
				   break;
			   }
			   else
			   {
				   continue yes4;
			   }
			   
         }
			   break;
			   
		   case "E":
			   int size1;
			   yes5:  for(int i=1;i<=3;i++)
			   {
			   System.out.println("Enter to Footwear section");
			   System.out.println("search your items here");
			   search=K.nextLine();
			   System.out.println("enter your size");
				  size1=K.nextInt();
			   if(search.equals("shoes"))
			   {
				  int value=450;
				  System.out.println("enter your quantity");
				  quantityf1=K.nextInt();
				  Total_value_f1=(quantityf1*value);
				  System.out.println("Item=Oil packets\n"+"Total quantity="+quantityf1+" Total value="+Total_value_f1);
				  
			   }
			   else if(search.equals("sandals"))
			   {
				   int value=400;
				   System.out.println("enter your quantity");
				   quantityf2=K.nextInt();
				   Total_value_f2=(quantityf2*value);
				 System.out.println("Item=Oil packets\n"+"Total quantity="+quantityf2+" Total value="+Total_value_f2);
				 
			   }
			   else if(search.equals("slippers"))
			   {
				   int value=150;
				   System.out.println("enter your quantity in Kg");
				  quantityf3=K.nextInt();
				  Total_value_f3=(quantityf3*value);
				  System.out.println("Item=Oil packets\n"+"Total quantity="+quantityf3+" Total value="+Total_value_f3);
					  
			   }
			   else
			   {
				   System.out.println("Try again");
			   }
			   System.out.println("Do you wish to continue for yes enter 1 and exit 2");
			   cn=K.nextInt();
			   if(cn==2)
			   {
				   break;
			   }
			   else
			   {
				   continue yes5;
			   }
			  
	      }
			   break;
			   
		   default:
			   System.out.println("sry cant reached out");
			   break;
			   
			   
	 }
		   
		   
		   
	}
}
class Value extends Order_type
{
	double Total_value;
	public void value()
	{
		 Total_value1  =Total_value_o+Total_value_m+Total_value_s;
		 quantity1=quantityg1+quantityg2+quantityg3;
		 Total_value2=Total_value_e1+Total_value_e2+Total_value_e3;
		 quantity2=quantitye1+quantitye2+quantitye3;
		 Total_value3=Total_value_c1+Total_value_c2+Total_value_c3;
		   quantity3=quantityc1+quantityc2+quantityc3;
		Total_value4=Total_value_m1+Total_value_m2+Total_value_m3;
		   quantity4=quantitym1+quantitym2+quantitym3;
		 Total_value5=Total_value_f1+Total_value_f2+Total_value_f3;
		   quantity5=quantityf1+quantityf2+quantityf3;
		Scanner a=new Scanner(System.in);
		System.out.println("oredered number");
		no=a.nextInt();
		System.out.println("ordered number="+no);
		quantity=quantity1+quantity2+quantity3+quantity4+quantity5;
		if(quantity>50)
		{
			System.out.println("your process will be delayed");
			
		}
		else
		{
			System.out.println("thanks for shopping");
		}
		Total_value=Total_value1+Total_value2+Total_value3+Total_value4+Total_value5;
		System.out.println("Total_value="+Total_value);
	}
}
public class Order {

	public static void main(String[] args)
	{
		Value v=new Value();
		v.details();
		v.type();
		v.value();
		
	}
}
