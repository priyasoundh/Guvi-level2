import java.util.*;
import java.lang.*;
import java.io.*;
public class Repeated
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int c=0,count,b=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
	    {
	        count=0;
	        for(int j=0;j<n;j++)
	        {
	            if(i!=j)
	            {
	                if(a[i]==a[j])
	                {
	                    count++;
	                }
	            }
	        }
	        if(b<count)
	        {
	            b=count;
	            c=a[i];
	        }
	    }
		System.out.println(c);
	}
}
