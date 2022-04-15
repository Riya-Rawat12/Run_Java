package Unit_02;


/*
 * An interface is a completely (100%) "abstract class"
 * that is used to group related methods with empty body
 * 
 * Need of interface?
 * multiple interface can be implemented at the same time in a class
 * 
 * 
 */


interface Animal
{
	public void animalSound();
	public void run();
}

interface Human
{
	public void humanSound();
	public void run();
}


public class P12_Task01_InterfaceInJava implements Animal {

	public static void main(String[] args) {
		
		species obj1=new species();
		obj1.animalSound();
		obj1.humanSound();
		obj1.run();
		
		C1 obj2 = new C1();
		obj2.funcA();
		obj2.funcB();

	}

	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}

//multiple interface can be implemented at the same time in a class
class species implements Animal, Human
{

	@Override
	public void humanSound() {
		System.out.println("We are inside humanSound method");
		
	}

	@Override
	public void animalSound() {
		System.out.println("We are inside animalSound method");
		
	}

	@Override
	public void run() {
		System.out.println("We are inside run method");
	}
	
}

interface A1
{
	void funcA();
}

interface B1 extends A1
{
	void funcB();
	
}


class C1 implements B1
{

	@Override
	public void funcA() {
		System.out.println("This is funcA from A1");
		
	}

	@Override
	public void funcB() {
		System.out.println("This is funcB from B1");
		
	}
	
}