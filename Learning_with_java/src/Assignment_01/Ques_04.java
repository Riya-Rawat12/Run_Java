package Assignment_01;

public class Ques_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three obj=new Three(2);
		Three obj2=new Three();
	}

}

class One

{

	One(int a1)
	{
		System.out.println("The value of a is "+a1);
	}
}



class Two extends One
{
	Two()
	{
		super(1);
		System.out.println("This is contructor two");
	}
}


class Three extends Two
{
	
	Three(int a)
	{
		System.out.println("The value of b is "+a);
	}
	
	Three()
	{
		System.out.println("This is constructor three ");
	}

}

