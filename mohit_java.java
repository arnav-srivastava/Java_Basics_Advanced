import java.util.Scanner;
class mohit_java{
	void func1()
	{
		try
		{
			int ar[]=new int[5];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter elements in array");
			for(int i=0;i<=5;i++)
			{
				ar[i]=sc.nextInt();
			}

			System.out.println("---------------Array elements------------------");
			for(int i=0;i<5;i++)
			{
				System.out.println(ar[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array problem occur ");
		}
		catch(Exception e)
		{
			System.out.println("division problem occur ");
		}	
			
		
	}
	void func2()
	{
		System.out.println("Second function is working");
	}
	public static void main(String args[])
	{
		mohit_java obj=new mohit_java();
		obj.func1();
		obj.func2();
	}
}