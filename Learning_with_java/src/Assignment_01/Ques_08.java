package Assignment_01;
import java.util.Scanner;
public class Ques_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		n=sc.nextInt();
		int []arr;
		arr=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=3;i<n-1;i++)
		{
			arr[i]=arr[i+1];
		}
		
		for(int i=0;i<n-1;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
