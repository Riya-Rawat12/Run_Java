package Unit_03;
/*
 * MultiProcessing:
 * -Sequencial MultiProcessing
 * -Parallel MultiProcessing
 * -Concurrent Multiprocessing
 * 
 * MultiTasking:
 * -Sequential MultiTasking
 * -Parallel MultiTasking (Not Applicable)
 * -Concurrent MultiTasking
 * 
 */
public class P16_Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Main thread will execute C1.show() method and C2.show() method in sequence.
		
		C1 obj1=new C1();
		obj1.show();
		
		System.out.println("\n");
		
		C2 obj2=new C2();
		obj2.show();
		
		
		Thread t1 =new Thread (new T1(),"T1");
		Thread t2 =new Thread (new T2(),"T2");
		
		t1.start();
		t2.start();
		
		
	}

}


class C1
{
	
	void show()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+"-hey1");
		}
//		double i=0;
//		while(i<50000000)
//		{
//			i=i+0.001;
//		}
//		for(i=0;i<10;i++)
//		{
//			System.out.println(i+"-Hey1");
//		}
	}
}



class C2
{
	
	void show()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+"-hey2");
		}
	}
}


class T1 extends Thread
{
	public void run()
	{
		try {
			
			Thread.sleep(5000);
			System.out.println("Thread T1 done");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}

//class T1 implements Runnable{
//	
//	public void run()
//	{
//		for(int i=0;i<10;i++)
//		{
//			System.out.println(i+"-Hey1");
//		}
//	}
//}

class T2 implements Runnable{
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+"-Hey2");
		}
	}
}