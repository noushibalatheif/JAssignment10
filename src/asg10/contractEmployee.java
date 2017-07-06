package asg10;

public class contractEmployee extends employee
{
	public contractEmployee(String name, String designation, String gender, int age, int fine, int salary)
	{
		super(name, designation, gender, age, fine, salary);	
	}
	
	int contractDuration;
	
	public void setDuration(int duration) {this.contractDuration=duration;}
	
	public int getDuration() {return contractDuration;}
	
	void disp()
	{
		System.out.println("Contract Duration : "+contractDuration);
	}

}
