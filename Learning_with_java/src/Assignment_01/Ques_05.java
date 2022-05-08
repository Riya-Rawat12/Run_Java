package Assignment_01;
import java.util.Scanner;
public class Ques_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,department;
		int age,salary;
		float total=0;
		Employee obj[]=new Employee[8];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<8;i++)
		{
			name=sc.nextLine();
			age=sc.nextInt();
			department=sc.next();
			salary=sc.nextInt();
			sc.nextLine();
			obj[i]=new Employee(name,age,department,salary);
		}
		
		int total1=0,total2=0,total3=0,total4=0;
		
		for(int i=0;i<8;i++)
		{
			
			if(obj[i].department.equals("A"))
			{
				total1+=obj[i].salary;
			}
			if(obj[i].department.equals("B"))
			{
				total2+=obj[i].salary;
			}
			if(obj[i].department.equals("C"))
			{
				total3+=obj[i].salary;
			}
			if(obj[i].department.equals("D"))
			{
				total4+=obj[i].salary;
			}
		}
		System.out.println("The total salary of department A is "+total1);
		System.out.println("The total salary of department B is "+total2);
		System.out.println("The total salary of department C is "+total3);
		System.out.println("The total salary of department D is "+total4);
		sc.close();
	}

}

class Employee
{
	
	String name,department;
	int age,salary;
	
	Employee(String s1,int a1,String d1,int sa1)
	{
		this.name=s1;
		this.age=a1;
		this.department=d1;
		this.salary=sa1;
	}
}


