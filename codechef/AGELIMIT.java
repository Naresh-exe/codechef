/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		//empty
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
	
		for(int i=0;i<T;i++)
		{
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int A=sc.nextInt();
		    if(A>=x && A<y)
		    {
		        System.out.println("yes");
		        
		    }
		    else{
		        System.out.println("no");
		    }
		}
	}
}
