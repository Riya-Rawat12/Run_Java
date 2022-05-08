package Assignment_01;
import java.util.Scanner;
public class Ques_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		String section;
		float percentage;
		float add=0,avg=0;
		
		System.out.println("Enter the Enteries of students");
		Scanner sc=new Scanner(System.in);
		Student obj[]=new Student[6];
		for(int i=0;i<6;i++)
		{
			name=sc.nextLine();
			age=sc.nextInt();
			section="A";
			percentage=sc.nextFloat();
			sc.nextLine();
			obj[i]=new Student(name,age,section,percentage);
		}
		
		for(int i=0;i<6;i++)
		{
			add+=obj[i].percentage;
		}
		
		avg=add/6;
		System.out.println("The percentage is "+avg);

	}

}

class Student
{
	String name;
	int age;
	float percentage;
	String section;
	
	Student(String n1,int a1,String s1,float p1)
	{
		this.name=n1;
		this.age=a1;
		this.section=s1;
		this.percentage=p1;
	}
	
}
