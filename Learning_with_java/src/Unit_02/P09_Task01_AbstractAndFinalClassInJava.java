package Unit_02;


/*
 * Abstract Class:
 * -An abstract class must be declared with an abstract keyword
 * 
 * -Abstraction is a process of hiding the implementation details
 * -and showing only functionality to the user
 * 
 * -we can not make object of abstract class directly, but through derived class
 * 
 * 
 * -Abstract class may contain abstract and non-abstract methods
 * -(0-100%) abstract methods can be there
 * 
 * Final Class:
 * -The main purpose of using a class being declared as final is to prevent the class from being subclassed. 
 * -If a class is marked as final then no class can inherit any feature from the final class. 
 * -You cannot extend a final class. 
 * -If you try it gives you a compile time error. 
 */

abstract class Bike
{
	int a;
	
	Bike()
	{
		System.out.println("Inside Bike Constructor:"+a+"\n");
	}
	
	abstract void run();
	
	void display()
	{
		System.out.println("This is display method");
	}
}

class Honda4 extends Bike
{

	@Override
	void run() {
		System.out.println("Inside run method");
		
	}
	
}


public class P09_Task01_AbstractAndFinalClassInJava {

	public static void main(String[] args) {
		Bike obj=new Honda4();
		obj.run();
		obj.display();
		
		Super obj2=new Super();
		obj2.display();

	}

}

//Final Class
final class Super
{
	public int data=30;
	void display()
	{
		System.out.println(data);
	}
}


/*not possible
 
 public class Sub extents Super
 {
 	void display2()
 	{
 		display();
 	}
 }
 */