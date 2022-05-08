package Assignment_01;
import java.util.Scanner;
public class Ques_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int Maruti_k10;
		int Zen_Astelo;
		int Wagnor;
		int Maruti_SX4;
		Scanner sc=new Scanner(System.in);
		city obj[]=new city[4];
		for(int i=0;i<4;i++)
		{
			
			name=sc.nextLine();
			Maruti_k10=sc.nextInt();
			Zen_Astelo=sc.nextInt();
			Wagnor=sc.nextInt();
			Maruti_SX4=sc.nextInt();
			sc.nextLine();
			obj[i]=new city(name,Maruti_k10,Zen_Astelo,Wagnor,Maruti_SX4);
		}
		
		int a=0,b=0,c=0,d=0;
		
		for(int i=0;i<4;i++)
		{
		a+=obj[i].car1;
		b+=obj[i].car2;
		c+=obj[i].car3;
		d+=obj[i].car4;
		}
		
		System.out.println("Total Maruti_k10 cars in all city are "+a);
		System.out.println("Total Zen_astelo cars in all city are "+b);
		System.out.println("Total Wagnor cars in all city are "+c);
		System.out.println("Total Maruti_SX4 cars in all city are "+d);
		
	}

}

class city
{
	
	String name;
	int car1,car2,car3,car4;
	city(String n,int c1,int c2,int c3,int c4)
	{
		name=n;
		car1=c1;
		car2=c2;
		car3=c3;
		car4=c4;
	}
}
