package Unit_02;


/*
 * syntax:
 * 
 * class subclass-name extends superclass-name
 * {
 * 	//methods and fields
 * }
 * 
 * Types of inheritance in java:
 * -single
 * -multilevel
 * -hierarchical
 * 
 * no multiple inheritance in java
 * 
 */
public class P08_Task01_InheritanceInJava {

	public static void main(String[] args) {
		
		Three g=new Three();
		g.methodOne();
		g.methodTwo();
		g.methodThree();
		
		Two two= new Two(1);
		D obj =new D(2);
		obj.methodFour();
		
	}

}


//multilevel inheritance
class One
{
	int a;
	One(int x)
	{
		System.out.println("One Constructor!");
	}
	
	public void methodOne()
	{
		System.out.println("FirstMethod");
	}
}

class Two extends One
{
	int b;
	Two(int x)
	{
		super(3);
		b=x;
		System.out.println("Two");
	}
	
	public void methodTwo()
	{
		System.out.println("secondMethod!");
	}
}

class Three extends Two
{
	int c;
	Three()
	{
		super(1);
		System.out.println("Three Constructor");
	}
	Three(int x)
	{
		super(1);
		c=x;
		System.out.println("Three");
	}
	
	public void methodThree()
	{
		System.out.println("thirdMethod!");
	}
}


//inheriting one class to multiple child
class A
{
	int a;
	
	A(int a1)
	{
		a=a1;
	}
	
	public void methodOne()
	{
		System.out.println(a);
	}
}


class B extends A
{
	int b;
	B(int x)
	{
		super(10);
		b=x;
		
	}
	
	public void methodTwo()
	{
		System.out.println(b);
	}
}

class C extends A
{
	int c;
	C()
	{
		super(10);
		c=10;
		
	}
	
	public void methodThree()
	{
		System.out.println(c);
	}
}

class D extends A
{
	int d;
	D(int d1)
	{
		super(d1);
		d=d1;
	}
	
	public void methodFour()
	{
		System.out.println(d);
	}
}