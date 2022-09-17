class Member
 {
 Member()
 {
 System.out.println("Person constructor");
 }
 void nationality()
 {
 System.out.println("Indian");
 }
 }
 class Emp extends Member
 {
 Emp()
 {
 System.out.println("Emp constructor");
 }
 void company()
 {
 System.out.println("IBM");
 }
 
 }
 class Manager extends Emp
 {
 Manager()
 {
 System.out.println("Manager constructor");
 }
 void subordinates()
 {
 System.out.println(12);}
 
 }
 class Tour
 {
 public static void main(String arg[])
 {
 Manager n=new Manager();
 n.nationality();
 n.company();
 n.subordinates();
}
 }