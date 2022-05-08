package Assignment_01;
import java.util.Scanner;
public class Ques_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		C obj=new C(x);
	}

}

interface in1
{
	public void display(int p);
}

class testClass implements in1
{
	 public void display(int p)
	{
		 int f=0;
		for(int i=2;i<=p/2;i++)
		{
			if(p%i==0)
				f=1;
			break;
		}
		if(f==0)
		System.out.println(p+" is a prime no");
		if(f==1)
		System.out.println(p+" is not a prime no");
	}
}

class C extends testClass
{
   C(int x)
   {
	   super.display(x);
   }
   
}
