package asg10;

public class contractEmployee extends employee
{
	public contractEmployee(String name, String designation, String gender, int age, int pf, int gratuity, int salary)
	{
		super(name, designation, gender, age, pf, gratuity, salary);	
	}
	
	int contractDuration;
	
	public void setDuration(int duration) {this.contractDuration=duration;}
	
	public int getDuration() {return contractDuration;}
	
	public int calculateSalary()
	{
		return (salary-(pf+gratuity));
	}
	
	void disp()
	{
		System.out.println("Contract Duration : "+contractDuration);
	}

}
