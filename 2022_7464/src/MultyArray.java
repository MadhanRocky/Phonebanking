
public class MultyArray {
 public static void main(String args [])
 {
	 int sum=0;
	 int arry[][]= new int[3][3];
	 
	 
	 {
		 arry[0][0]=1;
		 arry[0][1]=2;
		 arry[0][2]=3;
		 arry[1][0]=4;
		 arry[1][1]=5;
		 arry[1][2]=6;
		 arry[2][0]=7;
		 arry[2][1]=8;
		 arry[2][2]=9;
		 };
		 for (int i = 0; i < arry.length; ++i) {
	            for(int j = 0; j < arry[i].length; ++j)
	 System.out.println("Lenghth of array" + arry[i][j]);
	          
	 
 }
		 
		  sum = arry[0][0] + arry[2][0];
          
          System.out.println("sum of K is :" +sum);
}
}