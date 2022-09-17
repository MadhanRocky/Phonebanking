package Today;
public class GetName extends Thread  
{    
    /*public void run()  
    {    
        System.out.println("Thread is running...");    
    }    
    public static void main(String args[])  
    {   
          
       GetName t1=new GetName();    
        GetName t2=new GetName();     
        
      
        
        System.out.println("Name of t1: "+ t1.getName());    
        System.out.println("Name of t2: "+t2.getName());    
         
         
       /* t1.setName("Madhan");
        System.out.println("AFter changing name for t1:" +t1.getName());
        t2.setName("S");
        System.out.println("AFter changing name for t1:" +t2.getName());
        System.out.println("Name of t1: "+ t1.getName());    
        System.out.println("Name of t2: "+t2.getName());  
        
        t1.start();    
        t2.start(); }}*/
        
        public void run(){    
        	  for(int i=1;i<5;i++){   
        	     
        	    try{Thread.sleep(500);}
        	    catch(InterruptedException e)
        	    {
        	    	System.out.println(e);
        	    	}    
        	    System.out.println(i);    
        	  }    
        	 }    
        	 public static void main(String args[]){    
        	  GetName t1=new GetName();    
        	  t1.setName("Madhan");
              System.out.println("AFter changing name for t1:" +t1.getName());
        	     
        	  t1.start();    
        	      
        	 }    
        	
    }    
