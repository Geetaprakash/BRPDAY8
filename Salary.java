import java.util.Scanner;
class Salary
{
	double salary=10000;
	double bonus=1500;
	public void total()
	{
		double total=salary+bonus;
		System.out.println(total);
	}
}
public class EmployeeTotal extends Salary
{
	public static void main(String[] args) 
	{
		EmployeeTotal emptotal=new EmployeeTotal();
		emptotal.total();
		double total=emptotal.salary+emptotal.bonus; 
		System.out.println("the total salary os employee is:"+total);
	}

}