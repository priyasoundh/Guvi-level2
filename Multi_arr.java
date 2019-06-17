import java.util.*;
import java.lang.*;
import java.io.*;
public class Multi_arr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int c;
		for(int i=0;i<n;i++)
		{
			c=1;
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					c=c*a[j];
				}
			}
			System.out.print(c+" ");
		}
	}
}
