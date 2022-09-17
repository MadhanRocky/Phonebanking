import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("serial")
class Student implements Serializable{

	int rollno;
	String name;
	String class_section;
	long contact_no;
	String email_id;
	String attendance;
	
	public Student(int rollno, String name, String class_section , long contact_no, String email_id , String attendance)
	{
		this.rollno = rollno;
		this.name = name;
		this.class_section = class_section;
		this.contact_no = contact_no;
		this.email_id = email_id;
		this.attendance = attendance;
	}
	
	public String toString()
	{
		return "\nStudent Details :" + "\rollno: " + this.rollno + "\nName: " + this.name + "\nclass_section: " + this.class_section + "\nContact No: " + this.contact_no + "\nEmail-id: " + this.email_id + "\nattendance:" +this.attendance;
	}
	
}

public class StudentManagement
{	
	static void display(ArrayList<Student> al)
	{
		System.out.println("\n--------------Student List---------------\n");
		System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s", "rollno","Name","class_section","contact-no","Email-Id","attendance"));
		for(Student e : al)
		{
			System.out.println(String.format("%-5s%-20s%-10s%-15s%-10s",e.rollno,e.name,e.class_section,e.contact_no,e.email_id,e.attendance));
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		int rollno;
		String name;
		String class_section;
		long contact_no;
		String email_id;
		String attendance;
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> al = new ArrayList<Student>();
		
		File f = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		FileOutputStream fos = null;
		ObjectOutputStream oos =null;
		try{
			
			f = new File("N:/Java Work Space/Eclipse Programs/Student Management Tool/src/Student DataList1.txt");
			if(f.exists())
			{
				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);
				al = (ArrayList<Student>)ois.readObject();
			}
			
		}
		catch(Exception exp){
			System.out.println(exp);
		}
		do
		{
			System.out.println("\n****Welcome to the Student Management System***\n");
			System.out.println("1). Add Student to the DataBase\n" +
								"2). Search for Student\n" +
								"3). Edit Student details\n" +
								"4). Delete Student Details\n" +
								"5). Display all the student details\n" +
								"6). EXIT\n");
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:System.out.println("\nEnter the following details to ADD list:\n");
				System.out.println("Enter rollno:");
				rollno = sc.nextInt();
				System.out.println("Enter Name :");
				name = sc.next();
				System.out.println("Enter class_section :");
				class_section = sc.next();
				System.out.println("Enter Contact No :");
				contact_no = sc.nextLong();
				System.out.println("Enter Email-ID :");
				email_id = sc.next();
				System.out.println("Enter Attendance of the student:");
				attendance=sc.next();
				al.add(new Student(rollno, name, class_section, contact_no, email_id,attendance));
				display(al);
				break;
				
			case 2: System.out.println("Enter the student rollno to search :");
					rollno = sc.nextInt();
					int i=0;
					for(Student e: al)
					{
						if(rollno == e.rollno)
						{
							System.out.println(e+"\n");
							i++;
						}
					}
					if(i == 0)
					{
						System.out.println("\nStudent Details are not available, Please enter a valid rollno!!");
					}
					break;
			
			case 3: System.out.println("\nEnter the student rollno to EDIT the details");
					rollno = sc.nextInt();
					int j=0;
					for(Student e: al)
					{
						if(rollno == e.rollno)
						{	
							j++;
						do{
							int ch1 =0;
							System.out.println("\nEDIT Student Details :\n" +
												"1). rollno\n" +
												"2). Name\n" +
												"3). class_section\n" +
												"4). Contact No.\n" +
												"5). Email-ID\n" +
												"6). Attendance\n"+
												"7). GO BACK\n");
							System.out.println("Enter your choice : ");
							ch1 = sc.nextInt();
							switch(ch1)
							{
							case 1: System.out.println("\nEnter new student rollno:");
									e.rollno =sc.nextInt();
									System.out.println(e+"\n");
									break;
							
							case 2: System.out.println("\nEnter new Student Name:");
									e.name =sc.nextLine();
									System.out.println(e+"\n");
									break;
									
							case 3: System.out.println("\nEnter new class_section:");
									e.class_section =sc.next();
									System.out.println(e+"\n");
									break;
									
							case 4: System.out.println("\nEnter new Student Contact No. :");
									e.contact_no =sc.nextLong();
									System.out.println(e+"\n");
									break;
									
							case 5: System.out.println("\n1Enter new Student Email-ID :");
									e.email_id =sc.next();
									System.out.println(e+"\n");
									break;
									
							case 6: System.out.println("\nEnter the attendance of the student:");
							        e.attendance=sc.next();
							        System.out.println(e+"\n");
							        break;
									
							case 7: j++;
									break;
									
							default : System.out.println("\nEnter a correct choice from the List :");
										break;
							
							}
							}
						while(j==1);
						}
					}
					if(j == 0)
					{
						System.out.println("\nStudent Details are not available, Please enter a valid rollno!!");
					}
				
					break;
					
			case 4: System.out.println("\nEnter Student rollno to DELETE from the Database :");
					rollno = sc.nextInt();
					int k=0;
					try{
					for(Student e: al)
					{
						if(rollno == e.rollno)
						{
								al.remove(e);
								display(al);
								k++;
						}
					}
					if(k == 0)
					{
						System.out.println("\nStudent Details are not available, Please enter a valid rollno!!");
					}
					}
					catch(Exception ex){
						System.out.println(ex);
					}
					break;
			
			case 5: try {
					al = (ArrayList<Student>)ois.readObject();
				
				} catch (ClassNotFoundException e2) {
					
					System.out.println(e2);
				} catch (Exception e2) {
					
					System.out.println(e2);
				}
					display(al);
					break;
			
			case 6: try {
					fos = new FileOutputStream(f);
					oos = new ObjectOutputStream(fos);
					oos.writeObject(al);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				catch(Exception e2){
					e2.printStackTrace();
				}
				finally{
					try {
						fis.close();
						ois.close();
						fos.close();
						oos.close();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					
				}
					System.out.println("\nYou have chosen EXIT !! Saving Files and closing the tool.");
					sc.close();
					System.exit(0);
					break;
					
			default : System.out.println("\nEnter a correct choice from the List :");
						break;
			
			}
		}
		while(true);
	}
	
}