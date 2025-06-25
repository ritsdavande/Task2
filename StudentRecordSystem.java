
import java.util.ArrayList;
import java.util.Scanner;

class Student{
	int id;
	String name;
	double marks;
	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
}



public class StudentRecordSystem {
	static ArrayList<Student>studentList=new ArrayList<Student>();
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		while (choice != 5)
{
			
			System.out.println("---Welcome to Student Management Record System---");
			System.out.println("1)Add Student");
			System.out.println("2)View Student Details");
			System.out.println("3)Update Student");
			System.out.println("4)Delete Student");
			System.out.println("5)Exit");
			System.out.println("Enter your Choice");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				
				addstudent();
				break;
			case 2:
				viewstudent();
				break;
			case 3:
				updatestudent();
				break;
			case 4:
				deletestudent();
				break;
			case 5:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid Choice");
				
			}
			
		}
		
	 
	}

	private static void deletestudent() {
		// TODO Auto-generated method stub
		System.out.println("Enter ID you want to delete");
		int id=sc.nextInt();
		
		for(int i=0;i<studentList.size();i++) {
			if(studentList.get(i).id==id) {
				studentList.remove(i);
				System.out.println("Record removed Successfully");
				return;
			}
		}
		System.out.println("data not found!..");
	}

	private static void updatestudent() {
		// TODO Auto-generated method stub
		System.out.println("Enter ID to you want to Update:");
		int id=sc.nextInt();
		
		for(Student s:studentList) {
			if(s.id==id) {
				System.out.println("Enter new name");
				String name=sc.next();
				
				System.out.println("Enter new marks");
				double marks=sc.nextDouble();
				s.name=name;
				s.marks=marks;
				System.out.println("Record Updated Successfully!!...");
				return;
			}
			//System.out.println(s);
		}
		System.out.println("Data Not Found!!...");
		
	}

	private static void viewstudent() {
		// TODO Auto-generated method stub
		for(Student s:studentList) {
			System.out.println(s);
			
		}
	}

	private static void addstudent() {
		// TODO Auto-generated method stub
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        studentList.add(new Student(id, name, marks));
        System.out.println("Student added successfully!");
      
		
	}
}