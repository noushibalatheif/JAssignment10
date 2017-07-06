package asg10;

public class employee
{
	String name;
	String designation;
	String gender;
	int age;
	int fine;
	int salary;
	public employee(String name,String designation,String gender,int age,int fine, int salary)
	{
		this.name=name;
		this.designation=designation;
		this.gender=gender;
		this.age=age;
		this.fine=fine;
		this.salary=salary;
	}
	
	public int calculatesalary()
	{
		return (salary-fine);
	}
	
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Designation : "+designation);
		System.out.println("Gender : "+gender);
		System.out.println("Age : "+age);
		System.out.println("Total Salary : "+calculatesalary());
 }

}
