package Assignment_01;

public class Ques_09_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj=new D();
		System.out.println(obj.a);//accessible
		//System.out.println(obj.b);-not accessible
		System.out.println(obj.c);//accessible
		System.out.println(obj.d);//accessible

	}

}

class D
{
 int a=9;//Default variable;
 private int b=10;//private variable-accessible only in this class
 protected int c=11;//protected variable-accessible in this package only
 public int d=12;//public variable-accessible everywhere

}
