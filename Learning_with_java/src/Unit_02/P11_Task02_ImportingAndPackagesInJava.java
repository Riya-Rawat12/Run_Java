package Unit_02;

/*
 * A java package is a group of similar types of classes, interfaces and sub-packages
 * Package in java can be categorized in two form
 * --built-in package (lang,javax,swing,net)
 * --user-defined package
 * 
 * Package also helps to avoid class name collision
 * package also maintain access protection in java
 * Packages are named in reverse order of domain names
 * -unit01.javaproject.com --> "com.javaproject.unit01
 * 
 * import java.util.vector; //import the vector class from util package
 * import java.util.*       //import all the classes in util package
 * 
 * Static import:
 * -static import is a feature introduced in java (version>=5)
 * -it allows members defined in class as public static
 * -to be used in java code without specifying the class in which the 
 * -field is defined
 */

import static java.lang.System.*;
import static java.lang.Math.*;


public class P11_Task02_ImportingAndPackagesInJava {

	public static void main(String[] args) {
		out.println("Welcome to package");
		
		out.println(sqrt(4));
		System.out.println(pow(2,3));
		System.out.println(abs(6.3));
		
		ChildClass obj = new ChildClass();
		
		obj.accessData();

	}

}