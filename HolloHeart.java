package vijay;

import java.util.Scanner;

public class HolloHeart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		    int i, j;
		    for (i = n/2; i <= n; i = i+2)
		    {
		    for (j = 1; j < n-i; j = j+2)
		        System.out.print(" ");
		     for (j = 1; j <= i; j++)
		       if(j==1 || j==i)
		        System.out.print("*");
		       else
		        System.out.print(" ");
		        for (j = 1; j <= n-i; j++)
		         System.out.print(" ");
		        for (j = 1; j <= i; j++)
		        if(j==1 || j==i)
		            System.out.print("*");
		            else
		            System.out.print(" ");
		            System.out.println();
		      }
		    for (i = n; i >= 0; i--)
		    {
		    for (j = i; j < n; j++)
		       System.out.print(" ");
		       for (j = 1; j <= ((i * 2) - 1); j++){
		        if(j==1 )
		           System.out.print("*");
		        else
		            System.out.print(" ");
		       }
		        for (j = ((i * 2)-1); j >=1 ; j--){
		        if(j==1 || j==(i*2))
		            System.out.print("*");
		        else
		            System.out.print("");
		        }
		        System.out.println();
		 }
	}

}
