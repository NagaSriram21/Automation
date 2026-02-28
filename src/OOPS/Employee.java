package OOPS;

public class Employee {
	int EmpId;
	String Ename;
	String Ejob;
	int Esal;
	
   Employee(String Ename,int EmpId,String Ejob,int Esal)
	{
		this.Ename=Ename;
		this.EmpId=EmpId;
		this.Ejob=Ejob;
		this.Esal=Esal;
	}
   
	void Display() {
		   System.out.println("Employee Id is : " + EmpId);
		   System.out.println("Employee Name is : " + Ename);
		   System.out.println("Employee Job is : " + Ejob);
		   System.out.println("Employee Salary is : " + Esal);  
	}
	
	void show() {
		System.out.println("Next Employee Data : ");
		}

	public static void main(String[] args) {
		Employee Emp1=new Employee("rahul", 1, "Tester", 90000);
		Emp1.Display();
		Emp1.show();
		
		Employee Emp2=new Employee("Rohit", 2, "Tester", 85000);
		Emp2.Display();
		Emp2.show();

	}

}
