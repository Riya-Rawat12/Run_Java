package Assignment_01;

public class Ques_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1=new A();
		obj1.display();
		A obj2=new A();
		obj2.display();
		A obj3=new A();
		obj3.display();
		System.out.println("Total no. of function calls are "+A.count);
	}

}

class A

{
	
	static int count=0;
	void display()
	{
		System.out.println("This is for function calling counter");
		count++;
	}
	
	
}
