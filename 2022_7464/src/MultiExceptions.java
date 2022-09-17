
public class MultiExceptions {


		  
	    public static void main(String[] args) {  
	    	int a= 10, b= 5;
	           try{    
	        	   int div= a/b;
	        	   System.out.println("Answer is:" +div);
	        	   
	               }      
	               catch(ArithmeticException e)  
	                  {  
	                   System.out.println("Arithmetic Exception occurs");  
	                  }    
	               catch(ArrayIndexOutOfBoundsException e)  
	                  {  
	                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
	                  }    
	               catch(Exception e)  
	                  {  
	                   System.out.println("Parent Exception occurs");  
	                  }           
	           finally {  
	               System.out.println("Please check the given vaalue ");  
	             }   
	               System.out.println("Thank you");    
	    }  
	}  

