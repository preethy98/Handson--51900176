package com.hcl.features;

public class MyRunnable {
	/*public static void main(String[] args) {
	Runnable r=()->{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread is printed");
		}
	};
Thread t=new Thread(r);
t.start();
for(int i=0;i<10;i++)
{
	System.out.println("main thread is printed");
}
}*/
	public static void main(String[] args)
	{
	new Thread(()->{
			for(int i=0;i<10;i++)
			System.out.println("Child thread");    
	}).start();
	for(int i=0;i<10;i++)           //simplified execution using lambda expression
		System.out.println("Main thread");    
	}
}