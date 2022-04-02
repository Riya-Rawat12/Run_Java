package Unit_01;

public class P2_Task02_ConstantsInJava {
	static final int n = 10;
    final int i=1;
    public static final float a = 2.34f; 
    //Visibility: Within Same Class and Any Package
    private static final int b = 4;
    //Visibility: Within Same Class
    protected final int c = 1;
    // Visibility: Within the Same Class and Same Package

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(n);
        System.out.println(i); 
        //Non-static field 'i' cannot be referenced from a static context
        final int x=20;
        x=10;                   
        //cannot assign a value to final variable x
        System.out.println(x); 
        //print the vale of x as 20
        System.out.println(c); 
        //Cannot access a non-static field c to static

	}
	 void display(){
	        System.out.println(i);
	        System.out.println(n);
	        System.out.println(c);
	        System.out.println(b);
	    }

}
