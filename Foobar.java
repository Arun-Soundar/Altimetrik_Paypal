package vijay;

import java.util.Scanner;

public class Foobar {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//int n=15;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
			
				if (n % 7 == 0 && n % 11 == 0) 
				{
					System.out.println("FooBar");
			    } else if (n % 7 == 0) 
			    {
				    System.out.println("Foo");
			    } else if (n % 11 == 0) 
			    {
				    System.out.println("Bar");
			    } else
			    {
			    	System.out.println("invalid number");// invalid number
			    }
	}
}


