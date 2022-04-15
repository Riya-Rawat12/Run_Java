package Unit_02;

public class P11_Task01_AccessProtectionInJava {

	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();
		obj.showData();
		obj.accessData();
		
		AnotherClass obj2= new AnotherClass();
		obj2.display();

	}

}


class ParentClass
{
	int a =10 ; //default protection
	public int b=20; //can be accessed outside unit_02 package but within same project
	protected int c=20; //can only be accessed within same package
	private int d = 40; //within ParentClass only, not even in its sub-class
	
	
	void showData()
	{
		System.out.println("Inside ParentClass");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
	}
	
}

class ChildClass extends ParentClass
{
	void accessData()
	{
		System.out.println("Inside ChildClass");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		//System.out.println("d="+d); //private member 
	}
}

class AnotherClass
{
	void display()
	{
		ParentClass obj=new ParentClass();
		System.out.println("Inside AnotherClass");
		System.out.println("a="+obj.a);
		System.out.println("b="+obj.b);
		System.out.println("c="+obj.c);
	}
}